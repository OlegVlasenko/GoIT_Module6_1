package com.company;

/**
 * Created by User on 11.03.2016.
 */
public class Circle extends Figure  {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        super(0, 0);
        this.radius = radius;
    }

    @Override
    public double getSquare() {
        if (this.radius == 0) throw new BadParameters("Zero radius");
        return Math.PI * this.radius * this.radius;
    }

}
