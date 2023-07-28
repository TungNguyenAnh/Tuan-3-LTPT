package com.codegym;

import java.util.Random;

import static com.codegym.Main.DISTANCE;
import static com.codegym.Main.STEP;

public class Car implements Runnable {
    private String XeRac;


    public Car(String xeRac) {
        this.XeRac = xeRac;
    }

    @Override
    public void run() {
        int RunDistance = 0;
        long startTime = System.currentTimeMillis();
        while (RunDistance < DISTANCE) {
            try {
                int speed = (new Random()).nextInt(20);
                RunDistance += speed;
                String log = "|";
                int percentTravel = (RunDistance * 100) / DISTANCE;
                for (int i = 0; i < DISTANCE; i += STEP) {
                    if (percentTravel >= i + STEP) {
                        log += "=";
                    } else if (percentTravel >= i && percentTravel < i + STEP) {
                        log += "o";
                    }else {
                        log += "-";
                    }
                }
                log += "|";
                System.out.println("Car" + this.XeRac + ": " + log + " " + Math.min(DISTANCE, RunDistance)+ "KM");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Car" + this.XeRac + "broken...");
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Car" + this.XeRac + " Finish in " + (endTime - startTime) / 1000 + "s");
    }
}

