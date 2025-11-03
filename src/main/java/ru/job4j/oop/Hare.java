package ru.job4j.oop;

public class Hare {
    public void tryEat(Ball ball) {
        System.out.println("Заяц пытается съесть колобка...");
        boolean result = ball.tryRun(false); // колобок сбегает
        if (result) {
            System.out.println("Заяц не смог поймать колобка");
        }
    }
}
