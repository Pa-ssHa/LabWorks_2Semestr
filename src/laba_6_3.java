import java.util.Arrays;
import java.util.Scanner;
public class laba_6_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Длина массивов: ");
        int n = scan.nextInt();
        double[] X = new double[n];
        System.out.println("Первый массив");
        for (int i = 0; i < n; i++) {
            System.out.print("x(" + i + ")= ");
            X[i] = scan.nextDouble();
        }
        System.out.println("Второй массив");
        double[] Y = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("x(" + i + ")= ");
            Y[i] = scan.nextDouble();
        }
        int k = 0;
        double[] Z = new double[n];
        for (int i = 0; i < n; i++) {
            if ((X[i] + Y[i] + i) < 0) {
                Z[k] = X[i] + Y[i] + i;
                k++;
            }
        }
        if (k != 0) {
            Z = Arrays.copyOf(Z, k);
            System.out.println("Полученный массив");
            for (int i = 0; i < k; i++) {
                System.out.println("Номер элемента " + i + "     значение " + Z[i]);
            }
        }

        double in = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - 1 -i; j++) {
                if (X[j] > X[j + 1]) {
                    in = X[j];
                    X[j] = X[j + 1];
                    X[j+1] = in;
                }
            }
        }
        System.out.println("Отсортированный список");
        for (int i = 0; i < n; i++) {
            System.out.println("Номер элемента " + i + "     значение " + X[i]);
        }
    }
}
