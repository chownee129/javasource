package control;

import java.util.Scanner;

public class EzamEx2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" 첫번째 숫자 입력 :  ");
        int a = Integer.parseInt(sc.nextLine());

        System.out.println(" 두번째 숫자 입력 :  ");
        int b = Integer.parseInt(sc.nextLine());

        System.out.println(" 세번째 숫자 입력 :  ");
        int c = Integer.parseInt(sc.nextLine());

        int min = a;

        if (min > b) {
            min = b;

        } else if (min > c) {
            min = c;

        }

        int max = a;

        if (max < b) {

            max = b;

        } else if (max < c) {
            max = c;

        }

        System.out.println(min, max);

    }

}
