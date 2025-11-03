package ru.job4j.oop;

public class Ball {
    public boolean tryRun(boolean condition) {
        if (condition = true) {
            System.out.println("колобок съеден");
            return false;
        } else {
            System.out.println("колобок сбежал");
            return true;
        }
    }
}