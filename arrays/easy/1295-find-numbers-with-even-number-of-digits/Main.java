public class Main {
    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 };

        int evenDigitCount = 0;
        for (int i = 0; i < nums.length; i++) {
            int digitCount = 0;
            int counted = nums[i];
            while (counted > 0) {
                digitCount++;
                counted = counted / 10;
            }

            if (digitCount % 2 == 0) {
                evenDigitCount++;
            }
        }
        System.out.println(evenDigitCount);
    }
}