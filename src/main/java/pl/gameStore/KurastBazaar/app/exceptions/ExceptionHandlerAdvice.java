package pl.gameStore.KurastBazaar.app.exceptions;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.gameStore.KurastBazaar.app.dto.ErrorDto;

@ControllerAdvice
public class ExceptionHandlerAdvice {

    private final Logger logger = LoggerFactory.getLogger(ExceptionHandlerAdvice.class);

    @ExceptionHandler
    @ResponseBody
    ResponseEntity<ErrorDto> handle(Exception exception) {
        ErrorDto errorDto = new ErrorDto();
        if (exception instanceof BaseException) {
            errorDto.setMessage(exception.getMessage());
        }
        logger.error(errorDto.getMessage());
        return new ResponseEntity<>(errorDto, HttpStatus.BAD_REQUEST);
    }

}

