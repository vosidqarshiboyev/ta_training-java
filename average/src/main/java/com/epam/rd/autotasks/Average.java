package com.epam.rd.autotasks;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        // Use Scanner methods to read input
        Scanner scanner=new Scanner(System.in);
        int b=scanner.nextInt();
        int son=0;
        int sum=b;

        while(b!=0){

            b=scanner.nextInt();
            sum=sum+b;
            son++;
        }

        System.out.println(sum/son);
    }

}