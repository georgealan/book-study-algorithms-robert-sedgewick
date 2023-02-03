package org.algorithms.exercises;

import java.util.Scanner;

import edu.princeton.cs.algs4.StdOut;

public class Main {
    public static void main(String[] args) {
//        giveValueOfExpressions();
//        System.out.println(verify());
//        whatPrint();
        int increment = 7;
        System.out.println("Increment char value: a increment " + increment + " = " + (char) ('a' + increment));
        System.out.println('b');
        System.out.println('b' + 'c');

    }

    public static void giveValueOfExpressions() {
        System.out.println("Expression 1 double: " + (0.0 + 15) / 2);
        System.out.println("Expression 1 int: " + (0 + 15) / 2);
        System.out.println("Expression 2: " + 2.0e-6 * 100000000.1);
    }

    public static String verify() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write the first integer:");
        int n1 = scanner.nextInt();
        System.out.println("Write the second integer:");
        int n2 = scanner.nextInt();
        System.out.println("Write the thirth integer:");
        int n3 = scanner.nextInt();

        return (n1 == n2 && n1 == n3 && n2 == n3) ? "equal" : "not equal";
    }

    public static void whatPrint() {
        int f = 0;
        int g = 1;

        for (int i = 0; i <= 15; i++) {
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }
    }

}