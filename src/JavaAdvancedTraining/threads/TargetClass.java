package JavaAdvancedTraining.threads;

/**
 * Created by sbin on 10/20/2016.
 */
public class TargetClass {
    public void call(int threadId){
        System.out.println("Calling thread from: "+ threadId);
    }
}
