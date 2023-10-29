package ru.mirea.LAB2.task3;

public class Tester {
    private static Circle[] lst = new Circle[1];
    private int number = 1;

    public Tester(int number, Circle[] lst) {
        this.number = number;
        this.lst = lst;
    }

    public static void main(String[] args) {
        lst[0] = new Circle(1, 2, 3);
        System.out.println(lst[0].toString());
    }
}
