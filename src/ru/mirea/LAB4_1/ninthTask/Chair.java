package ru.mirea.LAB4_1.ninthTask;

class Chair extends Furniture {
    public Chair(String name, double price) {
        super(name, price);
    }

    @Override
    public void displayInfo() {
        System.out.println("Стул: " + getName() + ", Цена: " + getPrice() + " руб.");
    }
}