package control;

import java.util.Scanner;

public class IfEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" 점수 : ");

        int s = Integer.parseInt(sc.nextLine());
        char g = ' ';
        char opt = ' '; // 'opt' 변수를 초기화합니다.

        if (s >= 90) {
            g = 'A'; // 문자는 작은따옴표를 사용합니다.
            if (s >= 98) {
                opt = '+';
            } else if (s >= 94) {
                opt = '0';
            } else {
                opt = '-';
            }
        } else if (s >= 80) {
            g = 'B';
            if (s >= 88) {
                opt = '+';
            } else if (s >= 84) {
                opt = '0';
            } else {
                opt = '-';
            }
        } else { // 80점 미만일 경우
            g = 'C';
            opt = ' '; // 기본값으로 설정
        }

        System.out.println(g + "" + opt); // 문자들을 문자열로 연결하여 출력합니다.
    }
}