package JavaAdvancedTraining.sbin_training;

import JavaAdvancedTraining.olivepress.olives.*;

import java.lang.reflect.Constructor;
import java.util.*;

public class LocalClasses {

    public static void main(String[] args) throws Exception {

        LinkedList<Olive> list = new LinkedList<>();

        list.add(new Picholine());
        list.add(new Kalamata());

        list.add(1, new Golden());
        list.addFirst(new Ligurio());
        display(list);

    }

    static private void display(Collection<Olive> col){
        System.out.println("List order: ");
        Iterator<Olive> iterator = col.iterator();
        while(iterator.hasNext()){
            Olive olive = (Olive) iterator.next();
            System.out.println(olive.oliveName.toString());
        }
    }
}
