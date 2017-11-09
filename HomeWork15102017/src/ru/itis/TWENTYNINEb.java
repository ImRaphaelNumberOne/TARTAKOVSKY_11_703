package ru.itis;//-

public class TWENTYNINEb {
    public static void main(String[] args) {
<<<<<<< HEAD
	    double x0 =0 , x1, n = 0, eps = 0.0001;
        x1 = Math.cos(x0);
	    while (Math.abs(x1 - x0) > eps) {
            x0 = x1;
	        x1 = Math.cos(x0);
            n = n + 1;
=======
        Scanner in = new Scanner(System.in);
	    double x0 = 0, x1, eps = 0.0001;
	    x1 = in.nextDouble();
	    if (Math.abs(x1 - x0) > eps) {  //циклит же!
            x1 = Math.cos(x0);          //не меняются х0 и х1
>>>>>>> 1fcbdef3f9397c99b5edfe6f5bc8f0ae4777346b
        }
        System.out.println(n);
	    System.out.println(x1);
    }
}
