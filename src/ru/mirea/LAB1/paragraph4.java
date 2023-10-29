package ru.mirea.LAB1;

import java.util.Scanner;

public class paragraph4 {
    public static void main(String[] args) {
        Scanner scanned = new Scanner(System.in);
        int[] scanned_array = new int[10];
        int sum_of_array = 0;
        int i = 0, max_el = 0, min_el = 1000000;
        while (i < scanned_array.length){
            scanned_array[i] = scanned.nextInt();
            sum_of_array += scanned_array[i];
            if (scanned_array[i] > max_el){
                max_el = scanned_array[i];
            }
            if (scanned_array[i] < min_el){
                min_el = scanned_array[i];
            }
            i++;
        }
        i = 0;
        System.out.print("\nArray: ");
        while (i < scanned_array.length){
            System.out.print(scanned_array[i]);
            System.out.print(' ');
            i++;
        }
        System.out.print("\nSum of array: ");
        System.out.println(sum_of_array);
        System.out.print("\nMin element is: ");
        System.out.println(min_el);
        System.out.print("\nMax element is: ");
        System.out.println(max_el);
    }
}
