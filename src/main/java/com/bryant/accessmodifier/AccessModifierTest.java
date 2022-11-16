package com.bryant.accessmodifier;

import com.bryant.email.EmailValidator;

public class AccessModifierTest {
    public static void main(String[] args) {
        EmailValidator emailValidator = new EmailValidator();

        emailValidator.validator("john@gmail.com");
    }

}
