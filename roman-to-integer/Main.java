import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Roman number: ");
        String s = input.next();
        char[] romanSymbols = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
        int[] romanValues = { 1, 5, 10, 50, 100, 500, 1000 };
        s = s.toUpperCase();
        int romanValue = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < 7; j++) {
                if (s.charAt(i) == romanSymbols[j]) {
                    romanValue += romanValues[j];
                }
            }
        }
        System.out.println(romanValue);

        input.close();
    }
}