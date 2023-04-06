package com.epam.rd.autotasks.arrays;

import java.util.Arrays;

public class LocalMaximaRemove {

    public static void main(String[] args) {
        int[] array = new int[]{-3, 2, 4, 3, 5, 12, 8};

        System.out.println(Arrays.toString(removeLocalMaxima(array)));
    }

    public static int[] removeLocalMaxima(int[] array){
int[]sonlar=Arrays.copyOf(array,array.length);
        //put your code here
        int belgi =0;
        int a=0;
        for(int i=0;i<array.length;i++){
            if((i==0 && array[i]>array[i+1])|| (i==array.length-1 && array[i]>array[i-1])){
                sonlar[i]=-333;
                belgi++;
            }
            else if (i!=0 && i!=array.length-1 && array[i] > array[i - 1] && array[i] > array[i + 1]) {
                sonlar[i] = -333;
                belgi++;
            }
        }
         if(belgi==0){
             return Arrays.copyOf(array,array.length);
         }
         int ad=0;
int []sonlar1=new int[array.length-belgi];
         for(int i=0;i<sonlar.length;i++){
             if(sonlar[i]!=-333){
                 sonlar1[ad++]=sonlar[i];
             }
         }
return sonlar1;
    }
}
