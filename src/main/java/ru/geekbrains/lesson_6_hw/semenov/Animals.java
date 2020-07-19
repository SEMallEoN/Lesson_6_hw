package ru.geekbrains.lesson_6_hw.semenov;

import java.util.Random;

public class Animals {
    String AnimalView;
    int maxRun;
    int maxSwim;
    double maxLeap;

    public static Random random = new Random();

    public Animals() {
    }

    public void Run(int distance) {
        if (distance <= this.maxRun) {
            System.out.println(this.AnimalView + " пробежал " + distance + " метр(ов)");
        } else {
            System.out.println(this.AnimalView + " не может пробежать " + distance + " метр(ов)");
        }

    }

    public void Swim(int distance) {
        if (distance <= this.maxSwim) {
            System.out.println(this.AnimalView + " проплыл " + distance + " метр(ов)");
        } else if (this.maxSwim == 0) {
            System.out.println(this.AnimalView + " не умеет плавать");
        } else {
            System.out.println(this.AnimalView + " не может проплыть " + distance + " метр(ов)");
        }

    }

    public void Leap(double distance) {
        if (distance <= this.maxLeap) {
            System.out.println(this.AnimalView + " прыгнул на высоту " + distance + " метр(ов)");
        } else {
            System.out.println(this.AnimalView + " не может прыгнуть на высоту " + distance + " метр(ов)");
        }
        System.out.println("");

    }

}
