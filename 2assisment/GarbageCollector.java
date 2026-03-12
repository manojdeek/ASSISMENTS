package com.cs_is.assignment2;

class GarbageCollector {
    protected void finalize() throws Throwable{
        System.out.println("Garbage collector called and object destroyed");
    }

    public static void main(String[] args) {
        GarbageCollector g1 = new GarbageCollector();
        GarbageCollector g2 = new GarbageCollector();
        g1 = null;
        g2 = null;

        System.gc();
        System.out.println("End of Execution");
    }
}

