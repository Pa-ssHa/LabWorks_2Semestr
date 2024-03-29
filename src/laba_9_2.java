import java.util.Arrays;
import java.util.Scanner;

public class laba_9_2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Длина массивов: ");
        int n = scan.nextInt();
        double[] X = new double[n];
        System.out.println("Первый массив");
        for (int i = 0; i < n; i++) {
            System.out.print("X(" + i + ")= ");
            X[i] = scan.nextDouble();
        }
        System.out.println("Второй массив");
        double[] Y = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Y(" + i + ")= ");
            Y[i] = scan.nextDouble();
        }
        newarr(X,Y);
    }
    public static void newarr(double[] X, double[] Y){
        int k = 0;
        double[] Z = new double[X.length];
        for (int i = 0; i < X.length; i++)
            if ((X[i] + Y[i] + i) < 0) {
                Z[k] = X[i] + Y[i] + i;
                k++;
            }
        if (k != 0) {
            Z = Arrays.copyOf(Z, k);
            System.out.println("Полученный массив");
            for (int i = 0; i < k; i++)
                System.out.println("Z(" + i + ")= " + Z[i]);
        }
        else{
            System.out.println("массива нет");
        }
    }
}
