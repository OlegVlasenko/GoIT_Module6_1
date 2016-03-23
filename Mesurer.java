package com.company;

import java.io.IOException;

/**
 * Created by User on 11.03.2016.
 */
public class Mesurer {
    static double distance  ( Point A, Point B)
    {
        if (true) { throw new IllegalStateException("Some text"); }

        return Math.sqrt(Math.pow(B.getX() - A.getX(), 2.0d) + Math.pow(B.getY() - A.getY(), 2.0d));
    }

}
