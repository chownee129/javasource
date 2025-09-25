package control;

import java.util.Scanner;

public class DowhileEx1 {
    public static void main(String[] args) {

        int com = (int) (Math.random() * 100);

        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println(" 숫자 입력 :  ");
            num = Integer.parseInt(sc.nextLine());

            if (num > com) {
                System.out.println("down");

            } else if (num < com) {
                System.out.println("up");

            } else {
                System.out.println(" 정답 ");
            }

        } while (num != com);
        {

        }
    }
}
