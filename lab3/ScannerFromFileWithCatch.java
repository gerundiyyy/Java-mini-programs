package lab3;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ScannerFromFileWithCatch {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File("test.txt"));
        } catch (FileNotFoundException ex) {// если возникло исключение
            ex.printStackTrace();
        } // распечатать трассировку стека
    }
}