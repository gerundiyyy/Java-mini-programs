package lab3;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;

public class TextFileScannerWithCatch {
    public static void main(String[] args) {
        int num1;
        double num2;
        String name;
        try {// выполнение алгоритма считывания и обработки полученных данных
            Scanner in = new Scanner(new File("lab3/in.txt"));
            while (in.hasNext()) {// пока есть символы в потоке
                num1 = in.nextInt();
                num2 = in.nextDouble();
                name = in.next();
                System.out.println(num1 + " " + num2 + " " + name + " ");
            }
            in.close();
        } // обработка возможных ошибок
        catch (FileNotFoundException ex) { // если файл не найден
            ex.printStackTrace(); // печать трассировки стека
        } catch (NoSuchElementException ex) {
            /*
             * нет значения для считывания или значение не соответствуют ожидаемому формату
             * (InputMismatchException является подклассом NoSuchElementException)
             */
            System.out.println("Input File is incorrect ...");
        }
    }
}