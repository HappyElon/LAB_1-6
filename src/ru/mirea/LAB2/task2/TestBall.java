package ru.mirea.LAB2.task2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball();

        System.out.println(ball);

        ball.setX(2);

        System.out.println(ball);

        ball.move(-3, 1);

        System.out.println(ball);
    }
}
