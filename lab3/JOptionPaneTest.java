package lab3;

import javax.swing.JOptionPane; // импорт класса JOptionPane

public class JOptionPaneTest {
    public static void main(String[] args) {
        String radiusStr;
        double radius, area;
        // чтение данных из диалогового окна ввода в переменную radiusStr
        radiusStr = JOptionPane.showInputDialog("Введите радиус круга");
        radius = Double.parseDouble(radiusStr);// преобразование String в double
        area = radius * radius * Math.PI;
        System.out.println("Площадь = " + area);
    }
}