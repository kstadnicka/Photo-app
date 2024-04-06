package org.kamilastd.Entity;

public record ClientEntity (
        Long id,
        String firstName,
        String lastName,
        String email,
        Long phoneNumber
){

}
