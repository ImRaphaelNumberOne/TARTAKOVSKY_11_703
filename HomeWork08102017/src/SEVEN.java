//+-
public class SEVEN {
    public static void main(String[] args) {
        double n = 0, a = 2, b = 1, x, R = 1, eps = 0.0001, pi = 3.1415926, q = pi/2; //Почему R = 1? Это не член ряда, 
                                                                                       //он не должен оцениваться
        while (Math.abs(R - q) > eps) {
            R = R * (a / b);
            b = b + 2;
            x = a / b;
            R = R * x;
            b = 1;
            a = a + 2;
            n = n + 2;
        }
        System.out.println(R);
        System.out.println(n);
    }
}
