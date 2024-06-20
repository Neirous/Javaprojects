package greedyalgorithm.question4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Competition[] competitions = new Competition[n];

        for (int i = 0; i < n; i++) {
            competitions[i] = new Competition();
            competitions[i].start = scanner.nextInt();
            competitions[i].end = scanner.nextInt();
        }

        Tools tools = new Tools();
        tools.sortEnd(competitions, 0, n - 1);
        System.out.println(tools.countNum(competitions));
        for (Competition i : competitions) {
            System.out.println("" + i.start + " " + i.end);
        }
    }
}

class Competition {
    int start;
    int end;

}

class Tools {
    public void swap(Competition[] arr, int a, int b) {
        Competition temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public void sortEnd(Competition[] competitions, int l, int r) {
        if (l >= r) return;
        int i = l - 1, j = r + 1;
        int k = competitions[l + r >> 1].start;

        while (i < j) {
            do i++; while (competitions[i].start > k);
            do j--; while (competitions[j].start < k);
            if (i < j) swap(competitions, i, j);
        }
        sortEnd(competitions, l, j);
        sortEnd(competitions, j + 1, r);
    }

    public int countNum(Competition[] competitions) {
        int count = 1;
        for (int i = 0, j = i + 1; i < competitions.length && j < competitions.length; ) {
            if (competitions[j].end > competitions[i].start) {
                j++;
                continue;
            } else {
                i = j;
                j++;
                count++;
            }
        }
        return count;
    }
}
