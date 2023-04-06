package com.epam.rd.autotasks;

public class CarouselRun {

    int position = 0;

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
        if (DecrementingCarouselWithLimitedRun.limit == 0) {
            return true;
        } else {
            for (int i : DecrementingCarousel.container) {
                if (i > 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
