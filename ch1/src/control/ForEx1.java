package control;

import java.util.Scanner;

public class ForEx1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" 숫자 입력 :  ");
        int num = Integer.parseInt(sc.nextLine());
        int last;
        int sum = 0;

        while (num != 0) {

            last = num % 10;
            sum += last;

            num = num / 10;

        }

        System.out.println(sum);

    }

}
