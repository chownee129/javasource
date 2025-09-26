package array;

import java.util.Arrays;

public class Ex4 {

    public static void main(String[] args) {

        int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        for (int k = 0; k < 100; k++) {

            for (int i = 0; i < 9; i++) {

                int tmp;
                tmp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = tmp;

            }

            System.out.println(Arrays.toString(arr));

        }
    }
}