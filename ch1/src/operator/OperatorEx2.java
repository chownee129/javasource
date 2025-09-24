package operator;

import java.util.Scanner;

public class OperatorEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자 입력 : ");

        int a = Integer.parseInt(sc.nextLine());

        System.out.print(a % 2 == 0 ? "짝수" : "홀수");

    }

}
