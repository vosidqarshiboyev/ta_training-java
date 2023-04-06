package com.epam.rd.autotasks.max;

import java.util.Optional;
import java.util.OptionalInt;

public class MaxMethod {
    public static OptionalInt max(int[] values) {
           if(values!=null && values.length!=0){
               int min=values[0];
               for(int i=1;i<values.length;i++){
                   if(min<values[i]){
                       min=values[i];
                   }
               }
               return OptionalInt.of(min);
           }
           else{
               return  OptionalInt.empty();
           }
    }
}
