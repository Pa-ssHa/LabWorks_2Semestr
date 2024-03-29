import static java.lang.Math.*;
import java.util.Scanner;
public class laba_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите а :");
        double a = scan.nextDouble();
        System.out.print("Введите b :");
        double b = scan.nextDouble();
        System.out.print("Введите c :");
        double c = scan.nextDouble();
        double y = (pow(10, 4) * pow(sin(2.5 * c), 2)) - ((0.32 * pow(c, 3) + 4 * c + b) / (cos(2 * a))) * (pow(0.32 * pow(c, 3) - b, 1.0 / 6)) + abs(b);
        System.out.print("Ответ: " + y);


    }
}