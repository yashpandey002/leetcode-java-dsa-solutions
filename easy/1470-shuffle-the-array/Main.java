import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 4, 3, 2, 1 };
        int n = 4;
        int[] ans = new int[nums.length];
        for (int i = 0; i < n; i++) {
            ans[i * 2] = nums[i];
            ans[(i * 2) + 1] = nums[i + n];
        }

        System.out.println(Arrays.toString(ans));
    }
}