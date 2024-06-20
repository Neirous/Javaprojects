package greedyalgorithm.question1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] home = new int[n];
        int[] post = new int[n];

        //录入住宅数据
        for (int i = 0; i < n; i++) {
            home[i] = scanner.nextInt();
        }

        int count = 1;
        post[0] = home[0]+1000;

        int lastPost = post[0];

        for (int i = 1; i < n; i++) {
            if (home[i] - lastPost > 1000) {
                post[count] = home[i]+1000;
                lastPost = home[i];
                count++;
            }
        }

        System.out.println(count);
        for (int i = 0; i < count; i++) {
            System.out.println(post[i]);
        }
    }
}
