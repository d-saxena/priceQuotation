package com.sapeint.publicis.controller;

import com.sapeint.publicis.exceptions.UnservicableLocationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.net.UnknownServiceException;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(UnservicableLocationException.class)
    public ResponseEntity<UnknownServiceException> handleUnknownServiceException(UnknownServiceException ex) {
        return new ResponseEntity<>(ex, HttpStatus.BAD_REQUEST);
    }
}
