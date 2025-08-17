package Threading.MultiThread;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        MyThread thread1 = new MyThread();
//        MyRunnable runnable1 = new MyRunnable();
//        Thread thread2 = new Thread(runnable1);
//        MyThread thread3 = new MyThread();
//        thread1.start(); // we have to use start for it to run concurrently and not run
//        thread2.start();
//        thread2.join(); // here it stops the main thread until thread2 gets over and then it resumes
//        thread3.start();
//        System.out.println(1/0); // here it throws exception but still the other threads still run


        // we can use this loop to create multiple threads of the same type as well
        for(int i=0;i<5;i++){
            MyThread thread = new MyThread();
            thread.start();
        }
        for(int i=0;i<5;i++){
            MyRunnable runnable = new MyRunnable();
            Thread thread1 = new Thread(runnable);
            thread1.start();
        }
    }
}
