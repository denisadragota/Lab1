package com.company;

import java.util.ArrayList;

class Aufgabe1{

    //durchlauft alle Zahlen und bildet eine neue ArrayList mit den nicht ausreichenden und dann convertiert es und gibt zuruck ein Array
    //pre:noten= Integer[]
    //post: arrayResults=Integer[] mit nicht ausreichende Noten, oder leere array wenn es keine existiert
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

    //durchlauft alle Zahlen und berechnet ihre Summe und am Ende teilt sie mit ihre Anzahl
    //pre:noten= Integer[]
    //post: Durchscnittswert (double), -1 wenn array leer ist
    //Ausnahmen: wenn die Noten Array leer ist, dann muss man mit 0 teilen und das ist unmoglich, also es gibt zuruck -1
    public double Durchschnittswert(Integer[] noten){
        int i;
        double sum=0;
        if(noten.length==0)
            return -1;
        for(i=0;i<noten.length;i++){ //Durchlaufen alle Noten
            sum+=noten[i]; //add jede Note zu Summe
        }
        return sum/noten.length; //berechnen und return average
    }

    //berechnet fur jede Zahl sein nachste Vielfache von 5 und die Differenz zwischen ihnen und bildet eine neue Array mit den abgerundeten Noten
    //pre:noten= Integer[],noten.length>0
    //post: arrayResults=Integer[] mit abgerundeten Noten
    public Integer[] abgerundet(Integer[] noten){
        //bilden eine ArrayList
        ArrayList <Integer> results=new ArrayList <Integer>();
        int i, div, mul;
        for(i=0;i<noten.length;i++){ //Durchlaufen alle Noten
            div=noten[i]/5; //ganze Teil von vorige Vielfache von 5
            mul=5*(div+1);//nachste Vielfache von 5
            if(mul-noten[i]<3 && noten[i] >= 38) { //Bedingung fur abgerundete Noten
                results.add(mul); //add jede Note <40 in die ArrayList
            }
            else
                results.add(noten[i]);
        }
        Integer[] arrayResults=new Integer[]{}; //bilden eine neue leere array
        arrayResults=results.toArray(arrayResults);//convert die ArrayList in eine array
        return arrayResults; //return array
    }

    //verwendet die Methode abgerundet() um die abgerundeten Zahlen zu extrahieren und nur zwischen diesen den Maximum zu finden
    //pre:noten= Integer[], noten.length>0
    //post:max=int, max ist abgerundete Note, max= grosste abgerundete Note
    public int maxAbgerundeteNote(Integer[] noten){
        int i, max=-1;
        Integer[] abgerundeteNoten=abgerundet(noten);//aufrufen Methode abgerundet und speichern die Liste
        for(i=0;i<abgerundeteNoten.length;i++){ //durchglaufen die Liste der abgerundeten Zahlen
            //speichern Maximum
            if(max<abgerundeteNoten[i])
                max=abgerundeteNoten[i];
        }
        return max;
    }
}