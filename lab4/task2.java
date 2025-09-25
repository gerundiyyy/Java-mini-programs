package lab4;

import java.util.Scanner;

public class task2 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);

        String[][] calendar = new String[2][];
        calendar[0] = new String[] {"Крыса","Корова","Тигр","Заяц","Дракон","Змея","Лошадь","Овца", "Обезьяна", "Петух", "Собака","Свинья"};
        calendar[1] = new String[]{"Зелёный","Красный", "Жёлтый", "Белый", "Чёрный"};

        System.out.print("Введите год: ");
        int userYear = in.nextInt();
        in.close();

        int Animal = (userYear% (calendar[0].length*calendar[1].length)) - 1;
        if (Animal>calendar[0].length) {
            Animal %= calendar[0].length;
        }

        int Color = Animal;
        if (Color > calendar[1].length) {
            Color %= calendar[1].length;
        }

        System.out.printf("Ваш год %d в Восточной календаре %s %s", userYear, calendar[1][Color], calendar[0][Animal]);   
    }
}
