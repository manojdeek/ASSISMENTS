package com.cs_is.assignment2;
class ThreadLifeCycle extends Thread {

    public void run() {
        System.out.println(Thread.currentThread().getName() + " is RUNNING");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " has FINISHED execution");
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadLifeCycle t1 = new ThreadLifeCycle();


        System.out.println("State after creation: " + t1.getState());

        t1.start();
        System.out.println("State after start(): " + t1.getState());

        Thread.sleep(500);
        System.out.println("State during sleep(): " + t1.getState());

        t1.join();
        System.out.println("State after completion: " + t1.getState());
    }
}