package com.tecsup.petclinic.exception;

public class PetNotFoundException extends Exception {

    public PetNotFoundException(String message) {
        super(message);
    }
}