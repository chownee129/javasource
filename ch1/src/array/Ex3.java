package array;

public class Ex3 {
    public static void main(String[] args) {

        int arr[] = { 99, 12, 44, 66, 77, 88, 100 };

        int max = arr[0], min = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];

            }

            if (arr[i] < min) {

                min = arr[i];

            }
        }

        System.out.println(max);
        System.out.println(min);

    }

}
