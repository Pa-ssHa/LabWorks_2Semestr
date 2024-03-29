import java.util.Scanner;

import static java.lang.Math.*;

public class laba_2_1_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите а: ");
        double a = scan.nextDouble();
        double y = 0;
        switch ((a <= -2) || (a >= 16 && a <= 20) ? 1 : 0) {
            case 1:
                y = pow(sin(a), 2) - 1;
                break;
            case 0:
                switch (((a >= 5) && (a <= 10)) || (a == 29) || (a >= 50) ? 1 : 0) {
                    case 1:
                        y = 2 * a * sqrt(5) - 6;
                        break;
                    case 0:
                        switch ((a >= -1 && a < 2) || a == 15 ? 1 : 0) {
                            case 1:
                                y = a + ((sin(a)) / 3);
                                break;
                            case 0:
                                y = sqrt(3) + a;
                                break;
                        }

                }
        }
        System.out.print("Ответ: " + y);
    }
}
