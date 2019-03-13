package com.company;

import com.company.Task3.Figure;
import com.company.Task3.Point;

public class Main {

    public static void main(String[] args) {
//        final double n = 3;
//        Fraction b = new Fraction();
//        Fraction result[] = new Fraction[3];
//
//        result[0] = new Fraction(13, 12);
//        result[1] = new Fraction(22, 41);
//        result[2] = new Fraction(33, 21);
//        b.FractionSum(result);
//        b.FractionMult(result);
//        System.out.println(b);
        Figure triangle = new Figure("Triangele",new Point(4,7,"A"),
                new Point(3,5,"B"),new Point(4,9,"C"));
        System.out.println(triangle);


    }
}
