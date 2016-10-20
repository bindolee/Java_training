package JavaAdvancedTraining.sbin_training;

import JavaAdvancedTraining.olivepress.olives.Olive;
import JavaAdvancedTraining.olivepress.olives.OliveName;

public class LocalClasses {

    public static void main(String[] args) throws Exception {

        Olive o = new Olive(OliveName.PICHOLINE,
                0x00FF00);

        // ? means I don't know what class..
        Class<?> c = o.getClass();

        System.out.println(c);
        System.out.println(c.getName());
        System.out.println(c.getSimpleName());

    }
}
