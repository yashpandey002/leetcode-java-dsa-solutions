import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 } };
        int[][] ans = new int[matrix.length][matrix.length];
        int rowLength = matrix.length;
        int colLength = matrix[0].length;
        int firstRow = 0;
        int lastRow = matrix.length - 1;
        int firstCol = 0;
        int lastCol = matrix[0].length - 1;

        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}