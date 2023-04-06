package com.rpam.rd.autotasks;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CatchEmAll {

    //You may set another exception in this field;
    static Exception exception = new FileNotFoundException();

    public static void riskyMethod() throws Exception {
        throw exception;
    }

    public static void main(String[] args) throws Exception {
       try {
           riskyMethod();
       }
       catch (FileNotFoundException e){
            throw new IllegalArgumentException("Resource is missing",e);
       }
       catch (IOException t){
           throw new IllegalArgumentException("Resource error",t);
       }
      catch (ArithmeticException d){
           System.err.println(d.getMessage());
       }catch (NumberFormatException d){
           System.err.println(d.getMessage());
       }
    }
}
