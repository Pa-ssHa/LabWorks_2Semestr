import java.util.Scanner;

public class laba_6_1 {
    public static void main(String[] args){
        int k = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Длина массива: ");
        int n = scan.nextInt();
        System.out.print("Начало итервала: ");
        double start = scan.nextDouble();
        System.out.print("Конец интервала: ");
        double end = scan.nextDouble();
        double [] X = new double[n];
        for(int i =0; i < n; i++){
            System.out.print("x(" + i + ")= ");
            X [i] = scan.nextDouble();
            if ( X[i]==0 )
                k+=1;
            }
        System.out.println("Элементы интервала [A;B]");
        int f = 0;
        for(int i =0; i < n; i++) {
            if ((start <= X[i]) && (end >= X[i])) {
                f = 1;
                System.out.println("элемент: " + i + "   значение массива: " + X[i]);
            }
        }
        if (f==0)
            System.out.println("Для заданного интервала нет элементов");
        if(k != 0)
            System.out.println("Количество нулей: " + k);
        else
            System.out.println("Нулей нет");
    }
}
