package JavaAdvancedTraining.olivepress.olives;

/**
 * Created by sbin on 10/20/2016.
 */
public class Olive implements Comparable<Olive> {


        public static final long BLACK = 0x000000;

        public OliveName oliveName;
        public OliveColor color;

        public Olive(OliveName oliveName, OliveColor color) {
            this.oliveName = oliveName;
            this.color = color;
        }

        public String toString() {
            return "name: " + this.oliveName.toString()
                    + ": " + "color: " +  this.color.toString();
        }


    @Override
    public int compareTo(Olive o) {
        String s1 = this.getClass().getSimpleName();
        String s2 = o.getClass().getSimpleName();

        return s1.compareTo(s2);
    }
}
