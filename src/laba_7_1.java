import java.util.Scanner;
public class laba_7_1 {
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
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%6.2f    ", X[i][j]);
            }
            System.out.println();
        }
        int k = 0;
        for(int i =0;i<n;i++){
            double mn = X[i][0];
            for(int j = 0; j< m; j++){
                if(X[i][j]<mn)
                    mn = X[i][j];
            }
            if(mn>i) {
                System.out.println("нужный номер строки: " + i + " минимальное значение: " + mn);
                k++;
            }
        }
        if(k==0)
            System.out.println("Нет подходящих строк");
    }
}
