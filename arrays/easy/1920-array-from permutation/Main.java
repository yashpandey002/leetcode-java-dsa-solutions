import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 1, 0 };
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = arr[arr[i]];
        }

        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Permuted array: " + Arrays.toString(ans));
    }
}