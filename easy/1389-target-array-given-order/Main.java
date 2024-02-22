import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 3, 4 };
        int[] index = { 0, 1, 2, 2, 1 };
        // int[] ans = new int[nums.length];
        // for (int i = 0; i < index.length; i++) {
        // ans[index[i]] = nums[i];
        // }

        // System.out.println(Arrays.toString(ans));

        int n = nums.length;
        int ans[] = new int[n];
        List<Integer> l = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            l.add(index[i], nums[i]);
            System.out.println(
                    "The new element is " + nums[i] + " Added at the index " + index[i] + " And now array is: " + l);
        }
        System.out.println(l);
        // for (int i = 0; i < n; i++) {
        // ans[i] = l.get(i);
        // }
    }
}