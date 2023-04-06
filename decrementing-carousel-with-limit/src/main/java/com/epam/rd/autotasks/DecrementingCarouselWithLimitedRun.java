package com.epam.rd.autotasks;

public class DecrementingCarouselWithLimitedRun extends DecrementingCarousel{
    static int limit;
    public DecrementingCarouselWithLimitedRun(final int capacity, final int actionLimit) {


        super(capacity);
        limit=actionLimit;
    }
    @Override
    public CarouselRun run() {
        if (!isRun) {
            isRun = true;
            return new DecrementingCarouselWithLimitRun();
        }
        return null;
    }

}
