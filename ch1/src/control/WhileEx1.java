package control;

public class WhileEx1 {
    public static void main(String[] args) {
        int a = 1, b = 1;

        while (a <= 9) {

            while (b <= 9) {
                System.out.printf("%d * %d = %d\n", a, b, a * b);

                b++;
            }

            a++;

        }
    }

}
