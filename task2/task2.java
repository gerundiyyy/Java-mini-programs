package task2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double A, B, C, D;
        int day = 1;

        System.out.println("Введи км в первый день A:");
        A = in.nextDouble();
        System.out.println("Введи процент наращивания км в день B:");
        B = in.nextDouble();
        System.out.println("Введи сколько в итоге должен пробежать спортсмен С:");
        C = in.nextDouble();
        D = A;
        while (D <= C) {
            D += B*D/100;
            day++;
            System.out.println("В день " + day + " спортсмен пробежит " + D + " км!");
        }
        in.close();
    }
}
