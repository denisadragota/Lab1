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

        Aufgabe3 obj3=new Aufgabe3();
        System.out.println("Aufgabe 3: ");
        System.out.println(Arrays.toString(obj3.Summe(new int[]{9,2,3,4},new int[]{1,2,3,4})));
        System.out.println(Arrays.toString(obj3.Differenz(new int[]{1,0,7},new int[]{3,0,3})));
        System.out.println(Arrays.toString(obj3.Multiplikation(new int[]{9,2,3,4},3)));
        System.out.println(Arrays.toString(obj3.Division(new int[]{9,2,3,4},3)));

        Aufgabe4 obj4=new Aufgabe4();
        System.out.println("Aufgabe 4: ");
        System.out.println(obj4.minTastatur(new double[]{12,6,22}));
        System.out.println(obj4.maxPreis(new double[]{15,21,3},new double[]{42,6,22}));
        System.out.println(obj4.maxUsbInBudget(new double[]{12,6,22},20));


    }
}



