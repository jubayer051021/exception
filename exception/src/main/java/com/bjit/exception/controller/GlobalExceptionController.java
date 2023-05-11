package com.bjit.exception.controller;

import com.bjit.exception.exception.AdminNotFoundException;
import com.bjit.exception.exception.StudentNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionController {
    @ExceptionHandler({AdminNotFoundException.class, StudentNotFoundException.class,ClassNotFoundException.class})
    public ResponseEntity<Object> getNotFoundException(Exception ex){
        if(ex instanceof AdminNotFoundException){
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
        }else if(ex instanceof StudentNotFoundException){
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_GATEWAY);
        }
        else {
            return  new ResponseEntity<>(ex.getMessage(),HttpStatus.BAD_REQUEST);
        }
    }

}
