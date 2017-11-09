import java.util.Scanner;  //-

public class TWELVEb {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = 0, S = 0, eps = 0.0001, g = 1, h, x, i;
        x = in.nextDouble();
        double e;
        while (g > eps) {
            h = 1;
            e = 1;
            i = 1;
            while (i <= (2*n + 1)) {//опять любимый внутренний цикл
                e = e * x;
                h = h * i;
                i = i + 1;

            }
<<<<<<< HEAD
            g = e / h;
            S = S + (-1) * g;
            n = n + 1;
=======
            S = S + (-1) * e / h;
            n = n + 1;    //Куда делся g?
>>>>>>> 1fcbdef3f9397c99b5edfe6f5bc8f0ae4777346b
            System.out.println(S);
        }
    }
}
