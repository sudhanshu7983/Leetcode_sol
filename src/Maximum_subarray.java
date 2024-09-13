import java.util.Scanner;
class maximum_subarray {
    public int maxSubArray(int[] nums) {
        int m = nums[0];
        int mn = nums[0];
        for (int i = 1; i < nums.length; i++) {
            m = Math.max(nums[i], m + nums[i]);
            mn = Math.max(m, mn);
        }
        return mn;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        maximum_subarray solution = new maximum_subarray();
        int result = solution.maxSubArray(nums);
        System.out.println (result);
        scanner.close();
    }
}