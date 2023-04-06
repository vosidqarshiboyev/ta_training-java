package com.epam.rd.autotasks;

public class CarouselRun {
    protected int position = 0;

    public int next() {
        if(isFinished()){
            return -1;
        }
        while (DecrementingCarousel.container[position %= DecrementingCarousel.container.length] <= 0) {
            position++;
        }

        return DecrementingCarousel.container[position++]--;
    }

    public boolean isFinished() {
        int t=0;
        for(int i=0;i<DecrementingCarousel.container.length;i++){
            if(DecrementingCarousel.container[i]==0){
                t++;
            }
        }
        return t == DecrementingCarousel.container.length;
    }

}
