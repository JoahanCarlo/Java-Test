package org.example.Java_Test.util;

public class PasswordUtil {

    public enum SecurityLevel{
        WEAK ,MEDIUM, STRONG;
    }

    public static SecurityLevel  assessPassword(String Password){

        if(Password.length()<8){
            return  SecurityLevel.WEAK;
        }
        if(Password.matches("[a-zA-z]+")){
            return  SecurityLevel.WEAK;
        }
        if(Password.matches("[a-zA-z0-9]+")){
            return SecurityLevel.MEDIUM;
        }
        return  SecurityLevel.STRONG;
    }
}
