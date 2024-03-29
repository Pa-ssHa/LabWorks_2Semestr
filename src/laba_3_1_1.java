import java.util.Scanner;

import static java.lang.Math.*;

public class laba_3_1_1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("L: ");
        int L = scan.nextInt();
        System.out.print("N: ");
        int N = scan.nextInt();
        System.out.print("a: ");
        double a = scan.nextDouble();
        double s;
        double pr1 = 1;
        double pr2 = 1;
        double ss = 0;
        for (int i = 2; i <= N; i++) {
            pr1 *= (i + a) / 2.0;
            ss += pow((i + 2.0), a);
        }
        for (int k = 2; k <= L; k++) {
            pr2 *= (2.0 * pow(k, 2)) / (a * L);
        }
        s = pr1 + 0.5 * pr2 + ss;
        System.out.print("Ответ: " + s);
    }
}

//        for (int j = 2; j <= N; j++) {
//            ss += pow((j + 2), a);
//        }