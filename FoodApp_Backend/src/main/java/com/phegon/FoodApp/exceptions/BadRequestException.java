package com.phegon.FoodApp.exceptions;

import org.modelmapper.internal.bytebuddy.implementation.bind.annotation.Super;

public class BadRequestException extends RuntimeException{

    public BadRequestException(String message){
        Super(message);
    }
}
