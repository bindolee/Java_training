package JavaAdvancedTraining.exceptions;

/**
 * Created by sbin on 10/20/2016.
 */
// this is custom exception class and message
public class WrongFileException extends Exception{
    //this static final long is must have
    public static final long serialVersionUID = 42L;

    @Override
    public String getMessage() {
        return "You Chose the wrong file inside of custom exception";
    }
}
