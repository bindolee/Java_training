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

        //if you are working on character based file, then
        // use filereader/writer instead. This handles character sets
        //other than UTF-8
        FileReader in = null;
        FileWriter out = null;
        try{
            in = new FileReader("textfile.txt");
            out = new FileWriter("newfile.txt");

/*            in = new FileInputStream("flower.jpg");
            out = new FileOutputStream("newflower.jpg");*/
            int c; // filestream return 1 byte..
            while ((c = in.read()) != -1 ){
                out.write(c);
            }
            out.close();
            in.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
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
