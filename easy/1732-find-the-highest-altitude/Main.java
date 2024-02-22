public class Main {
    public static void main(String[] args) {
        int[] gain = { -5, 1, 5, 0, -7 };
        int currentSum = 0;
        int high = gain[0];
        for (int i = 0; i < gain.length; i++) {
            currentSum += gain[i];
            if (currentSum > high) {
                high = currentSum;
            }
        }

        // return high < 0 ? 0 : high;
        System.out.println(high < 0 ? 0 : high);
    }
}