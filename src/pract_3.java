import java.util.Scanner;

public class pract_3 {
    public static void main(String[] args) {
        double pr2 = 1;
        double ss = 0;
        double y = 0;
        int i = 1;
        int j = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("N: ");
        int N = scan.nextInt();
        System.out.print("M: ");
        int M = scan.nextInt();
        System.out.print("a: ");
        double a = scan.nextDouble();
        do {
            do {
                ss += (j + i) / (double) M;
                j++;
            } while (j <= M);
            pr2 *= a * i * ss;
            ss = 0;
            i++;
            j = 0;
        } while (i <= N);
        y = pr2;
        System.out.print("Ответ: " + y);
    }
}
