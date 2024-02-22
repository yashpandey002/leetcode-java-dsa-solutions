import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int tmp = x;
        int rev = 0;
        int rem = 0;

        while (x > 0) {
            rem = x % 10;
            rev = (rev * 10) + rem;
            x /= 10;
        }
        System.out.println(x);
        System.out.println(rev);

        if (rev == tmp) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

        input.close();
    }
}