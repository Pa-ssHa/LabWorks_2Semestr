import java.util.Arrays;
import java.util.Scanner;
public class ivan {
    public static void main (String[] args){
        double []x;

        int N;
        Scanner input = new Scanner(System.in);
        System.out.print("N=");N=input.nextInt();
        x = new double[N];

        for (int i = 0;i<N;i++){
            System.out.print("x("+i+") = ");
            x[i] = input.nextDouble();
        }
        input.close();
        System.out.println();
        func1(x);

    }
    public static void func1(double []x){
        double [] y = new double[x.length];
        int k = 0;
        for (int i = 0; i<x.length;i++){
            if (x[i]%2!=0){
                y[k] = x[i];
                k +=1;
                //System.out.println(x[i]);
            }
        }
        y = Arrays.copyOf(y,k);
        System.out.println("Полученный массив");
        for (int i = 0; i < k; i++)
            System.out.println("y(" + i + ")= " + y[i]);
    }
}