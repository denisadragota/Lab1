package com.company;

import java.util.Arrays;

public class Aufgabe4 {
    //billigste Tastatur
    //berechnen das Minimum im Array
    public double minTastatur(double[] tastaturen){
        double min=tastaturen[0]; //initial Wert des Minimum =erste Preis
        for (double x:tastaturen) { //durchlaufen array
            if(x<min)
                min=x;
        }
        return min;
    }

    //berechnen Maximum von beide Arrays
    public double maxPreis(double[] tastaturen, double[] usb){
        double max=tastaturen[0]; //initial Wert des Maximum =erste Preis
        for (double x:tastaturen) { //durchlaufen array Tastaturen
            if(x>max)
                max=x;
        }
        for (double x:usb) { //durchlaufen array Usb
            if(x>max)
                max=x;}
        return max;
    }

    //berechnen Max Preis < Budget
    public double maxInBudget(double[] usb, double budget){
        double max=-1; //initial Wert des Maximum =erste Preis
        for (double x:usb) { //durchlaufen array Tastaturen
            if(x>max && x<=budget) //doppelte Bedingung
                max=x;
        }
        return max;
    }

    //wir berechnen in Parallel die grossten moglichen Summen in Budget:
    // -die grosste Zahl aus Usb und Complement aus Tastatur
    //-die grosste Zahl aus Tastatur und Complement aus Usb
    public double maxSumInBudget(double budget, double[] usb, double[] tastaturen){
        double maxValueTastatur,maxValueUsb,complInUsb,nr2inTast,nr2inUsb,complInTastatur;
        double budget1=budget, budget2=budget;
        do {
            maxValueTastatur = maxInBudget(tastaturen, budget1 - 1); //Zahl1Tast=grosste Preis Tastatur<Budget
            maxValueUsb = maxInBudget(usb, budget2 - 1); //Zahl1Usb=grosste Preis Usb<Budget
            complInUsb = budget - maxValueTastatur; //Differenz zw Budget und Zahl1Tast =Budget fur Complement der Summe
            complInTastatur = budget - maxValueUsb; //Differenz zw Budget und Zahl1Usb = Budget fur Complement der Summe

            nr2inTast = maxInBudget(tastaturen, complInTastatur);//gefundene Complement
            nr2inUsb = maxInBudget(usb, complInUsb); //gefundene Complement
            //System.out.println(nr2inTast);
            //System.out.println(nr2inUsb);
            if(nr2inTast==-1) //wenn Complement nicht exisitiert
                budget2=maxValueUsb; //wir suchen weiter die grosste Zahl in neuem Budget (kleiner als die vorige grosste Zahl)

            if(nr2inUsb==-1) //wenn Complement nicht exisitiert
                budget1=maxValueTastatur; //wir suchen weiter die grosste Zahl in neuem Budget (kleiner als die vorige grosste Zahl)

        }while(nr2inTast==-1 || nr2inUsb==-1); //wiederholt Suche wenn eine Summe nicht gefunden wurde

        //wir vergleichen und senden die grosste Summe
        if(nr2inTast+maxValueUsb > nr2inUsb+maxValueTastatur){
            return nr2inTast+maxValueUsb;
        }
        else
            return nr2inUsb+maxValueTastatur;
    }
}
