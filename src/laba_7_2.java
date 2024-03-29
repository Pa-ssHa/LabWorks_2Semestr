import java.util.Arrays;
import java.util.Scanner;
public class laba_7_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Начало итервала: ");
        double A = scan.nextDouble();
        System.out.print("Конец интервала: ");
        double B = scan.nextDouble();
        System.out.print("Введите количество строк матрицы: ");
        int n = scan.nextInt();
        System.out.print("Введите количество столбцов: ");
        int m = scan.nextInt();
        double[] arr = new double[n];
        double[][] X = new double[n][m];
        int c = 0;
        for (int i = 0; i < n; i++) {
            int k = 0;
            double s = 0;
            for (int j = 0; j < m; j++) {
                System.out.print("x(" + i + ";" + j + ")= ");
                X[i][j] = scan.nextDouble();
                if (X[i][j] >= A && X[i][j] <= B) {
                    s += X[i][j];
                    k++;
                }
            }
            if (k != 0) {
                arr[c] = s;
                c++;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%6.2f    ", X[i][j]);
            }
            System.out.println();
        }
        if (c == 0)
            System.out.println("Элементов подходящих нет");
        else {
            arr = Arrays.copyOf(arr, c);
            System.out.println("полученный массив");
            for (int i = 0; i < c; i++)
                System.out.println("arr(" + i + ")= " + arr[i]);
        }
    }
}
