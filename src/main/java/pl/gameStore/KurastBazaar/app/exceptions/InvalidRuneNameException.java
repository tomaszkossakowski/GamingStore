package pl.gameStore.KurastBazaar.app.exceptions;

public class InvalidRuneNameException extends BaseException {
    private static final String INVALID_RUNE_NAME = "Invalid rune name number. Please provide correct name";

    public InvalidRuneNameException() {
        super(InvalidRuneNameException.INVALID_RUNE_NAME);
    }
}
