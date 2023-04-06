package com.epam.rd.autotasks.snail;

import java.util.Scanner;

public class Snail
{
    public static void main(String[] args)
    {
        //Write a program that reads a,b and h (line by lyne in this order) and prints
        //the number of days for which the snail reach the top of the tree.
        //a - feet that snail travels up each day, b - feet that slides down each night, h - height of the tree
        Scanner scanner=new Scanner(System.in);
        int go=scanner.nextInt();
        int down=scanner.nextInt();
        int height=scanner.nextInt();
        int day=0;
        int sum=0;
        if(go<height && go-down<=0){
            System.out.println("Impossible");
        }
        else {
            int result = go - down;
            while (true) {
                if (sum + go >= height) {
                    break;
                }
                sum = sum + result;
                day++;
            }
            System.out.println(day + 1);

        }

    }
}
