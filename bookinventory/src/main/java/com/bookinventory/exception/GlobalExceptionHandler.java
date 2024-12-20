package com.bookinventory.exception;


import org.springframework.web.bind.annotation.ControllerAdvice;

import org.springframework.web.bind.annotation.ExceptionHandler;

import org.springframework.web.bind.annotation.ResponseBody;
 
@ControllerAdvice 

public class GlobalExceptionHandler {
 
    @ExceptionHandler(IdNotFoundException.class)

    @ResponseBody

    public ErrorMsg handleIdNotFoundException(IdNotFoundException ex) {

        ErrorMsg errorMsg = new ErrorMsg();

        errorMsg.setErrorMsg(ex.getMessage());  

        return errorMsg;  

    }
 
    @ExceptionHandler(RoleNumberNotFoundException.class)

    @ResponseBody

    public ErrorMsg handleRoleNumberNotFoundException(RoleNumberNotFoundException ex) {

        ErrorMsg errorMsg = new ErrorMsg();

        errorMsg.setErrorMsg(ex.getMessage());  

        return errorMsg;  

    }
 
    

}

 


