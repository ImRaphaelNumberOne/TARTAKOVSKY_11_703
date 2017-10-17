import java.util.Scanner;

public class TWELVEb {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = 0, S = 0, eps = 0.0001, g = 1, z = -1, h, x, i;
        x = in.nextDouble();
        double e;
        System.out.println(Math.sin(x));

        while (Math.abs(g) > eps) {
            h = 1;
            e = 1;
            i = 1;
            while (i <= (2*n + 1)) {
                e = e * x;
                h = h * i;
                i = i + 1;
            }
            g = e / h;
            z = z* (-1);
            g = g * z;
            S = S + g;
            n = n + 1;

            System.out.println(S);
            System.out.println("абс g " + Math.abs(g));
            System.out.println(n);
        }
    }
}
