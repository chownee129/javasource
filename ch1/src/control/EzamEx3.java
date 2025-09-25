package control;

import java.util.Scanner;

public class EzamEx3 {
    public static void main(String[] args) {
        int a = 10030;

        Scanner sc = new Scanner(System.in);

        System.out.println(" 몇시간 일함? :  ");

        int time = Integer.parseInt(sc.nextLine());

        if (time >= 8) {
            System.out.println((a * 8) + (a * 1.5) * (time - 8));

        } else
            System.out.println(a * time);

    }

}
