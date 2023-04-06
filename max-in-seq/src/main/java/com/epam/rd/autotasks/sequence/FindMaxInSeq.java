package com.epam.rd.autotasks.sequence;
import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {

        // Put your code here
        Scanner scanner=new Scanner(System.in);
        int b=scanner.nextInt();
        int son=b;

        while(b!=0){
            if(b>son){
                son=b;
            }
            b=scanner.nextInt();
        }

        return son;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        System.out.println(max());
    }
}
