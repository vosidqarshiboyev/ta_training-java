package com.epam.rd.autotasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;

public enum Direction {
    N(0),
    NE(45),
    E(90),
    SE(135),
    S(180),
    SW(225),
    W(270),
    NW(315);

    Direction(final int degrees) {
        this.degrees = degrees;
    }

    private int degrees;

    public static Direction ofDegrees(int degrees) {

        for(Direction d:Direction.values()){
            if(d.degrees==degrees%360){
                return d;
            }
        }
        return null;
    }

    public static Direction closestToDegrees(int degrees) {
        ArrayList<Integer>arrayList=new ArrayList<>();
        ArrayList<Integer>arrayList1=new ArrayList<>();
        for(Direction d:Direction.values()){
            if(d.degrees%360<degrees%360){
                arrayList.add(d.degrees);
            }
            else {
                arrayList1.add(d.degrees);
            }
        }
        Integer min=null;
        Integer max = null;
        if(!arrayList.isEmpty()) {
          min = Collections.max(arrayList);
        }
        if(!arrayList1.isEmpty()) {
           max = Collections.min(arrayList1);
        }
        int belgi=-1;
        if(min!=null && max!=null) {
            if (degrees - min < max - degrees) {
                belgi = min;
            } else {
                belgi = max;
            }
        }
        if(belgi!=-1) {
            for (Direction d : Direction.values()) {
                if (d.degrees == belgi) {
                    return d;
                }
            }
        }
        return null;
    }

    public Direction opposite() {
        for(Direction direction:Direction.values()){
            if(direction.degrees==Math.abs(this.degrees-180)){
                return direction;
            }
        }
        return null;
    }

    public int differenceDegreesTo(Direction direction) {
        return Math.abs(this.degrees-direction.degrees);
    }
}
