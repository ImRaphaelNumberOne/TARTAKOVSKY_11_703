package ru.itis;

import java.util.Scanner;

public class Main {
    public static void main ( String args[] ) {
        Ex049 vA = new Ex049( 1.0, 2.0);
        Ex049 vB = new Ex049( 2.0, 2.0);

        System.out.println( "Vector vA =" + vA.toString() );
        System.out.println( "Vector vB =" + vB.toString() );

        System.out.println( "Vector vA+vB =" + vA.add(vB).toString() );
        System.out.println( "Vector vB+vA =" + vB.add(vA).toString() );

        System.out.println( "Vector vA-vB =" + vA.sub(vB).toString() );
        System.out.println( "Vector vB-vA =" + vB.sub(vA).toString() );

        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();

        System.out.println( "Vector vA*number =" + vA.mult(number).toString() );
        System.out.println( "Vector vB*number =" + vB.mult(number).toString() );

        System.out.println( "vA.normalize() =" + vA.normalize().toString() );
        System.out.println( "vB.normalize() =" + vB.normalize().toString() );

        System.out.println( "Scalar product vA.vB =" + vA.scalarProduct(vB) );
        System.out.println( "Scalar product vB.vA =" + vB.scalarProduct(vA) );
    }
}
