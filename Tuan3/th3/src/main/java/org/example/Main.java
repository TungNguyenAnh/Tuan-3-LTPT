package org.example;

class EvenNumbersRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        EvenNumbersRunnable evenRunnable = new EvenNumbersRunnable();
        Thread evenThread = new Thread(evenRunnable);
        evenThread.start();
    }
}

