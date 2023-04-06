package com.epam.rd.autotasks.validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ColorCodeValidation {
    public static boolean validateColorCode(String color) {
        if(color==null){
            return false;
        }
        String regex="^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(color);
        return matcher.matches();
        // Put your code here

    }
}





