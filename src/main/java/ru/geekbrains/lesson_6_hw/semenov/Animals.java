package ru.geekbrains.lesson_6_hw.semenov;

public class Animals {
    String AnimalView;
    int maxRun;
    int maxSwim;
    int maxLeap;
    int limitRun;
    int limitSwim;
    int limitLeap;

    public Animals(String AnimalView, int maxRun, int maxSwim, int maxLeap, int limitRun, int limitSwim, int limitLeap) {
        this.AnimalView = AnimalView;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        this.maxLeap = maxLeap;
        this.limitRun = limitRun;
        this.limitSwim = limitSwim;
        this.limitLeap = limitLeap;
    }

    public void Run(int distance) {
        if (distance <= this.limitRun) {
            System.out.println(this.AnimalView + " ");
        } else {
            System.out.println("");
        }

    }

    public void Swim(int distance) {
        if (distance <= this.limitSwim) {
            System.out.println("");
        } else {
            System.out.println("");
        }

    }

    public void Leap(int distance) {
        if (distance <= this.limitLeap) {
            System.out.println("");
        } else {
            System.out.println("");
        }

    }

}
