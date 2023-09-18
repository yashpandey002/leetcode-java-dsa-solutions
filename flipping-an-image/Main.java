import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] image = { { 1, 1, 0, 0 }, { 1, 0, 0, 1 }, { 0, 1, 1, 1 }, { 1, 0, 1, 0 } };
        int[] reversedImg;
        int[] invertedImg;
        for (int i = 0; i < image.length; i++) {
            reversedImg = reverseArr(image[i]);
            invertedImg = invertArr(reversedImg);
            image[i] = invertedImg;
            System.out.println(Arrays.toString(image[i]));
        }

        // return image;
    }

    public static int[] reverseArr(int[] arr) {
        int tmp;
        for (int i = 0; i < arr.length / 2; i++) {
            tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tmp;
        }

        return arr;
    }

    public static int[] invertArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                arr[i] = 1;
            else
                arr[i] = 0;
        }

        return arr;
    }
}