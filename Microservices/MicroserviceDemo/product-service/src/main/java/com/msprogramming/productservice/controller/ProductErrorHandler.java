package com.msprogramming.productservice.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.resource.NoResourceFoundException;

@RestController
@ControllerAdvice
public class ProductErrorHandler {

    @ExceptionHandler(NoResourceFoundException.class)
    public String HandleException(NoResourceFoundException e){
        return "<H1> Wrong request made , no such API ==> <H1>";
    }
}
