package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class arr2 {
    public static void main(String[] args) {

        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;

        }
        System.out.println(Arrays.toString(arr));

        int[] tmp = new int[arr.length * 2];

        for (int i = 0; i < arr.length; i++) {

            tmp[i] = arr[i];

        }

        System.out.println(Arrays.toString(tmp));

        int[] tmp2 = new int[arr.length * 2];

        System.arraycopy(arr, 0, tmp2, 0, arr.length);
        System.out.println(Arrays.toString(tmp2));
    }

}
