package com.epam.rd.autotasks.figures;

import java.util.Arrays;

class Circle extends Figure{
double x1;
double y1;
double radius;

public Circle(Point a,double radius){
    x1=a.getX();
    y1=a.getY();
    this.radius=radius;
}
public Circle(){}
    @Override
    public double area() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public String pointsToString() {
        return String.format("(%.1f,%.1f)",x1,y1);
    }

    @Override
    public Point leftmostPoint() {
       return new Point(x1-radius,y1);
    }
    @Override
    public String toString(){

    int a=tekshir();
    String ad="Circle";
    String ty= ""+ad+""+'['+'('+'%'+'.'+1+'f'+','+'%'+'.'+1+'f'+')'+'%'+'.'+a+'f'+']';

    return String.format(ty,x1,y1,radius);
    }
    private int tekshir(){
     String[] a =(String.valueOf(radius)).split("[.]");
        int sana=0;
        if(a[1].length()==1 && a[1].charAt(0)=='0'){
            return 1;
        }
     for(int i=a[1].length()-1;i>=0;i--){
         if(a[1].charAt(i)=='0'){
             sana++;
         }
         else{
             return a[1].length()-sana;
         }
     }
return 0;

    }



}
