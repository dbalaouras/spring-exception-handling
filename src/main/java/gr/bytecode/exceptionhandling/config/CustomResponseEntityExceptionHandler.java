package gr.bytecode.exceptionhandling.config;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author Dimi Balaouras
 */
@ControllerAdvice
public class CustomResponseEntityExceptionHandler {

    @ExceptionHandler(HttpMessageNotReadableException.class)
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            HttpMessageNotReadableException ex, HttpHeaders headers, HttpStatus status) {

        ErrorMessage errorMessage = new ErrorMessage("some error");
        return new ResponseEntity<Object>(errorMessage, headers, status);
    }
}
