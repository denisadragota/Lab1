package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Aufgabe1 obj1=new Aufgabe1();
        System.out.println("\nAufgabe 1: ");
        System.out.println(Arrays.toString(obj1.nichtAusreichend(new Integer[]{17,45,99,77,40,22})));
        System.out.println((obj1.Durchschnittswert(new Integer[]{17,45,99,77,40,22})));
        System.out.println(Arrays.toString(obj1.abgerundet(new Integer[]{17,45,99,78,44,22})));
        System.out.println((obj1.maxAbgerundeteNote(new Integer[]{17,45,99,77,40,22})));

        Aufgabe2 obj2=new Aufgabe2();
        System.out.println("\nAufgabe 2: ");
        System.out.println(obj2.maximum(new double[]{17,45,99,77,40,22}));
        System.out.println(obj2.minimum(new double[]{17,45,99,77,40,22}));
        System.out.println(obj2.maxSum1(new double[]{100,17,45,99,77,40,22}));
        System.out.println(obj2.maxSum2(new double[]{100,17,45,99,77,40,22}));
        System.out.println(obj2.minSum1(new double[]{17,45,99,77,40,22}));
        System.out.println(obj2.minSum2(new double[]{17,45,99,77,40,22}));

        Aufgabe3 obj3=new Aufgabe3();
        System.out.println("\nAufgabe 3: ");
        System.out.println(Arrays.toString(obj3.Summe(new int[]{9,2,3,4},new int[]{1,2,3,4})));
        System.out.println(Arrays.toString(obj3.Summe(new int[]{9},new int[]{1})));
        System.out.println(Arrays.toString(obj3.Differenz(new int[]{1,0,7},new int[]{3,0,3})));
        System.out.println(Arrays.toString(obj3.Differenz(new int[]{7},new int[]{9})));
        System.out.println(Arrays.toString(obj3.Multiplikation(new int[]{9,2,3,4},3)));
        System.out.println(Arrays.toString(obj3.Multiplikation(new int[]{1,9,0},0)));
        System.out.println(Arrays.toString(obj3.Division(new int[]{9,2,3,4},3)));
        System.out.println(Arrays.toString(obj3.Division(new int[]{9,2,3,4},0)));

        Aufgabe4 obj4=new Aufgabe4();
        System.out.println("\nAufgabe 4: ");
        System.out.println(obj4.minTastatur(new double[]{12,6,22}));
        System.out.println(obj4.maxPreis(new double[]{15,21,3},new double[]{42,6,22}));
        System.out.println(obj4.maxInBudget(new double[]{12,6,22},20));
        System.out.println(obj4.maxSumInBudget(60,new double[]{40,58},new double[]{59,12,9}));
        System.out.println(obj4.maxSumInBudget(60,new double[]{45,50},new double[]{59,12,4}));
        System.out.println(obj4.maxSumInBudget(60,new double[]{40,50,60},new double[]{8,12}));
        System.out.println(obj4.maxSumInBudget(10,new double[]{40,50,60},new double[]{8,12}));


    }
}



