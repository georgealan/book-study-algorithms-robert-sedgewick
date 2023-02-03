package org.basicprogrammingmodel;

import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

public class TypicalArrayProcessing {
    public static void main(String[] args) {

        double[] a = {1.5, 2.7, 3, 4, 5.87, 6, 7, 8, 9, 10};

        double td = StdStats.max(a);
        System.out.println("This is Princeton library " + td);

        System.out.println("Array a before shuffle: " + Arrays.toString(a));
        StdRandom.shuffle(a);
        System.out.println("Array a after shuffle: " + Arrays.toString(a));

        System.out.println("find the maximum of the array values");
        double max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("max value is equal to: " + max);

        System.out.println("Compute the average of the array values");
        int length = a.length;
        double sum = 0.0;
        for (int i = 0; i < length; i++) {
            sum += a[i];
        }
        double average = sum / length;
        System.out.println("The average is equal to: " + average);

        System.out.println("Copy to another array");
        double[] b = new double[length];
        for (int i = 0; i < length; i++) {
            b[i] = a[i];
        }
        System.out.print("New array with values copied from the other array: ");
        System.out.println(Arrays.toString(b));

        System.out.println("Reverse the elements within an array");
        for (int i = 0; i < length / 2; i++) {
            double temp = a[i];
            a[i] = a[length - 1 - i];
            a[length - 1 - i] = temp;
        }
        System.out.print("Array with reversed elements: ");
        System.out.println(Arrays.toString(a));


    }
}