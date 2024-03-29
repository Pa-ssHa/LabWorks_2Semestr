import java.util.Scanner;
import static java.lang.Math.*;
public class pract_1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите а :");
        double a = scan.nextDouble();
        System.out.print("Введите b :");
        double b = scan.nextDouble();
        System.out.print("Введите c :");
        double c = scan.nextDouble();
        double y;
        y=(a+c)/(b+a) + pow(sin(b) + a, 1.0/3) + pow(c,2);
        System.out.print("Ответ" +y);
    }
}
