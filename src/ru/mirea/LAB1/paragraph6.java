package ru.mirea.LAB1;

import java.util.Scanner;
public class paragraph6 {
    public static void main(String[] args) {
        Scanner scanned = new Scanner(System.in);
        double garm = 0;
        for (double i = 1; i < 11; i++){
            garm = 1 / i;
            System.out.println(String.format("%.2f", garm));
        }
    }
}
