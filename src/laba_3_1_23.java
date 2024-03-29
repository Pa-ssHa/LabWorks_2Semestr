import java.util.Scanner;

import static java.lang.Math.*;

public class laba_3_1_23 {
    public static void main(String[] args) {
        // while
        double s;
        double pr1 = 1;
        double pr2 = 1;
        double ss = 0;
        int i = 2;
        int k = 2;
        Scanner scan = new Scanner(System.in);
        System.out.print("L: ");
        int L = scan.nextInt();
        System.out.print("N: ");
        int N = scan.nextInt();
        System.out.print("a: ");
        double a = scan.nextDouble();
        while (k <= L) {
            pr2 *= (2.0 * pow(k, 2)) / (a * L);
            k++;
        }
        while (i <= N) {
            ss += pow((i + 2), a);
            pr1 *= (i + a) / 2.0;
            i++;
        }
        s = pr1 + 0.5 * pr2 + ss;
        System.out.println("Ответ: " + s);

        // do while

        Scanner scan2 = new Scanner(System.in);
        System.out.print("L: ");
        L = scan2.nextInt();
        System.out.print("N: ");
        N = scan2.nextInt();
        System.out.print("a: ");
        a = scan2.nextDouble();
        pr1 = 1;
        pr2 = 1;
        ss = 0;
        i = 2;
        k = 2;
        do {
            pr2 *= (2.0 * pow(k, 2)) / (a * L);
            k++;
        }
        while (k <= L);
        do {
            ss += pow((i + 2), a);
            pr1 *= (i + a) / 2.0;
            i++;
        }
        while (i <= N);
        s = pr1 + 0.5 * pr2 + ss;
        System.out.println("Ответ: " + s);
    }
}






//do {
//        pr1 *= (i + a) / 2.0;
//        i++;
//        }
//        while (i <= N);
//while (i <= N) {
//        pr1 *= (i + a) / 2.0;
//        i++;
//        }