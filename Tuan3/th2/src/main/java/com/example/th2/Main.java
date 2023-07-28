package com.example.th2;

class EvenNumbersThread extends Thread {
    @Override
    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        EvenNumbersThread evenThread = new EvenNumbersThread();
        evenThread.start();
    }
}

