package ru.mirea.LAB6.task6;

class Printer implements Printable {
    private String text;

    public Printer(String text) {
        this.text = text;
    }

    @Override
    public void print() {
        System.out.println(text);
    }
}
