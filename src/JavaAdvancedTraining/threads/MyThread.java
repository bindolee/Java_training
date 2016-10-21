package JavaAdvancedTraining.threads;

/**
 * Created by sbin on 10/20/2016.
 */
public class MyThread extends Thread {

    private int threadId;
    private TargetClass target;

    public MyThread(int threadId, TargetClass target){
        this.threadId = threadId;
        this.target = target;
    }

    //thread class must have run method at least..
    @Override
    public void run() {

        synchronized (target){
            try {
                sleep(2000);//2000 milisec is 2 seconds.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            target.call(threadId);
        }

    }
}
