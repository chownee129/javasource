package basic;

public class Variable4 {

    public static void main(String[] args) {
        float score = 90.55f;
        float score1 = 50.12f;

        char ch1 = 'a';
        char ch2 = '가';

        System.out.printf("%c\n", ch1 + 1);
        System.out.printf("%d\n", ch1 + 1);

        System.out.printf("sum = %10.1f\n", (score + score1) / 2);
    }
}