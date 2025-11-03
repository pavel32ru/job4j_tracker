package ru.job4j.oop;

public class BallStory {

    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();

        System.out.println("=== Сказка про Колобка ===");
        System.out.println();

        System.out.println("Колобок катится по дорожке...");
        System.out.println();

        // Встреча с зайцем
        System.out.println("Встретил колобок зайца:");
        hare.tryEat(ball);
        System.out.println();

        // Встреча с волком
        System.out.println("Покатился колобок дальше, встретил волка:");
        wolf.tryEat(ball);
        System.out.println();

        // Встреча с лисой
        System.out.println("Покатился колобок дальше, встретил лису:");
        fox.tryEat(ball);
        System.out.println();

        System.out.println("=== Конец сказки ===");
    }
}