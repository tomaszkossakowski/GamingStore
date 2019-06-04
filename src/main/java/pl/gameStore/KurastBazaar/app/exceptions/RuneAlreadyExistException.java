package pl.gameStore.KurastBazaar.app.exceptions;

public class RuneAlreadyExistException extends BaseException {
    private static final String RUNE_ALREADY_EXIST = "Rune already exists, please provide different name";

    public RuneAlreadyExistException() {
        super(RuneAlreadyExistException.RUNE_ALREADY_EXIST);
    }
}
