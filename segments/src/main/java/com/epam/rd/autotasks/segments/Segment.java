package com.epam.rd.autotasks.segments;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;
import static java.lang.StrictMath.pow;

class Segment {
Point start;
Point end;


    public Segment(Point start, Point end) {
        if(start.getX()==end.getX() && start.getY()==end.getY()){
            throw  new IllegalArgumentException();
        }
        else {
            this.start = start;
            this.end = end;
        }
    }

    double length() {
       int x=(int) Math.abs(start.getX()-end.getX());
       int y=(int)Math.abs(start.getY()-end.getY());
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }

    Point middle() {
        return new Point((start.getX()+end.getX())/2,(start.getY()+end.getY())/2);
    }

    Point intersection(Segment another) {
     double x1=this.start.getX(),
                                        x3=another.start.getX(),
        y1=this.start.getY(),       y3=another.start.getY(),
        x2=this.end.getX(),           x4=another.end.getX(),
        y2=this.end.getY(),             y4=another.end.getY();

    double a = ((x1 * y2 - y1 * x2) * (x3 - x4) - (x1 - x2) * (x3 * y4 - y3 * x4)) / ((x1 - x2) * (y3 - y4) - (y1 - y2) * (x3 - x4));
    double b = ((x1 * y2 - y1 * x2) * (y3 - y4) - (y1 - y2) * (x3 * y4 - y3 * x4)) / ((x1 - x2) * (y3 - y4) - (y1 - y2) * (x3 - x4));

    return new Point(a, b);



}

}
