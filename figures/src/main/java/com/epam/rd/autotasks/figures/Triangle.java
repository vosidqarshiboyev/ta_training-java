package com.epam.rd.autotasks.figures;

class Triangle extends Figure{
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;

    public Triangle(Point a,Point b,Point c){
           x1=a.getX();
           x2=b.getX();
           x3=c.getX();
           y1=a.getY();
           y2=b.getY();
           y3=c.getY();
     }




    @Override
    public double area() {
       return  0.5*Math.abs(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2));
    }

    @Override
    public String pointsToString() {
        return String.format("(%.1f,%.1f)(%.1f,%.1f)(%.1f,%.1f)",x1,y1,x2,y2,x3,y3);
    }

    @Override
    public Point leftmostPoint() {
        Point d;
        double min=Math.min(x1,x2);
        min= Math.min(min,x3);
        if(min==x1){
            return new Point(min,y1);
        }
        else if(min==x2){
            return new Point(min,y2);
        }
        else{
            return new Point(min,y3);
        }

    }
    @Override
    public String toString(){
        return String.format("Triangle[(%.1f,%.1f)(%.1f,%.1f)(%.1f,%.1f)]",x1,y1,x2,y2,x3,y3);
    }
}
