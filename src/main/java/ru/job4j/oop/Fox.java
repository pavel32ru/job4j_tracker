package ru.job4j.oop;

public class Fox {
    public void tryEat(Ball ball) {
        System.out.println("Лиса пытается съесть колобка...");
        boolean result = ball.tryRun(true); // колобок будет съеден
        if (!result) {
            System.out.println("Лиса съела колобка!");
        }
    }
}
