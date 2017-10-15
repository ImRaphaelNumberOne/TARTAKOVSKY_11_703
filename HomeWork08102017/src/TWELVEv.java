import java.util.Scanner;

public class TWELVEv {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = 1, S = 0, eps = 0.0001, g = 0, x, i = 1;
        x = in.nextDouble();
        double e = x;
        while (Math.abs(g) < eps) {
            while (i <= n) {
                e = e * x;
                i = i + 1;
            }
            i = 1;
            g = ((-1) * e) / n;
            S = S + g;
            n = n + 1;
        }
        System.out.println(S);
        System.out.println(n);
    }
}
