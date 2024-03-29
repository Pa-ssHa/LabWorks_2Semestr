import java.util.Scanner;

public class laba_9_1 {
    public static void main(String[]  args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Длина массива: ");
        int n = scan.nextInt();
        double[] X = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("x(" + i + ")= ");
            X [i] = scan.nextDouble();
        }
        int kol = nulkol(X);
        System.out.println("количество нулей: " + kol);
    }
    public static int nulkol(double[] X){
        int k =0;
        for( int i =0; i < X.length;i++)
            if(X[i] == 0)
                k++;
        return k;
    }
}
