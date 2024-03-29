import java.util.Arrays;

public class formatArr {
    public static void formatArr( double[] X, double[] Y, int n){
        int k = 0;
        double[] Z = new double[n];
        for (int i = 0; i < n; i++) {
            if ((X[i] + Y[i] + i) < 0) {
                Z[k] = X[i] + Y[i] + i;
                k++;
            }
        }
        if (k != 0)
            Z = Arrays.copyOf(Z, k);
    }
}
