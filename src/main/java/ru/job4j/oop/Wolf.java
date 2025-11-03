package ru.job4j.oop;

public class Wolf {
    public void tryEat(Ball ball) {
        System.out.println("Волк пытается съесть колобка...");
        boolean result = ball.tryRun(false); // колобок сбегает
        if (result) {
            System.out.println("Волк не смог поймать колобка");
        }
    }
}
