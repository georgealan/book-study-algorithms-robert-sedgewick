package org.basicprogrammingmodel;

import java.util.Arrays;

import static edu.princeton.cs.algs4.StdDraw.*;
import static edu.princeton.cs.algs4.StdRandom.*;

public class Drawings {
    static int n = 0;
    public static void main(String[] args) {
//        drawingFunctionValues();
//        drawingArrayRandomValues();
        sortedArrayRandomValues();
    }

    public static void drawingFunctionValues() {
        n = 100;
        setXscale(0, n);
        setYscale(0, n*n);
        setPenRadius(.01);

        for (int i = 1; i <= n; i++) {
            point(i, i);
            point(i, i*i);
            point(i, i*Math.log(i));
        }
    }

    public static void drawingArrayRandomValues() {
        n = 50;
        double[] a = new double[n];
        for (int i = 0; i < n; i++) {
            a[i] = random();
        }
        for (int i = 0; i < n; i++) {
            double x = 1.0 * i/n;
            double y = a[i] / 2.0;
            double rw = 0.5 / n;
            double rh = a[i] / 2.0;
            filledRectangle(x, y, rw, rh);
        }
    }

    public static void sortedArrayRandomValues() {
        n = 50;
        double[] a = new double[n];
        for (int i = 0; i < n; i++) {
            a[i] = random();
        }
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            double x = 1.0 * i/n;
            double y = a[i] / 2.0;
            double rw = 0.5 / n;
            double rh = a[i] / 2.0;
            filledRectangle(x, y, rw, rh);
        }
    }
}
