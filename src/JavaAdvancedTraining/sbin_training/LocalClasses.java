package JavaAdvancedTraining.sbin_training;

import JavaAdvancedTraining.olivepress.olives.*;

import java.lang.reflect.Constructor;
import java.util.HashSet;
import java.util.TreeSet;

public class LocalClasses {

    public static void main(String[] args) throws Exception {

        Olive lig = new Ligurio();
        Olive kal = new Kalamata();
        Olive pic = new Picholine();

        //if you don't implement java.lang.Comparable, it will throu run time exception
        // This is always alphabetical
        TreeSet<Olive> set = new TreeSet<>();
        set.add(pic);
        set.add(kal);
        set.add(lig);

        System.out.println(set);

    }
}
