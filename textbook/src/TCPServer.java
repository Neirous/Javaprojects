import java.io.*;
import java.net.*;

class TCPServer {
    public static void main(String argv[]) throws Exception
    {
        String clientSentence;
        String capitalizedSentence;

        ServerSocket welcomeSocket = new ServerSocket(40303);

        while(true) {

            Socket connectionSocket = welcomeSocket.accept();
            BufferedReader inFromClient =
                    new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
            DataOutputStream  outToClient =
                    new DataOutputStream(connectionSocket.getOutputStream());


            clientSentence = inFromClient.readLine();
            System.out.println("from client: " + clientSentence);
            capitalizedSentence = clientSentence.toUpperCase() + '\n';

            outToClient.writeBytes(capitalizedSentence);
            connectionSocket.close();
        }
    }
} 