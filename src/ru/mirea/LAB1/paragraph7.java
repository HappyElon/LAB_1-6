package ru.mirea.LAB1;

import java.util.Scanner;
public class paragraph7 {
    public static void main(String[] args) {
        Scanner scanned = new Scanner(System.in);
        int fact_number = scanned.nextInt();
        System.out.print(fact(fact_number));
    }
    private static int fact(int length){
        int fact1 = 1;
        for (int i = 1; i < length + 1; i++){
            fact1 *= i;
        }
        return fact1;
    }
}

