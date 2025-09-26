package control;

import java.util.Scanner;

public class ContinueEx1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("(1)");
            System.out.println("(2)");
            System.out.println("(3)");

            System.out.println(" 선택하세요. 종료는 0");

            int a = Integer.parseInt(sc.nextLine());

            if (a == 0) {
                System.out.println("종료   ");
                break;

            } else if (a > 3) {
                System.out.println(" 메뉴 잘못선택");
                continue;

            }

            System.out.println("선택한 메뉴는 " + a);

        }

    }
}
