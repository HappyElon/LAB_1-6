package ru.mirea.LAB4.task2;

class Skirt extends Clothes implements WomenClothing {

    public Skirt(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женская юбка: Размер " + size + ", Цвет " + color + ", Стоимость " + cost);
    }
}
