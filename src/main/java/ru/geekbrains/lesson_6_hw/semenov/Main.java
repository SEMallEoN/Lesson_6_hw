package ru.geekbrains.lesson_6_hw.semenov;

public class Main {
    public static void main(String[] args) {
        AnimalMove();
    }

    public static void AnimalMove() {
        Cat Cat1 = new Cat();
        System.out.println("Cat1");
        Cat1.Run(150);
        Cat1.Swim(5);
        Cat1.Leap(2.5);

        Cat Cat2 = new Cat();
        System.out.println("Cat2");
        Cat2.Run(180);
        Cat2.Swim(1000);
        Cat2.Leap(3);

        Dog Dog1 = new Dog();
        System.out.println("Dog1");
        Dog1.Run(400);
        Dog1.Swim(15);
        Dog1.Leap(0.5);

        Dog Dog2 = new Dog();
        System.out.println("Dog2");
        Dog2.Run(500);
        Dog2.Swim(25);
        Dog2.Leap(0.9);

    }
}
