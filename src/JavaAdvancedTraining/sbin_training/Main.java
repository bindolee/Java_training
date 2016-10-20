package JavaAdvancedTraining.sbin_training;

import JavaAdvancedTraining.Calculator.InputHelper;
import JavaAdvancedTraining.Calculator.MathHelper;
import JavaAdvancedTraining.exceptions.WrongFileException;
import JavaAdvancedTraining.olivepress.olives.*;
import JavaAdvancedTraining.util.MyFileReader;

import java.io.*;
import java.lang.reflect.Constructor;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Main {

    private static final boolean USE_ASSERT_DEBUG = false;

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/tmp/ATextFile.txt");
        System.out.println(path.toString());
        System.out.println(path.getFileName());
        System.out.println(path.getNameCount());

        // 0 is tmp, 1 is ATextFile.txt.. getnamecount -1 always returns the file name..
        System.out.println(path.getName(path.getNameCount()-1));

        path = Paths.get("ATextFile.txt");
        Path realPath = path.toRealPath(LinkOption.NOFOLLOW_LINKS);
        System.out.println(realPath);



        if (USE_ASSERT_DEBUG) {
            String fileContents = MyFileReader.readFile("TextFile2.txt");
            System.out.println(fileContents);

            try {
                if (fileContents.equals("Right file")){
                    System.out.println("You chose the right file");
                }
                else {
                    throw(new WrongFileException());
                }
            } catch (WrongFileException e) {
                System.out.println(e.getMessage());
            }


            System.out.println("Still alive!!");

        /* way to test using assert */
            String s1 = InputHelper.getInput("Enter a numeric value: ");
            assert checkInt(s1);
            String s2 = InputHelper.getInput("Enter a numeric value: ");
            assert checkInt(s2);
            String op = InputHelper.getInput("Enter + or - or * or / ");
            assert checkInt(op);

            double result = 0;

            switch (op) {
                case "+":

                    result = MathHelper.addValues(s1, s2);
                    break;
                case "-":
                    result = MathHelper.subtractValues(s1, s2);
                    break;
                case "*":
                    result = MathHelper.multiplyValues(s1, s2);
                    break;
                case "/":
                    result = MathHelper.divideValues(s1, s2);
                    break;

                default:
                    System.out.println("You entered an incorrect operator");
                    return;
            }

            System.out.println("The answer is " + result);
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
