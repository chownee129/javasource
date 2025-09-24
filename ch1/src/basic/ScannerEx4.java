package basic;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {

        // 키보드에서 입력받기
        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 숫자 입력 : ");

        int input1 = Integer.parseInt(sc.nextLine());

        System.out.println("연산자입력 : ");
        String op = sc.nextLine();

        System.out.println("두번째 숫자 입력 : ");
        int input2 = Integer.parseInt(sc.nextLine());

        // float a = Flaot.parseFloat(sc.nextLine())
        // double a - Double.parseDouble(sc.nextLine())

        System.out.println(input1 + input2 + op);
        sc.close();

    }
}
