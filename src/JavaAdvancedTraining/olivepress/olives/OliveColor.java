package JavaAdvancedTraining.olivepress.olives;

/**
 * Created by sbin on 10/20/2016.
 */
public enum OliveColor {
    BLACK("Black"), GREEN("Green"), GOLDEN("Golden");

    private String colorAsString;

    OliveColor(String colorAsString) {
        this.colorAsString = colorAsString;
    }

    @Override
    public String toString() {
        return this.colorAsString;
    }
}
