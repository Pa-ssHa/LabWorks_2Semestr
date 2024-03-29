import java.util.Scanner;

public class df {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите длину квадратной матрицы: ");
        int n = scan.nextInt();
        double[][] X = new double[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j< n; j++){
                System.out.print("x(" + i + ";"+j+")= ");
                X[i][j] = scan.nextDouble();
            }
        }
        for(int i = 0; i < n-1; i++)
            for(int j = 0; j <n-1-i;j++)
                X[i][j]=0;
        System.out.println("полученный массив:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%6.2f    ", X[i][j]);
            }
            System.out.println();
        }
    }
}
