import java.util.Scanner;

import static java.lang.Math.*;

public class laba_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("начало: ");
        double start = scan.nextDouble();
        System.out.print("конец: ");
        double end = scan.nextDouble();
        System.out.print("количество точек: ");
        int kol = scan.nextInt();
        double y;
        double mn = sin(start) - 1.5;
        double shag = (end - start) / (kol - 1);
        double mn2 = start;
        double x = start;
        while(x<=(end+shag/2)) {
            y = sin(x) - 1.5;
            System.out.printf("%14.4f%14.4f\n", x,y);
            if (y < mn) {
                mn = y;
                mn2 = x;
            }
            x+=shag;
        }
        System.out.printf("миинимальное значение функции: %.4f", mn);
        System.out.printf("; при аргументе: %.4f ", mn2);

    }
}
