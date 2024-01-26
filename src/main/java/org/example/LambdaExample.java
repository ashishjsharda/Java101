package org.example;

public class LambdaExample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = Thread.startVirtualThread(() -> {
            System.out.println("Hello from virtual thread");
        });
        thread.join();
    }
}
