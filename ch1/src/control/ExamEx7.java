package control;

import java.util.Scanner;

public class ExamEx7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int money = 0;

        while (true) {
            System.out.println("번호 골라주세요");
            int a = Integer.parseInt(sc.nextLine());

            switch (a) {
                case 1:
                    System.out.println("입금액 : ");
                    int plus = Integer.parseInt(sc.nextLine());
                    money += plus;
                    System.out.printf("입금액 : %d ,  총 잔고 : %d\n", plus, money);

                    break;

                case 2:
                    System.out.println("출금액 :");
                    int minus = Integer.parseInt(sc.nextLine());
                    money -= minus;
                    System.out.printf("출금액 : %d ,  총 잔고 : %d\n", minus, money);

                    break;

                case 3:
                    System.out.printf("잔고 : %d\n", money);
                    break;

                case 4:
                    System.out.println("종료");
                    break;

                default:
                    break;

            }

        }

    }
}
