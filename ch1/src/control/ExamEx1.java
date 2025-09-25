package control;

import java.util.Scanner;

public class ExamEx1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" 년도 입력 :  ");

        int year = Integer.parseInt(sc.nextLine());

        System.out.println((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? "윤년" : "평년");

    }

}
