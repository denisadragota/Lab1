package com.company;

import java.util.ArrayList;
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

class Aufgabe1{

    public Integer[] nichtAusreichend(Integer[] noten){
        //bilden eine ArrayList
        ArrayList <Integer> results=new ArrayList <Integer>();
        int i;
        for(i=0;i<noten.length;i++){ //Durchlaufen alle Noten
            if(noten[i]<40) { //Bedingung fur nichtausreichende Noten
                results.add(noten[i]); //add jede Note <40 in die ArrayList
            }
        }
        Integer[] arrayResults=new Integer[]{}; //bilden eine neue leere array
        arrayResults=results.toArray(arrayResults);//convert die ArrayList in eine array
        return arrayResults; //return array
    }

    public double Durchschnittswert(Integer[] noten){
        int i;
        double sum=0;
        for(i=0;i<noten.length;i++){ //Durchlaufen alle Noten
            sum+=noten[i]; //add jede Note zu Summe
        }

        return sum/noten.length; //berechnen und return average
    }

    public Integer[] abgerundet(Integer[] noten){
        //bilden eine ArrayList
        ArrayList <Integer> results=new ArrayList <Integer>();
        int i, div, mul;
        for(i=0;i<noten.length;i++){ //Durchlaufen alle Noten
            div=noten[i]/5; //ganze Teil von vorige Vielfache von 5
            mul=5*(div+1);//nachste Vielfache von 5
            if(mul-noten[i]<3 && noten[i] >= 38) { //Bedingung fur abgerundete Noten
                results.add(noten[i]); //add jede Note <40 in die ArrayList
            }
        }
        Integer[] arrayResults=new Integer[]{}; //bilden eine neue leere array
        arrayResults=results.toArray(arrayResults);//convert die ArrayList in eine array
        return arrayResults; //return array
    }

    public int maxAbgerundeteNote(Integer[] noten){
        int i, max;
        Integer[] abgerundeteNoten=abgerundet(noten);//aufrufen Methode abgerundet und speichern die Liste
        max=abgerundeteNoten[0];
        for(i=0;i<abgerundeteNoten.length;i++){ //durchglaufen die Liste der abgerundeten Zahlen
            //speichern Maximum
            if(max<abgerundeteNoten[i])
                max=abgerundeteNoten[i];
        }
        return max;
    }
}

class Aufgabe2{
    //Durchlaufen alle Zahlen, und vergleichen jede mit einen kurrenten Maximum
    public int maximum(Integer[] zahlen){
        int i,max=zahlen[0];
        for(i=1;i<zahlen.length;i++){
            if(zahlen[i]>max)
                max=zahlen[i];
        }
        return max;
    }
    //Durchlaufen alle Zahlen, und vergleichen jede mit einen kurrenten Minimum
    public int minimum(Integer[] zahlen){
        int i,min=zahlen[0];
        for(i=1;i<zahlen.length;i++){
            if(zahlen[i]<min)
                min=zahlen[i];
        }
        return min;
    }

    //maximale Summe von n-1 Zahlen = Summe aller Zahlen - minimale Zahl
    //Methode 1: wir verwenden die Methode minimum()
    //weniger effizient, weil wir 2-mal durch die Zahlen durchlaufen
    public int maxSum1(Integer[] zahlen){
        int i,sum=0;
        for(i=1;i<zahlen.length;i++)
            sum+=zahlen[i];
        sum-=minimum(zahlen);
        return sum;
    }

    //Methode 2: bei einem Durchlaufen(effizient), wir berechnen die Summe und speichern das Minimum, un am Ende subtrahieren
    public int maxSum2(Integer[] zahlen){
        int i,sum=0,min=zahlen[0];
        for(i=1;i<zahlen.length;i++) {
            sum += zahlen[i];
            if (zahlen[i] < min)
                min = zahlen[i];
        }
        sum-=min;
        return sum;
    }

    //minimale Summe von n-1 Zahlen = Summe aller Zahlen - maximale Zahl
    //Methode 1: wir verwenden die Methode minimum()
    //weniger effizient, weil wir 2-mal durch die Zahlen durchlaufen
    public int minSum1(Integer[] zahlen){
        int i,sum=0;
        for(i=1;i<zahlen.length;i++)
            sum+=zahlen[i];
        sum-=maximum(zahlen);
        return sum;
    }

    //Methode 2: bei einem Durchlaufen(effizient), wir berechnen die Summe und speichern das Maximum, un am Ende subtrahieren
    public int minSum2(Integer[] zahlen){
        int i,sum=0,max=zahlen[0];
        for(i=1;i<zahlen.length;i++) {
            sum += zahlen[i];
            if (zahlen[i] > max)
                max = zahlen[i];
        }
        sum-=max;
        return sum;
    }
}
