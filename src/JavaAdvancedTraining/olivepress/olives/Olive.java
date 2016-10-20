package JavaAdvancedTraining.olivepress.olives;

/**
 * Created by sbin on 10/20/2016.
 */
public class Olive {


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


}
