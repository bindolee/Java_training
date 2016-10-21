package JavaAdvancedTraining.threads;

/**
 * Created by sbin on 10/20/2016.
 */
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        int iterations = 5;
        try {
            for (int i=0; i<iterations;i++){
                System.out.println("From runnable");
                Thread.sleep(1500); //2000 milisec is 2 seconds.
            }
        } catch (InterruptedException e) {
            System.err.println(e);
        }
    }
}
