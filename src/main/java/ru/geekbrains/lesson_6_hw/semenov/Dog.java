package ru.geekbrains.lesson_6_hw.semenov;

public class Dog extends Animals {

    public Dog() {
        super();
        this.AnimalView = "This Dog";
        this.maxRun = random.nextInt(300) + 300;
        this.maxSwim = random.nextInt(10) + 20;
        this.maxLeap = random.nextDouble() + 0.5;
    }
}
