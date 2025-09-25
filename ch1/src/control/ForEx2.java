package control;

import java.util.Scanner;

public class ForEx2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;

        while (true) {

            System.out.println(" 숫자 입력 :  ");
            int num = Integer.parseInt(sc.nextLine());

            if (num == 0) {
                System.out.println(" 종료합니다");
                break;

            }
            sum += num;
            System.out.println(sum);
        }

    }

}
