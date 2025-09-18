package task2;
import java.util.Scanner;

public class task1 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        double a,b,x,y,h;
        
        System.out.println("Давай посчитаем y=sin(x)-cos(x) на отрезке [a;b] с шагом h !");

        System.out.println("Введи a:");
        a = in.nextDouble();
        System.out.println("Введи b:");
        b = in.nextDouble();
        System.out.println("Введи h:");
        h = in.nextDouble();

        x = a;
        do{
            y = Math.sin(x)-Math.cos(x);
            System.out.println(x+y);
            x +=h;
        }while(x <= b);
        in.close();
    }
}
