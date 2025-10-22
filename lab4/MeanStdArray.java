package lab4;

public class MeanStdArray {
    public static void main(String[] args) {
        int[] marks = { 74, 43, 58, 60, 90, 64, 70 };
        int sum = 0;
        int count = marks.length;
        for (int i = 0; i < count; ++i) {
            sum += marks[i];
        }
        double mean = (double) sum / count;
        System.out.printf("Mean is %.2f%n", mean);
    }
}
