package JavaAdvancedTraining.sbin_training;

import JavaAdvancedTraining.Calculator.InputHelper;
import JavaAdvancedTraining.Calculator.MathHelper;
import JavaAdvancedTraining.exceptions.WrongFileException;
import JavaAdvancedTraining.filetree.FileFinder;
import JavaAdvancedTraining.filetree.MyFileVisitor;
import JavaAdvancedTraining.olivepress.olives.*;
import JavaAdvancedTraining.util.MyFileReader;

import java.io.*;
import java.lang.reflect.Constructor;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.*;

public class Main {

    private static final boolean USE_OLD_STUDY = false;

    public static void main(String[] args) {

        //Deal with comma, tab..separated text file scan
        Scanner s = null;

        try{
            s = new Scanner(new BufferedReader(new FileReader("tokenizedtext.txt")));
            s.useDelimiter(",");
            while (s.hasNext()){
                //Default token is by space char
                System.out.println(s.next());
            }
            System.out.println("Complete");
            s.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
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
