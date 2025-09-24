package lab3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.ArrayList;

public class task1 {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);

        double leftBorder;
        double rightBorder;
        System.out.println("Введите левую границу: ");
        leftBorder = Double.parseDouble(args[0]);
        // leftBorder = in.nextDouble();
        System.out.println("Введите правую границу: ");
        rightBorder = Double.parseDouble(args[1]);
        // rightBorder = in.nextDouble();

        ArrayList<Double> numbers = new ArrayList<>();

        try {// выполнение алгоритма считывания и обработки полученных данных
            Scanner inFile = new Scanner(new File("lab3/in.txt"));
            while (inFile.hasNext()) {// пока есть символы в потоке
                double value = inFile.nextDouble();
                if (value > leftBorder && value < rightBorder) {
                    numbers.add(value);
                }
            } // обработка возможных ошибок
            inFile.close();
        } catch (FileNotFoundException ex) { // если файл не найден
            ex.printStackTrace(); // печать трассировки стека
        } catch (NoSuchElementException ex) {
            System.out.println("Input File is incorrect ...");
        }

        System.out.println("Считанные числа:");
        for (double num : numbers) {
             System.out.printf("%.2f \n", num); 
        }
        // in.close();
    }
}
