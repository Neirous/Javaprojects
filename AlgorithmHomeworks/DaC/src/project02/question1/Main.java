package project02.question1;

import java.util.Scanner;

public class Main {
    private static final int n = 100;
    private static final int[][] standard = {
            { 5, -1, -2, -1, -3 },
            { -1, 5, -3, -2, -4 },
            { -2, -3, 5, -2, -2 },
            { -1, -2, -2, 5, -1 },
            { -3, -4, -2, -1, 0 }
    };

    private static int findLocation(char a) {
        if (a == 'A') return 0;
        else if (a == 'C') return 1;
        else if (a == 'G') return 2;
        else if (a == 'T') return 3;
        else  return 4;
    }

    private static int max(int a, int b, int c) {
        int max = Math.max(a, b);
        return Math.max(max, c);
    }

    private static int dynamicProgramming(String gene1, String gene2, int n1, int n2) {
        int[][] dp = new int[n + 1][n + 1];

        for (int i = 1; i <= n1; i++) {
            dp[i][0] = dp[i - 1][0] + standard[findLocation(gene1.charAt(i - 1))][4];
        }

        for (int i = 1; i <= n2; i++) {
            dp[0][i] = dp[0][i - 1] + standard[findLocation(gene2.charAt(i - 1))][4];
        }

        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                int case1 = dp[i - 1][j] + standard[findLocation(gene1.charAt(i - 1))][4];
                int case2 = dp[i][j - 1] + standard[findLocation(gene2.charAt(j - 1))][4];
                int case3 = dp[i - 1][j - 1] + standard[findLocation(gene1.charAt(i - 1))][findLocation(gene2.charAt(j - 1))];
                dp[i][j] = max(case1, case2, case3);
            }
        }

        return dp[n1][n2];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        String gene1 = scanner.next();
        int n2 = scanner.nextInt();
        String gene2 = scanner.next();

        int a = dynamicProgramming(gene1, gene2, n1, n2);
        int b = dynamicProgramming(gene2, gene1, n2, n1);
        int c = Math.max(a, b);

        System.out.println(c);
    }
}

