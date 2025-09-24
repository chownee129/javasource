package basic;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("두자리 정수 입력 : ");
        String num = sc.nextLine();

        // "35" -> 35 변환방법
        int input = Integer.parseInt(num);
        System.out.println(input);
        System.out.println(input + 1);
        sc.close();
    }
}
