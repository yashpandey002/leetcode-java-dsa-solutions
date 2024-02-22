import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int[] num = { 9, 9, 9, 9 };
        int k = 99999;

        ArrayList<Integer> arrForm = new ArrayList<>(num.length);
        int i = 0;
        int currentSum = 0;
        int carry = 0;
        int numToSave = 0;
        while (k > 0 || i < num.length) {
            if (i < num.length) {
                currentSum = num[num.length - i - 1] + (k % 10);
            } else {
                currentSum = (k % 10);
            }

            numToSave = currentSum % 10;
            carry = currentSum / 10;

            arrForm.add(numToSave);

            k /= 10;
            k += carry;
            i++;
        }
        Collections.reverse(arrForm);

        System.out.println(arrForm);
    }
}