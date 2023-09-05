import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int[] ans = new int[nums.length];
        int sum = 0;
        // int[] tmpArr;

        for (int i = 0; i < nums.length; i++) {
            // tmpArr = new int[i + 1];
            // for (int j = 0; j < tmpArr.length; j++) {
            // tmpArr[j] = nums[j];
            // }
            // ans[i] = arrSum(tmpArr);
            ans[i] = nums[i] + sum;
            sum += nums[i];
        }

        System.out.println(Arrays.toString(ans));
    }

    static int arrSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }
}