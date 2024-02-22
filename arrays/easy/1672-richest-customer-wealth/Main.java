import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] accounts = { { 1, 2, 3 }, { 3, 2, 1, 4 } };
        int currentWealth = 0;
        int maxWealth = 0;

        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                currentWealth += accounts[i][j];
            }
            System.out.println("Current Wealth is: " + currentWealth);
            if (currentWealth > maxWealth) {
                maxWealth = currentWealth;
            }
            currentWealth = 0;
        }

        System.out.println("Max wealth is: " + maxWealth);

    }
}