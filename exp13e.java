d.WAP to prevent concurrent booking of a ticket using the concept of thread synchronization.
import java.io.*;
import java.util.*;
class SharedResource {
    synchronized void waitingMethod() {
        try {
            System.out.println(Thread.currentThread().getName() + " is waiting...");
            wait();
            System.out.println(Thread.currentThread().getName() + " resumed after wait");
        } catch (InterruptedException e) {
            System.out.println("Interrupted!");
        }
    }

    synchronized void notifyingMethod() {
        try {
            Thread.sleep(1000); // ensure waiting thread starts first
            System.out.println(Thread.currentThread().getName() + " is notifying...");
            notify();
        } catch (InterruptedException e) {
            System.out.println("Interrupted!");
        }
    }
}

class MyThread extends Thread {
    SharedResource resource;

    MyThread(String name, SharedResource resource) {
        super(name);
        this.resource = resource;
    }

    public void run() {
        resource.waitingMethod();
    }
}

public class ThreadDemo {
    public static void main(String[] args) throws Exception {
        SharedResource resource = new SharedResource();

        MyThread t1 = new MyThread("Thread-1", resource);
        Thread t2 = new Thread(() -> resource.notifyingMethod(), "Thread-2");

        // Set priorities
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        System.out.println(t1.getName() + " priority: " + t1.getPriority());
        System.out.println(t2.getName() + " priority: " + t2.getPriority());

        // Start threads
        t1.start();
        t2.start();

        // Join example
        t1.join();
        t2.join();

        // Set/get name
        Thread t3 = new Thread(() -> {
            System.out.println("This is " + Thread.currentThread().getName());
        });
        t3.setName("CustomThread");
        t3.start();
        t3.join();

        // Deprecated methods (for demo only)
        Thread t4 = new Thread(() -> {
            System.out.println("This is a deprecated suspend/resume demo.");
        });
        t4.start();
        // t4.suspend(); // Deprecated
        // t4.resume();  // Deprecated
    }
}
