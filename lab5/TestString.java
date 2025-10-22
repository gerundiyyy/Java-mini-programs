package lab5;

public class TestString { // Save as "Hello.java" under "d:\myProject"
    public static void main(String[] args) {
        // объявление строк
        String firstStr = "Тестовый текст";
        String secondStr = new String("Тестовый текст");
        // Вычисление длины строки
        System.out.println("Длина строки firstStr " + firstStr.length());
        // поиск подстроки в строке
        String findText = "текст";
        System.out.println("В строке firstStr" +
                ((firstStr.indexOf(findText) > 0) ? " есть " : " отсутствует ") +
                " слово " + findText);
        // замена символов в строке
        String newStr = firstStr.replace(" ", "+");
        System.out.println("Новая строка:" + newStr);
        // сравнение строк
        System.out.print("Строки firstStr и secondStr ");
        if (firstStr.equals(secondStr))
            System.out.println("совпадают");
        else
        
            System.out.println("совпадают");
        // сколько раз встречается заданный символ в строке
        int count = 0;
        for (int i = 0; i < firstStr.length(); i++) {
            if (firstStr.charAt(i) == 'е')
                count++;
        }
        System.out.println("Cимвол е встречается в firstStr " + count + " раз.");
    }
}