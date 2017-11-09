import java.util.Scanner;

public class TWELVEv {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = 1.0, S = 0, eps = 0.0001, g = 1.0, x, i = 1.0, e = 1.0;
        x = in.nextDouble();
            while (g > eps) {
                while (i <= n) {
                    e = e * x;
                    i = i + 1;
                }
                i = 1;
                S = S + ((-1) * e) / n;
                n = n + 1;
                System.out.println(S);
                System.out.println(n);
            }
    }
}
