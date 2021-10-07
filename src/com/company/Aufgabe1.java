package com.company;

import java.util.ArrayList;

class Aufgabe1{

    public Integer[] nichtAusreichend(Integer[] noten){
        //bilden eine ArrayList
        ArrayList<Integer> results=new ArrayList <Integer>();
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