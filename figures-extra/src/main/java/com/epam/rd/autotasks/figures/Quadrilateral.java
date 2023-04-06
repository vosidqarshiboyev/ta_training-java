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
        if (a == null || b == null || c == null || d == null) {
           throw new IllegalArgumentException();
        }
        int asd=(int) (((a.getX() * b.getY() + b.getX() * c.getY() + c.getX() * d.getY()
                + d.getX() * a.getY()) - (b.getX() * a.getY()
                + c.getX() * b.getY() + d.getX() * c.getY() + a.getY() * d.getY())));

        if(asd==0){
            throw new IllegalArgumentException();
      }
       else {
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
    public Point centroid() {
        return null;
    }

    @Override
    public boolean isTheSame(Figure figure) {
        return figure instanceof Quadrilateral && figure.equals(this);
    }
}
