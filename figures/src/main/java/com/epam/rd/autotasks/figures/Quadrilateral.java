package com.epam.rd.autotasks.figures;

class Quadrilateral extends Figure{
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;
    private double x4;
    private double y4;

    public Quadrilateral(Point a,Point b,Point c,Point d) {
        if (a != null && b != null && c != null && d != null) {
            x1 = a.getX();
            x2 = b.getX();
            x3 = c.getX();
            y1 = a.getY();
            y2 = b.getY();
            y3 = c.getY();
            x4 = d.getX();
            y4 = d.getY();
        }
    }
    @Override
    public double area() {
        return (0.5) * Math.abs((x1 * y2 + x2 * y3 + x3 * y4 + x4 * y1) - (x2 * y1 + x3 * y2 + x4 * y3 + x1 * y4));
    }

    @Override
    public String pointsToString() {
        return String.format("(%.1f,%.1f)(%.1f,%.1f)(%.1f,%.1f)(%.1f,%.1f)",x1,y1,x2,y2,x3,y3,x4,y4);
    }

    @Override
    public Point leftmostPoint() {
        double min;
        min=Math.min(x1,x2);
        min=Math.min(min,x3);
        min=Math.min(min,x4);
        if(min==x1){
            return new Point(min,y1);
        }
        if(min==x2){
            return new Point(min,y2);
        }
        if(min==x3){
            return new Point(min,y3);
        }

            return new Point(min,y4);

    }
}
