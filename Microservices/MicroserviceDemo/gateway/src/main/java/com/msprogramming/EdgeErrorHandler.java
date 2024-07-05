package com.msprogramming;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.resource.NoResourceFoundException;


@RestController
@ControllerAdvice
public class EdgeErrorHandler {

    @ExceptionHandler(NoResourceFoundException.class)
    public String HandleException(NoResourceFoundException e){
        return "<H1> Wrong request made , no such API ==> <H1>";
    }
    @GetMapping("/inCaseOfFailureUseThis")
    public String HandleFallback(){
        return "Fallback for method";
    }
}
