package pl.gameStore.KurastBazaar.app.exceptions;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
class BaseException extends RuntimeException {
    private String message;

    BaseException(String message) {
        this.message = message;
    }
}
