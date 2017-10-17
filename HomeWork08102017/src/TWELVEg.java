import java.util.Scanner;

public class TWELVEg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = 0, S = 0, eps = 0.0001, g = 1, h, x, i;
        x = in.nextDouble();
        double e;
        while (Math.abs(g) > eps) {
            h = 1;
            e = 1;
            i = 1;
            while (i <= 2*n) {
                e = e * x;
                h = h * i;
                i = i + 1;
            }
            S = S + (-1) * e / h;
            n = n + 1;
            System.out.println(S);
        }
    }
}
