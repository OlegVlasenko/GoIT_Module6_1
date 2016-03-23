package com.company;

/**
 * Created by User on 11.03.2016.
 */
public class Rectangle extends Figure {

    public Rectangle(double a, double b) {
        super(a, b);
   }

    @Override
    public double getSquare() {
        return a * b;
    }

}
