package JavaAdvancedTraining.sbin_training;

import JavaAdvancedTraining.olivepress.olives.*;

import java.lang.reflect.Constructor;
import java.util.HashSet;

public class LocalClasses {

    public static void main(String[] args) throws Exception {

        Olive lig = new Ligurio();
        Olive kal = new Kalamata();
        Olive pic = new Picholine();

        // Set can have only 1 reference..dup is not counted even if you add it though.
        HashSet<Olive> set = new HashSet<>();
        set.add(lig);
        set.add(kal);
        System.out.println("there are " + set.size() + " olives in the set");

        set.add(pic);
        System.out.println("there are " + set.size() + " olives in the set");

        set.add(lig);
        System.out.println("there are " + set.size() + " olives in the set");

        set.add(null);
        System.out.println("there are " + set.size() + " olives in the set");

        set.remove(lig);
        System.out.println("there are " + set.size() + " olives in the set");
    }
}
