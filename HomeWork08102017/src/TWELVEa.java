import java.util.Scanner;

public class TWELVEa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = 1, S = 0, eps = 0.0001, g = 0, h, x, i = 1;
        x = in.nextDouble();
        double e = x;
        while (g < eps) {
            h = 1;
            while (i <= n) {
                e = e * x;
                h = h * i;
                i = i + 1;
            }
            i = 1;
            g = e / h;
            S = S + g;
            n = n + 1;
        }
        S = S + 1;
        System.out.println(S);
        System.out.println(g);
        System.out.println(n);
    }
}
