package basic;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {

        // 키보드에서 입력받기
        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 숫자 입력 : ");
        int num1 = sc.nextInt();

        System.out.println("연산자입력 : ");
        String op = sc.nextLine();

        System.out.println("두번째 숫자 입력 : ");
        int num2 = sc.nextInt();

        System.out.println(op);
        System.out.println(num1 + num2);
        sc.close();

    }
}
