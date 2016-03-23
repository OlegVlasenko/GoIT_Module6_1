package com.company;

/**
 * Created by User on 23.03.2016.
 */
public class BadParameters extends IllegalStateException
{
    public BadParameters(String message) {
        super( "My message :" + message);
    }
}
