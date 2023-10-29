package ru.mirea.LAB4_1.part8;

public class Circle extends Shape{
    protected double radius;

    public Circle(String color, boolean f, double radius) {
        super(color, f);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }
    public double getPerimeter(){
        return Math.PI * radius * 2;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
