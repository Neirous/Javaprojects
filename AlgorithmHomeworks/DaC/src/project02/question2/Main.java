package project02.question2;

/**
 * @author Neirous
 * @version 1.0
 * File->settings->Editor->File and Code Templates->include->File Header
 */

import java.util.Scanner;

public class Main {

    static char[] a = new char[100];
    static char[] b = new char[100];
    static int[][] dp = new int[100][100];
    static int len1, len2;

    public static void dP() {
        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                if (a[i - 1] == b[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else if (dp[i - 1][j] > dp[i][j - 1]) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i][j - 1];
                }
            }
        }
    }

    public static void ldP() {
        int i = len1;
        int j = len2;
        int z = 0;
        char[] c = new char[100];
        while (i != 0 && j != 0) {
            if (a[i - 1] == b[j - 1]) {
                c[z++] = a[i - 1];
                i--;
                j--;
            } else if (dp[i - 1][j] < dp[i][j - 1]) {
                j--;
            } else {
                i--;
            }
        }
        System.out.println("最长公共子序列长度为：" + dp[len1][len2]);
        System.out.print("最长公共子序列是");
        for (int k = z - 1; k >= 0; k--) {
            System.out.print(c[k]);
        }
        System.out.println();
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第一个字符序列:");
        a = scanner.next().toCharArray();
        System.out.println();
        System.out.print("请输入第二个字符序列:");
        b = scanner.next().toCharArray();
        System.out.println();
        dp = new int[100][100];
        len1 = a.length;
        len2 = b.length;
        String st1 = new String();
        System.out.println("第一个字符序列：" + new String(a));
        System.out.println("第二个字符序列：" + new String(b));

        dP();
        ldP();
    }
}
