package JavaAdvancedTraining.sbin_training;

import JavaAdvancedTraining.olivepress.olives.Olive;
import JavaAdvancedTraining.olivepress.olives.OliveColor;
import JavaAdvancedTraining.olivepress.olives.OliveName;

import java.lang.reflect.Constructor;

public class LocalClasses {

    public static void main(String[] args) throws Exception {

        Olive o = new Olive(OliveName.PICHOLINE,
                OliveColor.GREEN);

        // ? means I don't know what class..
        Class<?> c = o.getClass();

        System.out.println(c);
        System.out.println(c.getName());
        System.out.println(c.getSimpleName());

        Constructor<?>[] constructors = c.getConstructors();
        System.out.println("Number of constructors: " + constructors.length);

        Constructor<?> con = constructors[0]; // 1st constructor
        Object obj = null;

        obj = con.newInstance(OliveName.PICHOLINE, OliveColor.GREEN);
        System.out.println(obj);
    }
}
