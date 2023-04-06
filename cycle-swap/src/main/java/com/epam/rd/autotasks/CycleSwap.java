package com.epam.rd.autotasks;

class CycleSwap {
    static void cycleSwap(int[] array) {
if(array.length!=0) {
    int a = array[array.length - 1];
    for (int i = array.length - 1; i > 0; i--) {
        array[i] = array[i - 1];
    }
    array[0] = a;
}
    }

    static void cycleSwap(int[] array, int shift) {
        if(array.length!=0) {
            while (shift != 0) {
                int a = array[array.length - 1];

                for (int i = array.length - 1; i > 0; i--) {
                    array[i] = array[i - 1];
                }
                array[0] = a;
                shift--;
            }
        }
    }
}
