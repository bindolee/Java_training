package JavaAdvancedTraining.sbin_training;

import JavaAdvancedTraining.olivepress.olives.Ligurio;
import JavaAdvancedTraining.olivepress.olives.Olive;
import JavaAdvancedTraining.olivepress.olives.OliveColor;
import JavaAdvancedTraining.olivepress.olives.OliveName;

import java.lang.reflect.Constructor;

public class LocalClasses {

    public static void main(String[] args) throws Exception {

        Object o = new Ligurio();
        Class<?> c = o.getClass();
        System.out.println("Class Name: " + c.getName());

        // Super class of Ligurio class
        Class<?> sup = c.getSuperclass();
        System.out.println("Class Name: " + sup.getName());

        // Super class of Olive class
        Class<?> top = sup.getSuperclass();
        System.out.println("Class Name: " + top.getName());

        Package p = c.getPackage();
        System.out.println("Package: "+ p.getName());

    }
}
