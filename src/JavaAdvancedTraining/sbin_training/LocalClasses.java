package JavaAdvancedTraining.sbin_training;

import JavaAdvancedTraining.olivepress.olives.OliveJar;
import JavaAdvancedTraining.olivepress.olives.OliveName;

public class LocalClasses {

    public static void main(String[] args) throws Exception {

        OliveJar jar = new OliveJar();
        jar.addOlive(OliveName.KALAMATA, 0x000000);
        jar.addOlive(OliveName.PICHOLINE, 0x000000);
        jar.addOlive(OliveName.LIGURIO, 0x000000);
        jar.reportOlives();
    }
}
