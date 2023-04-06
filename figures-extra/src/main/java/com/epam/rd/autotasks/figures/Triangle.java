package com.epam.rd.autotasks.figures;

class Triangle extends Figure{
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;

    public Triangle(Point a,Point b,Point c){
        if(a==null || b==null || c==null){
            throw new IllegalArgumentException();
        }
        int asd=(int) (a.getX()*(b.getY()-c.getY())+
                b.getX()*(c.getY()-a.getY())+
                c.getX()*(a.getY()-b.getY()));

        if( asd==0 ) {
           throw new IllegalArgumentException();
        }
        else {
            x1 = a.getX();
            x2 = b.getX();
            x3 = c.getX();
            y1 = a.getY();
            y2 = b.getY();
            y3 = c.getY();
        }
    }






    @Override
    public String toString(){
        return String.format("Triangle[(%.1f,%.1f)(%.1f,%.1f)(%.1f,%.1f)]",x1,y1,x2,y2,x3,y3);
    }

    @Override
    public Point centroid() {
        return new Point( ((x1+x2+x3)/3), (y1+y2+y3)/3);
    }

    @Override
    public boolean isTheSame(Figure figure) {
        if(figure instanceof Triangle){
            return true;
        }
        return false;
    }
}
