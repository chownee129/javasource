package control;

public class EzamEx5 {
    public static void main(String[] args) {

        while (true) {

            int dice1 = (int) (Math.random() * 6) + 1;
            int dice2 = (int) (Math.random() * 6) + 1;

            if (dice1 + dice2 == 5) {

                System.out.printf("%d + %d 합이 5입니다\n", dice1, dice2);
                break;

            } else {
                System.out.printf("%d, %d\n", dice1, dice2);
                continue;

            }

        }
    }

}
