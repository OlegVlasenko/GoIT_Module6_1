package com.company;

/**
 * Created by User on 11.03.2016.
 */
abstract public class Temperature {

    static final double CONST_9div5 = 9.0d / 5.0d;
    static final double CONST_5div9 = 5.0d / 9.0d;
    static final double CONST_32 = 32.0d;

    static double CtoF(double tempC) {
        return CONST_9div5 * tempC + CONST_32;
    }

    static double FtoC(double tempF) {
        return CONST_5div9 * (tempF - CONST_32);
    }

}
