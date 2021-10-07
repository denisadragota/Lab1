package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Aufgabe1 obj1=new Aufgabe1();
        System.out.println("Aufgabe 1: ");
        System.out.println(Arrays.toString(obj1.nichtAusreichend(new Integer[]{17,45,99,77,40,22})));
        System.out.println((obj1.Durchschnittswert(new Integer[]{17,45,99,77,40,22})));
        System.out.println(Arrays.toString(obj1.abgerundet(new Integer[]{17,45,99,78,44,22})));
        System.out.println((obj1.maxAbgerundeteNote(new Integer[]{17,45,99,77,40,22})));

        Aufgabe2 obj2=new Aufgabe2();
        System.out.println("Aufgabe 2: ");
        System.out.println(obj2.maximum(new Integer[]{17,45,99,77,40,22}));
        System.out.println(obj2.minimum(new Integer[]{17,45,99,77,40,22}));
        System.out.println(obj2.maxSum1(new Integer[]{17,45,99,77,40,22}));
        System.out.println(obj2.maxSum2(new Integer[]{17,45,99,77,40,22}));
        System.out.println(obj2.minSum1(new Integer[]{17,45,99,77,40,22}));
        System.out.println(obj2.minSum2(new Integer[]{17,45,99,77,40,22}));

    }
}



