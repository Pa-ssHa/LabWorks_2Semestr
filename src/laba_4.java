import java.util.Scanner;
import static java.lang.Math.*;
public class laba_4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("X: ");
        double x = scan.nextDouble();
        System.out.print("E: ");
        double E = scan.nextDouble();
        double x2 = pow(x,2);
        double x3 = pow(x,3);
        double R = (2/3.0) *(x3/(1+x2));
        int k = 1;
        double s = R;
        do{
            k++;
            R *= (2*k*x2)/((2*k+1)*(1+x2));
            s+=R;
        }while(abs(R/s)>E && k <1000);
        if(k==1000)
            System.out.print("Не посчитан");
        else{
            double y = (1+x2)*atan(x) -x;
            System.out.printf("S= %1.8f\ny= %1.8f\nd= %1.8f\nk= %d",s,y,abs(s-y),k);
        }
    }
}
