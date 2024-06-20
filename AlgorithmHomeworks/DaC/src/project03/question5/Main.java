package project03.question5;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static int n;
    static int[] numbers;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 读取输入的数字 N 和 N 个不同的数字
        n = scanner.nextInt();
        numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        List<Integer> current = new ArrayList<>();
        backtrack(0, 0, current);
    }

    // 回溯算法找到所有可能的子集并计算它们的和
    public static void backtrack(int index, int sum, List<Integer> current) {
        if (index == n) {
            if (contains(sum)) {
                printEquation(current, sum);
            }
            return;
        }

        // 包括当前数字
        current.add(numbers[index]);
        backtrack(index + 1, sum + numbers[index], current);

        // 不包括当前数字
        current.remove(current.size() - 1);
        backtrack(index + 1, sum, current);
    }

    // 检查数字是否在给定的数组中
    public static boolean contains(int target) {
        for (int num : numbers) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    // 输出等式
    public static void printEquation(List<Integer> current, int sum) {
        StringBuilder equation = new StringBuilder();
        for (int num : current) {
            equation.append(num).append("+");
        }
        equation.setLength(equation.length() - 1); // 移除最后一个 "+"
        equation.append("=").append(sum);
        System.out.println(equation);
    }
}
