package com.epam.rd.autotasks.pizzasplit;

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
        //Write a program, reading number of people and number of pieces per pizza and then
        //printing minimum number of pizzas to order to split all the pizzas equally and with no remainder

        Scanner scanner=new Scanner(System.in);
        int people=scanner.nextInt();
        int slices=scanner.nextInt();
        int b=slices;
        int pizza=1;
        while(slices%people!=0){
            slices=slices+b;
            pizza++;
        }
        System.out.println(pizza);
    }
}
