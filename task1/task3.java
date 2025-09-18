package task1;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Month;

        while (true) {
                System.out.println("Введите номер месяца или 0, если хотите выйти из программы: ");
                Month = in.nextInt();
            switch (Month) {
                case 1:
                    System.out.println("Это январь!");
                    break;
                case 2:
                    System.out.println("Это февраль!");
                    break;
                case 3:
                    System.out.println("Это март!");
                    break;
                case 4:
                    System.out.println("Это апрель!");
                    break;
                case 5:
                    System.out.println("Это май!");
                    break;
                case 6:
                    System.out.println("Это июнь!");
                    break;
                case 7:
                    System.out.println("Это июль!");
                    break;
                case 8:
                    System.out.println("Это август!");
                    break;
                case 9:
                    System.out.println("Это сентябрь!");
                    break;
                case 10:
                    System.out.println("Это октябрь!");
                    break;
                case 11:
                    System.out.println("Это ноябрь!");
                    break;
                case 12:
                    System.out.println("Это декабрь!");
                    break;
                case 0:
                    System.out.println("Выхожу из программы...");
                    break;
                default:
                    System.out.println("Такого месяца не знаю :(");
                    break;
            }
            if(Month == 0) break;
        }
        in.close();
    }
}
