package com.epam.rd.autotasks.triangle;

class Triangle {
Point a;
Point b;
Point c;
    public Triangle(Point a, Point b, Point c) {

        if(0.5* ( a.getX() * (b.getY() - c.getY()) +
                b.getX() * (c.getY() - a.getY()) +
                c.getX() * (a.getY() - b.getY()))==0){
            throw new IllegalArgumentException();
        }

        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double area() {
       return (0.5* (( a.getX() * (b.getY() - c.getY()) +
                b.getX() * (c.getY() - a.getY()) +
                c.getX() * (a.getY() - b.getY()))));

    }

    public Point centroid(){
      return new Point  ((a.getX()+b.getX()+c.getX())/3, (a.getY()+b.getY()+c.getY())/3);
    }

}
