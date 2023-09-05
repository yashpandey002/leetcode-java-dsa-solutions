
// import java.util.Arrays;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[5];

        System.out.print("Enter target: ");
        int target = input.nextInt();

        System.out.print("Enter nums array: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.print("[ " + i + " " + j + " ]");
                }
            }
        }

        input.close();
    }
}