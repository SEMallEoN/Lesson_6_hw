package ru.geekbrains.lesson_6_hw.semenov;

public class Cat extends Animals {

    public Cat() {
        super();
        this.AnimalView = "This Cat";
        this.maxRun = random.nextInt(50) + 150;
        this.maxSwim = 0;
        this.maxLeap = random.nextInt() + 2;
    }
}
