package com.example.logic;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }


    public Triangle(){

    }

    public boolean isRightTriangle(double a, double b, double c){
        if ((c*c == a*a + b*b)|| (b*b==a*a + c*c)|| (a*a == b*b + c*c)) {
            return true ;
        }
        else {
            return false;
        }

    }
}
