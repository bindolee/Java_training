package JavaAdvancedTraining.sbin_training;

import JavaAdvancedTraining.Calculator.InputHelper;
import JavaAdvancedTraining.Calculator.MathHelper;
import JavaAdvancedTraining.exceptions.WrongFileException;
import JavaAdvancedTraining.filetree.FileFinder;
import JavaAdvancedTraining.filetree.MyFileVisitor;
import JavaAdvancedTraining.olivepress.olives.*;
import JavaAdvancedTraining.threads.MyThread;
import JavaAdvancedTraining.util.MyFileReader;

import java.io.*;
import java.lang.reflect.Constructor;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.*;

public class Main {

    private static final boolean USE_OLD_STUDY = false;

    public static void main(String[] args) {

        int iterations = 3;
        MyThread thread = new MyThread();

        thread.start(); // this call run from MyThread class

        try {
            for (int i=0; i < iterations; i++){
                System.out.println("from main process");
                Thread.sleep(3000); // has to call sleep from Static class
            }
        } catch (InterruptedException e) {
            System.err.println(e);
        }

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
