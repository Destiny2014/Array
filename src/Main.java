import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        double min, max, sum = 0;

        System.out.println("Введите кол-во элементов в массиве");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        double[] a = new double[count];
        for (int i = 0; i < count; i++) {
            a[i] = Math.random();
            sum += a[i];
            System.out.println(a[i]);
        }
        min = a[0];
        max = a[0];
        for (int i = 1; i < count; i++) {
            if (a[i] < min)
                min = a[i];
            if (a[i] > max)
                max = a[i];
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        System.out.println("Average = " + (sum / count));

        // Через встроенные
        System.out.println("Min = " + Arrays.stream(a).min());
        System.out.println("Max = " + Arrays.stream(a).max());
        System.out.println("Average = " + Arrays.stream(a).average());
    }
}

