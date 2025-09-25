package control;

import java.util.Scanner;

public class SwitchEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" 도원경 사냥터 : ");

        int mon = Integer.parseInt(sc.nextLine());

        if (mon <= 3) {
            System.out.println("봄");

        } else if (mon <= 6) {
            System.out.println("여름");
        } else if (mon <= 9) {
            System.out.println("가을양");
        } else
            System.out.println("겨울");
    }

}