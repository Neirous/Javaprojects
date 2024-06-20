package com.neirous.project.test;

import java.util.*;

public class test01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        List<List<Integer>> permutations = new ArrayList<>();
        boolean[] used = new boolean[n+1];
        List<Integer> current = new ArrayList<>();
        generatePermutations(n, permutations, used, current);

        for (List<Integer> permutation : permutations) {
            for (int num : permutation) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    private static void generatePermutations(int n, List<List<Integer>> permutations, boolean[] used, List<Integer> current) {
        if (current.size() == n) {
            permutations.add(new ArrayList<>(current));
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (!used[i]) {
                used[i] = true;
                current.add(i);
                generatePermutations(n, permutations, used, current);
                current.remove(current.size() - 1);
                used[i] = false;
            }
        }
    }
}