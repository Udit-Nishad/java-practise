package Threading.Synchronize.DiffExample;

public class Main {
    public static void main(String[] args){
        MYThread thread = null;
        for( int i=0; i<10; i++){
             thread = new MYThread();
                thread.start();
        }
       try {
            thread.join();
        } catch (InterruptedException e) {
           e.printStackTrace();
       }finally {
           MYThread.getCounter();
       }


    }
}
