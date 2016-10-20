package JavaAdvancedTraining.olivepress.olives;

/**
 * Created by sbin on 10/20/2016.
 */
public enum OliveName {
    KALAMATA("Kalamata"), LIGURIO("Ligurio"),
    PICHOLINE("Picholine"), GOLDEN("Golden");

    private String nameAsString;

    private OliveName(String nameAsString){
        this.nameAsString = nameAsString;
    }

    @Override
    public String toString() {
        return this.nameAsString;
    }
}
