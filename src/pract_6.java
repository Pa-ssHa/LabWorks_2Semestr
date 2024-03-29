import java.util.Scanner;

public class pract_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите длину квадратной матрицы: ");
        int n = scan.nextInt();
        double[][] X = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("x(" + i + ";" + j + ")= ");
                X[i][j] = scan.nextDouble();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%6.2f    ", X[i][j]);
            }
            System.out.println();
        }
        double s = 0;
        int in = -1;
        for (int i = 1; i < n; i += 2) {
            for (int j = 0; j < n; j++) {
                if (Math.rint(X[j][i]) != X[j][i])
                    in = i;
                    s += X[j][i];
            }
        }
        if (in  == -1)
            System.out.println("подходящей суммы нет, массив не изменен");
        else {
            for (int i = 0; i < n; i++) {
                for (int j = n - i; j < n; j++)
                    X[i][j] = s;
            }
            System.out.println("полученный массив:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.printf("%6.2f    ", X[i][j]);
                }
                System.out.println();
            }
        }
    }
}

