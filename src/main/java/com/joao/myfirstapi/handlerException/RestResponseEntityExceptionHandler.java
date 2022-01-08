package com.joao.myfirstapi.handlerException;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.NoSuchElementException;

@ControllerAdvice
public class RestResponseEntityExceptionHandler  extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = {NoSuchElementException.class})
    public ResponseEntity<String> handlerNoSuchElementException(NoSuchElementException e){
        String bodyResponse = "Usuário não encontrado.";

        return new ResponseEntity<>(bodyResponse,HttpStatus.NOT_FOUND);
    }
}
