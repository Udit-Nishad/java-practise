package Threading.Thread;

/*
    	thread =	A thread of execution in a program (kind of like a virtual CPU)
    				The JVM allows an application to have multiple threads running concurrently
    				Each thread can execute parts of you code in parallel with the main thread
    				Each thread has a priority.
    				Threads with higher priority are executed in preference compared to threads with a lower priority

    			    The Java Virtual Machine continues to execute threads until either of the following occurs
    					1. The exit method of class Runtime has been called
    					2. All user threads have died

    				When a JVM starts up, there is a thread which calls the main method
    				This thread is called “main”

    				Daemon thread is a low priority thread that runs in background to perform tasks such as garbage collection
				JVM terminates itself when all user threads (non-daemon threads) finish their execution
    	 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread2 = new MyThread();
        thread2.start();
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("MAIN");
       // Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        Thread.currentThread().setPriority(7);// threads have priority between 1 to 10 10 being highest and 1 lowest 5 being default
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        for(int j=3;j>0;j--){
            System.out.println(j);
            thread2.sleep(1000);
        }

        for(int i=3;i>0;i--){
            System.out.println(i);
            Thread.sleep(500);
        }
//        MyThread thread2 = new MyThread();
//        thread2.start();
        System.out.println(thread2.getPriority());//here thread2 priority is default as Thread since it inherits its properties
         thread2.setName("2nd Thread");
         thread2.setPriority(8);
         System.out.println(thread2.getPriority());
         System.out.println(Thread.activeCount());
         System.out.println(thread2.isDaemon());
         thread2.setDaemon(true);// sets thread2 as daemon thread where its is low priority thread which runs in background
        // Daemon threads run as long as a non Daemon thread is running as soon as normal threads gets finished the program gets finished
        //It does not care if a daemon thread is running or not


    }
}
