package ru.mirea.LAB4_1.ninthTask;

class FurnitureShop {
    private String name;

    public FurnitureShop(String name) {
        this.name = name;
    }

    public void displayFurnitureInfo(Furniture furniture) {
        System.out.println("В магазине " + name + " доступна следующая мебель:");
        furniture.displayInfo();
    }
}