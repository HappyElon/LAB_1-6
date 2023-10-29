package ru.mirea.LAB4_1.seventhTask;

public class Schooler extends Member{
    int room;

    public Schooler(String name, int room) {
        super(name);
        this.room = room;
    }

    public int getRoom() {
        return room;
    }
}
