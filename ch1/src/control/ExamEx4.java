package control;

import java.util.Scanner;

public class ExamEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" 숫자 1 :  ");

        int a = Integer.parseInt(sc.nextLine());

        System.out.println(" 숫자 2 :  ");

        int b = Integer.parseInt(sc.nextLine());

        System.out.println(" 부호 :  ");

        String c = sc.nextLine();

        switch (c) {
            case "+":
                System.out.println(a + b);
                break;

            case "-":
                System.out.println(a - b);
                break;

            case "*":
                System.out.println(a * b);
                break;

            case "/":
                System.out.println(a / b);
                break;

        }

    }

}
