import java.util.Scanner;
public class laba_7_3 {
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
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%6.2f    ", X[i][j]);
            }
            System.out.println();
        }
        double sg, sv;
        for(int i = 0; i < n; i++){
            sg =0;
            sv =0;
            for(int j = 0; j< n; j++){
                sg += X[i][j];
                sv += X[j][i];
            }
            X[i][i] = sg - sv;
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
