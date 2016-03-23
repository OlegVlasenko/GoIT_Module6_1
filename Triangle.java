package com.company;

/**
 * Created by User on 11.03.2016.
 */
public class Triangle extends Figure {
    private double c;

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public Triangle(double a, double b, double c) {
        super(a, b);
        this.c = c;
    }

    @Override
    public double getSquare() {
        double pHalf = getPerimeter()/2;
        return Math.sqrt(Math.abs(pHalf*(pHalf - this.a)*(pHalf - this.b)*(pHalf - this.c)));
    }

    public double getPerimeter() {
        return this.a + this.b + this.c;
    }
}
