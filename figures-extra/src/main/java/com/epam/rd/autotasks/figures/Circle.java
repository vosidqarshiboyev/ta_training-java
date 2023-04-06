package com.epam.rd.autotasks.figures;

class Circle extends Figure{
    double x1;
    double y1;
    double radius;

    public Circle(Point a,double radius){
        if(a==null || radius<=0){
            throw new IllegalArgumentException();
        }
        x1=a.getX();
        y1=a.getY();
        this.radius=radius;
    }


    @Override
    public Point centroid() {
        return new Point(radius,radius);
    }

    @Override
    public boolean isTheSame(Figure figure) {
        return figure instanceof Circle;
    }
}
