package com.company;

public class Main {

    public static void main(String[] args) {

        //Circle Cir1 = new Circle(25.0d);
        Circle Cir1 = new Circle(0.0d);

        try {
            System.out.println("The square of circle " + Cir1.getRadius() + " is " + Cir1.getSquare());
        } catch ( Exception e) {
            System.out.println(e.toString());
        };

         Triangle Tri1 = new Triangle(12.0d,32.0d,8.0d);

        System.out.println("The square of triangle A = " + Tri1.getA() + "B = " + Tri1.getB() + "C = " + Tri1.getC() + " is " + Tri1.getSquare());

         Rectangle Rec1 = new Rectangle(28.0d,12.6d);

        System.out.println("The square of rectangle A = " + Rec1.getA() + "B = " + Rec1.getB() + " is " + Rec1.getSquare());


        final double TF = 104.0d;
        final double TC = 40.0d;

        System.out.println(TF + " F = " + Temperature.FtoC(TF) + " C");
        System.out.println(TC + " C = " + Temperature.CtoF(TC) + " F");

        Point PointA = new Point( 1d, 2d );
        Point PointB = new Point( 8d, 6d );

        try {
            System.out.println("The distance between A to B is " + Mesurer.distance(PointA, PointB));
        } catch ( Exception e) {
            System.out.println(e.toString());
            //System.out.println(e.getMessage());
        }


    }
}
