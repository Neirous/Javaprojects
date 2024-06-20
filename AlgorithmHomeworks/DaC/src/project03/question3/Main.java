package project03.question3;
/**
 * @author Neirous
 * @version 1.0
 * File->settings->Editor->File and Code Templates->include->File Header
 */
import java.util.*;

public class Main {
    static List<List<Integer>> result = new ArrayList<>();

    public static void findSubarrays(int[] nums, int target) {
        List<Integer> current = new ArrayList<>();
        backtrack(nums, target, 0, 0, current);
    }

    public static void backtrack(int[] nums, int target, int index, int sum, List<Integer> current) {
        if (sum == target) {
            result.add(new ArrayList<>(current));
        }

        for (int i = index; i < nums.length; i++) {
            if (sum + nums[i] <= target) {
                current.add(nums[i]);
                backtrack(nums, target, i + 1, sum + nums[i], current);
                current.remove(current.size() - 1); //返回前一次状态前需要撤销当前状态变化
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int target = scanner.nextInt();

        findSubarrays(nums, target);

        for (List<Integer> list : result) {
            for (int num : list) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}