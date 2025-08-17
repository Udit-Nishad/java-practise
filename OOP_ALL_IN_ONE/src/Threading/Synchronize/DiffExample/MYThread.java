package Threading.Synchronize.DiffExample;


public class MYThread extends Thread {
    private static int counter = 0;

    public static void getCounter() {
        System.out.println(counter);
    }

    @Override
    public  void run() {

        for (int i = 0; i < 100000; i++) {
            synchronized (this) {
                counter++;
            }
        }
    }
}

