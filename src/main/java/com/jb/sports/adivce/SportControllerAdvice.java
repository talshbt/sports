package com.jb.sports.adivce;

import com.jb.sports.exceptions.SportSystemException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
@RestController
public class SportControllerAdvice {

    @ExceptionHandler(value={SportSystemException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorDetails handleException(Exception e){
        return new ErrorDetails("Sports System", e.getMessage());
    }
}
