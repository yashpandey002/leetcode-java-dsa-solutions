class Main {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];
        int oddCount = 0;

        for (int i = 0; i < indices.length; i++) {
            increment(matrix, m, n, indices[i][0], 'r');
            increment(matrix, m, n, indices[i][1], 'c');
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 != 0) {
                    oddCount++;
                }
            }
        }

        return oddCount;
    }

    public static void increment(int[][] matrix, int m, int n, int index, char incrementType) {
        if (incrementType == 'r') {
            for (int i = 0; i < n; i++) {
                matrix[index][i] += 1;
            }
        } else if (incrementType == 'c') {
            for (int i = 0; i < m; i++) {
                matrix[i][index] += 1;
            }
        }
    }
}