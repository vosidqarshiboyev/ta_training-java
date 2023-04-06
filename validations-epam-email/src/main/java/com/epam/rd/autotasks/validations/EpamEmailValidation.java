package com.epam.rd.autotasks.validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EpamEmailValidation {

    public static boolean validateEpamEmail(String email) {
        if(email==null){
            return false;
        }
         String regex="^([A-Za-z]+)_(([A-Za-z]+)|([A-Za-z]+[0-9]))@epam.com$";
      //String regex=  "^(.+)_(.+)@epam.com$";
         Pattern pattern=Pattern.compile(regex);
         Matcher matcher=pattern.matcher(email);
         return matcher.matches();
    }
}





