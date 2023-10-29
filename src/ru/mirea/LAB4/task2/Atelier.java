package ru.mirea.LAB4.task2;

class Atelier {
    public void dressWomen(Clothes[] clothes) {
        System.out.println("Женская одежда:");
        for (Clothes item : clothes) {
            if (item instanceof WomenClothing) {
                WomenClothing womenClothing = (WomenClothing) item;
                womenClothing.dressWomen();
            }
        }
    }

    public void dressMan(Clothes[] clothes) {
        System.out.println("Мужская одежда:");
        for (Clothes item : clothes) {
            if (item instanceof MenClothing) {
                MenClothing menClothing = (MenClothing) item;
                menClothing.dressMan();
            }
        }
    }
}