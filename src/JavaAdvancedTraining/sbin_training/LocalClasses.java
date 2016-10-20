package JavaAdvancedTraining.sbin_training;

import JavaAdvancedTraining.Calculator.InputHelper;
import JavaAdvancedTraining.Calculator.MathHelper;
import JavaAdvancedTraining.olivepress.olives.*;

import java.lang.reflect.Constructor;
import java.util.*;

public class LocalClasses {

    public static void main(String[] args) {

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
