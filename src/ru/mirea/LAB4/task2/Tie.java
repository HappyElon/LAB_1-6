package ru.mirea.LAB4.task2;

class Tie extends Clothes implements MenClothing {

    public Tie(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужской галстук: Размер " + size + ", Цвет " + color + ", Стоимость " + cost);
    }
}
