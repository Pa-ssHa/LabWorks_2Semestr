import java.util.Scanner;

public class pract_2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите a: ");
        double a = scan.nextDouble();
        System.out.print("Введите b: ");
        double b = scan.nextDouble();
        System.out.print("Введите c: ");
        double c= scan.nextDouble();
        System.out.print("Введите d: ");
        double d= scan.nextDouble();
        double x1;
        double y;
        double x2;
        double x3;
        double mn = a;
        double mx = a;
        if(b>mx)
            mx = b;
        if(c>mx)
            mx = c;
        x1 = mx;
        if(b<mn)
            mn = b;
        if (c < mn)
            mn = c;
        x2 = mn;
        mn = a;
        mx = d;
        if(b < mn)
            mn = b;
        if(mn > mx)
            mx = mn;
        x3 = mx;
        if((x3 + 1) == 0)
            System.out.print( "Знаменатель равен нулю" );
        else {
            y = (3 * x1 - x2) / (x3 + 1);
            System.out.print("Ответ: " + y);
        }
    }
}
