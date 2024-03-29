import java.util.Arrays;
import java.util.Scanner;
public class laba_6_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Длина массива: ");
        int n = scan.nextInt();
        double[] X = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("x(" + i + ")= ");
            X [i] = scan.nextDouble();
        }
        int k = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (k < 3) {
                if (X[i] < 0)
                    k++;
            }
            else
                break;
        }
        double mn = Double.POSITIVE_INFINITY;
        int in = -1;
        for (int i = 1; i < n; i+=2) {
            if ((X[i] % 2 == 0) && (X[i] < mn)) {
                mn = X[i];
                in = i;
            }
        }
        if(mn == Double.POSITIVE_INFINITY || in == -1)
            System.out.println("Минимальных чисел, подходящих условию, нет");
        else
            System.out.println("Минимальное значение" + mn);
        if(k==0)
            System.out.println("Отрицательных чисел нет");
        else {
            int sh = n - k - 1;
            double[] arr2 = new double[(int) n - k];
            for (int i = n - 1; i >= 0; i--) {
                if (k > 0) {
                    if (X[i] < 0) {
                        k--;
                        continue;
                    }
                    else {
                        arr2[sh] = X[i];
                        sh--;
                    }
                }
                else {
                    arr2[sh] = X[i];
                    sh--;
                }
            }
            System.out.println("Измененный массив");
            X = Arrays.copyOf(arr2, arr2.length);
            for (int i = 0; i < X.length; i++) {
                System.out.println("Номер элемента " + i + "     значение " + X[i]);
            }
        }
    }
}