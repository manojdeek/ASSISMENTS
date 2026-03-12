package com.cs_is.assignment2;
class Counter {
    int count = 0;


    public synchronized void increment() {
        count++;
        System.out.println(Thread.currentThread().getName() + " : " + count);
    }
}

public class Synchronization {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                counter.increment();
            }
        }, "Thread-1");

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                counter.increment();
            }
        }, "Thread-2");

        t1.start();
        t2.start();
    }
}