package FunctionAndMethods;

import java.util.Scanner;

// package 05_methods;

public class builtin {
    public static void main(String[] args) {
        // math wale function

        // System.out.println(Math.sqrt(64));
        // System.out.println(Math.cbrt(64));
        // System.out.println(Math.abs(-685)); // same value or -ve number to +ive
        // System.out.println(Math.floor(-7.8));
        // System.out.println(Math.ceil(-7.8));
        // System.out.println(Math.min(4,8));
        // System.out.println(Math.max(20,4));

        // max for 3 input
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a :");
        double a = sc.nextDouble();
        System.out.println("enter b :");
        double b = sc.nextDouble();
        System.out.println("enter c :");
        double c = sc.nextDouble();

        System.out.println(Math.max(a, Math.max(b, c)));

    }

}
