package JavaAdvancedTraining.sbin_training;

import JavaAdvancedTraining.Calculator.InputHelper;
import JavaAdvancedTraining.Calculator.MathHelper;
import JavaAdvancedTraining.exceptions.WrongFileException;
import JavaAdvancedTraining.filetree.FileFinder;
import JavaAdvancedTraining.filetree.MyFileVisitor;
import JavaAdvancedTraining.olivepress.olives.*;
import JavaAdvancedTraining.threads.MyRunnable;
import JavaAdvancedTraining.threads.MyThread;
import JavaAdvancedTraining.threads.TargetClass;
import JavaAdvancedTraining.util.MyFileReader;

import java.io.*;
import java.lang.reflect.Constructor;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.*;

public class Main {

    private static final boolean USE_OLD_STUDY = false;

    public static void main(String[] args) {

        TargetClass target = new TargetClass();

        MyThread t1 = new MyThread(1,target);
        MyThread t2 = new MyThread(2,target);
        MyThread t3 = new MyThread(3,target);

        t1.start();
        t2.start();
        t3.start();

        /*
        int iterations = 3;
        //This is using customer thread class
        MyThread t = new MyThread();
        t.start(); // this call run from MyThread class

        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t.interrupt(); // interrupt the thread t
        System.out.println("Called interrupt()");

        // This is way to implement runnable
        MyRunnable runnable = new MyRunnable();
        new Thread(runnable).start();

        try {
            for (int i=0; i < iterations; i++){
                System.out.println("from main process");
                Thread.sleep(3000); // has to call sleep from Static class
            }
        } catch (InterruptedException e) {
            System.err.println(e);
        }
*/
    }

    // This is way to testing using assert...need to add -ea argument to enable assert.
    private static boolean checkInt(String s){
        try {
            Integer.parseInt(s);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
}
