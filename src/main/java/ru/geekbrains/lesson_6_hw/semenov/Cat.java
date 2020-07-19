package ru.geekbrains.lesson_6_hw.semenov;

public class Cat extends Animals{

    public Cat(String AnimalView, int maxRun, int maxSwim, int maxLeap, int limitRun, int limitSwim, int limitLeap) {
        super("Cat1", 150, 0, 1, 200, 0, 2);
        this.maxRun = 150;
        this.maxSwim =0;
        this.maxLeap =1;
    }
}
