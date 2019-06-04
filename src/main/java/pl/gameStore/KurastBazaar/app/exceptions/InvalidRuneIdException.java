package pl.gameStore.KurastBazaar.app.exceptions;

public class InvalidRuneIdException extends BaseException {
    private static final String INVALID_RUNE_ID = "Invalid rune id number. Please provide correct id";

    public InvalidRuneIdException(){
        super(InvalidRuneIdException.INVALID_RUNE_ID);
    }
}
