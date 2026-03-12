package com.cs_is.assignment2;

class MyThread extends Thread {
    public void run() {
        System.out.println("Hello from Thread class!");
    }
}

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Hello from Runnable!");
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start(); // starts the thread
        System.out.println("Hello from main thread!");
    }
}
