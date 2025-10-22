package lab4;

import java.util.Random;

public class indtask2 {
    public static void main(String[] args) {
        Random rnd = new Random();

        String[][] Refill = new String[2][5];
        Refill[0] = new String[] { "ул.Володарского", "ул.Партизанская", "ул.Комсомольская", "ул.Ленина",
                "ул.Рокоссовского" };

        for (int i = 0; i < Refill[0].length; i++) {
            int value = rnd.nextInt(1000);
            Refill[1][i] = String.valueOf(value);
            if (value < 500) {
                System.out.printf("%s: количество топлива ниже 500 (%d)%n", Refill[0][i], value);
            } else {
                System.out.printf("%s: количество топлива выше или равен 500 (%d)%n", Refill[0][i], value);
            }
        }
        System.out.println();
        for (int i = 0; i < Refill[0].length; i++) {
            int value = Integer.parseInt(Refill[1][i]);
            if (value > 500) {
                System.out.printf("Машины можно отправлять на %s%n", Refill[0][i]);
            }
        }
    }
}
