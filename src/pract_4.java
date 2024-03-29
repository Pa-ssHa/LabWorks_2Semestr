import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.*;

public class pract_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Длина массива: ");
        int n = scan.nextInt();
        double[] Y = new double[(int) n];
        int k = 0;
        double ng = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("x(" + i + ")= ");
            Y[i] = scan.nextDouble();
        }
        int v = 0;
        for (int i = 0; i < n; i++){
            if (abs(Y[i]) > 5)
                k++;
            if (k == 2) {
                ng = Y[i];
                v = i;
                break;
            }
        }
        if (k < 2)
            System.out.println("Второго числа по модулю больше пяти нет");
        else
            System.out.println("Нужное число " + ng  +   "  индекс "+v);
        double t = 0;
        for (int i = 0; i < n/2; i++) {
            t = Y[i];
            Y[i] = Y[n - i - 1];
            Y[n - i - 1] = t;
        }
        System.out.println("Массив перевернутый");
        for (int i = 0; i < n; i++) {
            System.out.println("Номер элемента " + i + "     значение " + Y[i]);
        }
        int c = 0;
        for (int i = 0; i < n; i += 2) {
            Y[c] = Y[i];
            c++;
        }
        Y = Arrays.copyOf(Y, c);
        System.out.println();
        n = (int) n/2;
        System.out.println("Массив с четными элементами");
        for (int i = 0; i < n; i++) {
            System.out.println("Номер элемента " + i + "     значение " + Y[i]);
        }
    }
}
