package com.epam.rd.autotasks;

public class DecrementingCarousel {
    static int capacity;
    static int[] container;
    int index;
    boolean isRun;

    public DecrementingCarousel(int capacity) {
        DecrementingCarousel.capacity = capacity;
        container = new int[capacity];
    }

    {
        index = 0;
        isRun = false;
    }

    public boolean addElement(int element) {
        if (element > 0 && index < container.length && !isRun) {
            container[index++] = element;
            return true;
        }
        return false;
    }

    public CarouselRun run() {
        if (!isRun) {
            isRun = true;
            return new CarouselRun();
        }
        return null;
    }
}