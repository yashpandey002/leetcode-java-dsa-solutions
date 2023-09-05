public class Main {
    public static void main(String[] args) {
        int[] nums = { 8, 1, 2, 2, 3 };
        int[] ans = new int[nums.length];

        for (int i = 0; i < ans.length; i++) {
            int count = 0;
            for (int j = 0; j < ans.length; j++) {
                if (nums[j] < nums[i]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}