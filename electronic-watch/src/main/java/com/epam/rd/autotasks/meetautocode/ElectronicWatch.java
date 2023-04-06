package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        String hour=(seconds/3600)%24+"";
        String min=seconds%3600/60+"";
        String s=seconds%60+"";
        if(min.length()<2 && min.charAt(0)==0){
            min="00";
        }
        if(min.length()<2 && min.charAt(0)!=0){
            min="0"+min;
        }
        if(s.length()<2 && s.charAt(0)==0){
            s="00";
        }
        if(s.length()<2 && s.charAt(0)!=0){
            s="0"+s;
        }

        String result=hour+":"+min+":"+s;
        System.out.println(result);

    }
}
