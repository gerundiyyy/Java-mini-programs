package lab4;

import java.util.Random;

public class task3 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            int num;
            boolean isUnique;

            do {
                num = rnd.nextInt(20) + 1;
                isUnique = true;

                for (int j = 0; j < i; j++) {
                    if (array[j] == num) {
                        isUnique = false;
                        break;
                    }
                }
            } while (!isUnique);

            array[i] = num;
        }

        for (int i = 0; i < array.length; i++)
        {
            System.out.printf("array[%d]=%d\n",i,array[i]);
        } 
    }
}
