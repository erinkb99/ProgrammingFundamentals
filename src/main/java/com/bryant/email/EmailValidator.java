package com.bryant.email;

public class EmailValidator {
    public void validator (String email) {
        if (email.contains("@")){
            System.out.println("true");
        } else { System.out.println("false"); }
    }
}
