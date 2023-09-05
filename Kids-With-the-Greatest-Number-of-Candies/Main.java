import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] candies = { 2, 3, 5, 1, 3 };
        int extraCandies = 3;
        boolean[] result = new boolean[candies.length];
        // ArrayList<Boolean> result = new ArrayList<Boolean>(candies.length);

        int maxCandies = candies[0];
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > maxCandies) {
                maxCandies = candies[i];
            }
        }
        System.out.println("Max candies are: " + maxCandies);

        for (int i = 0; i < result.length; i++) {
            if ((candies[i] + extraCandies) >= maxCandies) {
                result[i] = true;
            } else {
                result[i] = false;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}