import java.io.*;
import java.net.*;

class UDPServer {
    public static void main(String args[]) throws Exception
    {

        DatagramSocket serverSocket = new DatagramSocket(40303);

        byte[] receiveData = new byte[1024];
        byte[] sendData  = new byte[1024];

        while(true)
        {

            DatagramPacket receivePacket =
                    new DatagramPacket(receiveData, receiveData.length);
            serverSocket.receive(receivePacket);

            String sentence = new String(receivePacket.getData(),0,receivePacket.getLength());

            System.out.println("bytes from client: " + receivePacket.getLength());
            System.out.println("from client: " + sentence);

            InetAddress IPAddress = receivePacket.getAddress();

            int port = receivePacket.getPort();

            String capitalizedSentence = sentence.toUpperCase();

            sendData = capitalizedSentence.getBytes();

            DatagramPacket sendPacket =
                    new DatagramPacket(sendData, sendData.length, IPAddress, port);

            serverSocket.send(sendPacket);
        }
    }
}
