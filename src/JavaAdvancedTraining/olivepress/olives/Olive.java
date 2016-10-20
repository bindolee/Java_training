package JavaAdvancedTraining.olivepress.olives;

/**
 * Created by sbin on 10/20/2016.
 */
public class Olive {


        public static final long BLACK = 0x000000;

        public OliveName oliveName;
        public long color = BLACK;

        public Olive() {
        }

        public Olive(OliveName oliveName) {
            this.oliveName = oliveName;
        }

        public Olive(OliveName oliveName, long color) {
            this(oliveName);
            this.color = color;
        }

        public String toString() {
            return "name: " + this.oliveName + ": " + "color: " +  this.color;
        }


}
