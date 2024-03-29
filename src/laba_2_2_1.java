import java.util.Scanner;

import static java.lang.Math.*;

public class laba_2_2_1 {
    public static void main(String[] args) {
        double y, a, b;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите x1: ");
        double x1 = scan.nextDouble();
        System.out.print("Введите x2: ");
        double x2 = scan.nextDouble();
        System.out.print("Введите x3: ");
        double x3 = scan.nextDouble();
        System.out.print("Введите x4: ");
        double x4 = scan.nextDouble();
        System.out.print("Введите x5: ");
        double x5 = scan.nextDouble();
        System.out.print("Введите x6: ");
        double x6 = scan.nextDouble();
        double mx = x5;
        double mn = x1;
        if (x4 > mx)
            mx = x4;
        if (mn > x2)
            mn = x2;
        if (x3 < mn)
            mn = x3;
        if (mx < mn)
            mn = mx;
        if (x6 < mn)
            mn = x6;
        a = mn;
        mx = x1 + x2;
        if (mx < (x3 - x4))
            mx = x3 - x4;
        if ((x5 + x6) > mx)
            mx = x5 + x6;
        b = mx;
        if ((a * b + 5)==0)
            System.out.print("Знаменатель равен нулю");
        else {
            y = (3 * pow(a, 2) - 4 * sqrt(b)) / (a * b + 5);
            System.out.print("Ответ: " + y);
        }
    }
}
