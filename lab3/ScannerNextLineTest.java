package lab3;
import java.util.Scanner;
public class ScannerNextLineTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string (with space): ");
        String str = in.nextLine(); // чтение строки с пробелами
        System.out.printf("%s%n", str);
        in.close();
    }
}