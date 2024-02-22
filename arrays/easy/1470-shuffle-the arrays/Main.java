import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = { 2, 5, 1, 3, 4, 7 };
        int n = 3;
        int[] answer = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            // System.out.println(nums[i]);
            // System.out.println(nums[i + n]);
            if (i % 2 == 0) {
                answer[i] = nums[i];
            } else {
                answer[i + 1] = nums[i + n];
            }
        }
        System.out.println(Arrays.toString(answer));
    }
}