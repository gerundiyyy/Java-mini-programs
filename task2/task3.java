package task2;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;

        System.out.println("Введите натуральный отрезок [a,b]");
        while (true) {
            System.out.println("a= ");
            a = in.nextInt();
            System.out.println("b= ");
            b = in.nextInt();

            if (a > 0 && b > 0 && a < b) {
                break;
            } else
                System.out.println("Неверный ввод!");
        }

        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) System.out.println("Чётное число на отрезке: "+ i);
        }
        in.close();
    }
}
