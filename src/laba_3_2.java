import java.util.Scanner;

import static java.lang.Math.*;

public class laba_3_2 {
    public static void main(String[] args) {
        double y;
        double ss = 0;
        double ss2 = 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("M: ");
        int M = scan.nextInt();
        System.out.print("N: ");
        int N = scan.nextInt();
        System.out.print("a: ");
        double a = scan.nextDouble();
        for(int i = 0; i<=N; i++){
            for( int j = 0; j<=M; j++){
                ss += pow((i+j),2);
            }
            ss2 *= (ss + 2*i +a);
            ss =0;
        }
        y = ss2;
        System.out.print("Ответ: " + y);
    }
}