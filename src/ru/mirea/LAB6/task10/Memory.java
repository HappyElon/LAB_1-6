package ru.mirea.LAB6.task10;

class Memory {
    private int sizeGB;
    private String type;

    public Memory(int sizeGB, String type) {
        this.sizeGB = sizeGB;
        this.type = type;
    }

    @Override
    public String toString() {
        return sizeGB + "GB " + type + " RAM";
    }
}
