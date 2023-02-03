package org.basicprogrammingmodel;

import edu.princeton.cs.algs4.StdDraw;
import static edu.princeton.cs.algs4.StdDraw.*;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int key = 48;
        int[] array = {10, 11, 12, 16, 18, 23, 29, 33, 48, 54, 57, 68, 77, 84, 98};
        System.out.println("The key number: " + key + " is in the index: array[" + rank(key, array) + "] of the array");
    }

    public static int rank(int key, int[] array) {
        return rank(key, array, 0, array.length - 1);
    }

    public static int rank(int key, int[] array, int lower, int higer) {
        if (lower > higer) { return -1; }
        int mid = lower + (higer - lower) / 2;
        if (key < array[mid]) {
            return rank(key, array, lower, mid - 1);
        } else if (key > array[mid]) {
            return rank(key, array, mid + 1, higer);
        } else {
            return mid;
        }
    }
}
