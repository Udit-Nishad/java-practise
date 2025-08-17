package Threading.Synchronize;
////Synchronize keyword for not allowing race condition in multithreading while sharing the same resource concurrently
class Counter {
    private int count = 0;
    //            private final Object lock = new Object();

    // Increment method with synchronized block
    public void increment() {
        synchronized (this) {  // Lock on the current instance
            count++;
            System.out.println(Thread.currentThread().getName() + " incremented count to: " + count);

//            public void increment() {
//                synchronized (lock) {
//                    count++;
//                }
//            }

        }
    }

    public int getCount() {
        return count;
    }
}

public class Synchronize {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // Create multiple threads that call increment()
        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                counter.increment();
            }
        };

        Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");

        t1.start();
        t2.start();
    }
}

//class Counter {
//    private int count = 0;
//
//    public void increment() {
//        synchronized (this) {
//            count++; // Only one thread can access this block at a time
//        }
//    }
//
//    public int getCount() {
//        return count;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) throws InterruptedException {
//        Counter counter = new Counter();
//
//        // Create two threads trying to increment the counter simultaneously
//        Thread t1 = new Thread(() -> {
//            for (int i = 0; i < 1000; i++) {
//                counter.increment();
//            }
//        });
//
//        Thread t2 = new Thread(() -> {
//            for (int i = 0; i < 1000; i++) {
//                counter.increment();
//            }
//        });
//
//        t1.start();
//        t2.start();
//        t1.join();
//        t2.join();
//
//        System.out.println("Final Count: " + counter.getCount());
//    }
//}
