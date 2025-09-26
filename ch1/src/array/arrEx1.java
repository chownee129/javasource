package array;

import java.util.Arrays;

public class arrEx1 {
    public static void main(String[] args) {
        int arr[] = new int[10];

        int arr1[] = { 88, 90, 12, 11, };

        char arr2[] = { 'a', 'b', 'c' };

        // 배열 안 내용 보고싶으면

        // Arrays.toString()

        System.out.println(Arrays.toString(arr));

        for (char c : arr2) {
            System.out.println(c);
        }

    }

}
