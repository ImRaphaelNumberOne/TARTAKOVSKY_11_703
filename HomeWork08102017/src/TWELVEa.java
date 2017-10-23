import java.util.Scanner; //+

public class TWELVEa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = 1, S = 0, eps = 0.0001, g, h, x, i = 1;
        x = in.nextDouble();
        g = x;
        while (g > eps) {
            S = S + g;
            n = n + 1;
            g = g * (x / n);
        }
        System.out.println(S);
        System.out.println(g);
    }
}
