package ru.mirea.LAB6.task10;

class Processor {
    private String model;
    private int speed;

    public Processor(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return model + " " + speed + "GHz";
    }
}
