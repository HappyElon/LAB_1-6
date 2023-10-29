package ru.mirea.LAB1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanned = new Scanner(System.in);
        int[] scanned_array = new int[10];
        int sum_of_array = 0;
        double mean = 0;
        double sum_of_array_dl = sum_of_array;
        double number_of_el = scanned_array.length;
        for (int i = 0; i < scanned_array.length; i++){
            scanned_array[i] = scanned.nextInt();
            sum_of_array += scanned_array[i];
        }
        System.out.print("\nArray: ");
        for (int i = 0; i < scanned_array.length; i++){
            System.out.print(scanned_array[i]);
            System.out.print(' ');
        }
        System.out.print("\nSum of array: ");
        System.out.println(sum_of_array);
        System.out.print("\nMean: ");
        sum_of_array_dl = sum_of_array;
        mean = sum_of_array_dl/number_of_el;
        System.out.println(mean);
    }
}