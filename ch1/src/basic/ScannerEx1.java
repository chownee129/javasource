package basic;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {

        // 키보드에서 입력받기
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자입력하세요");
        string input = sc.next();
        System.out.printf("입력값 : %s", input);

    }
}
