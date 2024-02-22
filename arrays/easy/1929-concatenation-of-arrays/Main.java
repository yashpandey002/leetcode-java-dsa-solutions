import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 2, 1 };
        int numsLength = nums.length;
        int[] ans = new int[numsLength * 2];
        for (int i = 0; i < numsLength; i++) {
            ans[i] = nums[i];
            ans[i + numsLength] = nums[i];
        }

        System.out.println(Arrays.toString(ans));
    }
}
