package com.epam.rd.autotasks;

public class DecrementingCarouselWithLimitRun extends CarouselRun{
    public int decrement = 1;
public int[]array=DecrementingCarousel.container;
    @Override
    public int next() {
            int beforeDecreasing;
            if(isFinished()){
                return -1;
            } else {
                while (array[position %= array.length] <= 0) {
                    position++;
                }
            }
            DecrementingCarouselWithLimitedRun.limit--;
            return array[position++]--;

    }
}
