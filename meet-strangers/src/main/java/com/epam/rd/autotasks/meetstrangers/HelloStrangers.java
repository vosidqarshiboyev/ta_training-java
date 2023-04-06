package com.epam.rd.autotasks.meetstrangers;

import java.io.*;
import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args) throws IOException {
        //Write a program, asks for a number - amount of strangers to meet.
        //Then reads stranger names line by line and prints line by line "Hello, ...".
         int index=0;
        InputStreamReader ir = new InputStreamReader(System. in );
        BufferedReader br = new BufferedReader(ir);
        Scanner scanner=new Scanner(System.in);
        int num= scanner.nextInt();


        if(num==0){
            System.out.println("Oh, it looks like there is no one here");
        }
        else if(num<0){
            System.out.println("Seriously? Why so negative?");
        }
        else{
            String[] arr = new String[num];


            while(index<num){
                String b=br.readLine();
                    arr[index]=b;
                    index++;


            }

                for(int i=0;i<arr.length;i++){
                    System.out.println("Hello, "+arr[i]);

            }
        }


    }
}
