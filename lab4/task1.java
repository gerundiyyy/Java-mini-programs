package lab4;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[][] rose = new String[2][8];
        rose[0] = new String[] { "N", "NE", "E", "SE", "S", "SW", "W", "NW" };

        for (int i = 0; i < rose[0].length; i++) {
            System.out.printf("Введите количество дней, В которые дул ветер с направлнием %s: ", rose[0][i]);
            rose[1][i] = in.next();
        }
        in.close();

        int minIndex = 0;
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < rose[1].length; i++) {
            try {
                int current = Integer.parseInt(rose[1][i].trim());
                if (current < minValue) {
                    minValue = current;
                    minIndex = i;
                }
            } catch (NumberFormatException e) {
                System.out.printf("Ошибка: значение '%s' не является числом.%n", rose[1][i]);
            }
        }

        System.out.printf("Стоит строить дом на %s направлении, т.к. ветер дует туда %d дней", rose[0][minIndex],
                minValue);

        System.out.println("\nНаправление | Дней");
        for (int i = 0; i < rose[0].length; i++) {
            System.out.printf("%11s | %s%n", rose[0][i], rose[1][i]);
        }
    }
}
