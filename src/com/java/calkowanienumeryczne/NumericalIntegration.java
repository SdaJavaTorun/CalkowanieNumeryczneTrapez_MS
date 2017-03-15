package com.java.calkowanienumeryczne;

import java.util.Scanner;

/**
 * Created by User on 2017-03-14.
 */
public class NumericalIntegration {
    private double integer = 0;

    public NumericalIntegration(){
    }

    public static double function (double x){
        return x*x+6;
    }

    public double integerCount(double xp, double xk, double dx){
        for (double i = xp; i <= xk; i+= dx ) {
            if (i == xp || i == xk) {
                this.integer += (function(i)/2);
            } else {
                this.integer += function(i);
            }
        }    this.integer = this.integer * dx;
        return this.integer;
    }
}
