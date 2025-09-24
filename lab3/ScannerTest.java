package lab3;
import java.util.Scanner; // импортируем метода класса Scanner

public class ScannerTest {
    public static void main(String[] args) {
        // Объявляем переменные разных типов
        int num1;
        double num2;
        String str;
        // Создаем экземпляр класса Scanner с именем in для чтения из потока
        // System.in (клавиатуры)
        Scanner in = new Scanner(System.in);
        // Чтение входных данных с клавиатуры
        System.out.print("Enter an integer: "); // Вывод подсказки
        num1 = in.nextInt(); // Чтение целого значения
        System.out.print("Enter a floating point: ");
        num2 = in.nextDouble(); // Чтение значения типа double
        System.out.print("Enter a string: ");
        str = in.next(); // Чтение строки
        // Форматированный вывод
        System.out.printf("%s, Sum of %d & %.2f is %.2f%n", str, num1, num2, num1 + num2);
        // закрыть поток ввода
        in.close();
    }
}