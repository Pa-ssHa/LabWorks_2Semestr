import java.util.Arrays;
import java.util.Scanner;
public class pract_5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество строк матрицы: ");
        int n = scan.nextInt();
        System.out.print("Введите количество столбцов: ");
        int m = scan.nextInt();
        double[][] X = new double[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j< m; j++){
                System.out.print("x(" + i + ";"+j+")= ");
                X[i][j] = scan.nextDouble();
            }
        }
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X[i].length; j++) {
                System.out.printf("%6.2f    ", X[i][j]);
            }
            System.out.println();
        }
        double[] arr = new double[m];
        double mn, mx;
        int c =0;
        for(int i = 0; i < m; i++){
            mn = X[0][i];
            mx=X[0][i];
            for(int j = 0; j< n; j++){
                if(X[j][i]>mx)
                    mx = X[j][i];
                if(X[j][i]<mn)
                    mn = X[j][i];
            }
            if(mn!=mx){
                arr[c] = mx - mn;
                c++;
            }
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
