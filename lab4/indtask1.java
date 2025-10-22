package lab4;

import java.util.Random;

public class indtask1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] array = new int[50];

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(20) - 9;
        }

        int posSum = 0;
        int negSum = 0;

       
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                posSum += array[i];
            }
        }

        
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                negSum += array[i];
            }
        }

        System.out.printf("Сумма положительных чисел: %d%n", posSum);
        System.out.printf("Сумма отрицательных чисел: %d%n",negSum);

        if (posSum > (negSum*-1)) System.out.printf("Сумма положительных чисел по модулю больше!");
        else if (posSum < (negSum*-1)) System.out.printf("Сумма отрицательных чисел по модулю больше!");
        else if (posSum == (negSum*-1)) System.out.printf("Сумма отрицательных и положительных чисел по модулю равна!");
    }
}
