package com.company;

public class Aufgabe4 {

    //billigste Tastatur
    //berechnen das Minimum im Array
    //pre: tastaturen=double[], tastaturen.length>0
    //post:min = double, min= kleinste Zahl in tastaturen[]
    public double minTastatur(double[] tastaturen){
        double min=tastaturen[0]; //initial Wert des Minimum =erste Preis
        for (double x:tastaturen) { //durchlaufen array
            if(x<min)
                min=x;
        }
        return min;
    }

    //berechnen Maximum von beide Arrays
    //pre: tastaturen=double[], usb=double[], tastaturen.length>0, usb.length>0
    //post:max = double, max= grosste Zahl in tastaturen[] und usb[]
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
    //pre: usb=double[], usb.length>0, budget = double
    //post: max = double, max= grosste Zahl in usb[] die < budget, oder -1 wenn budget ==0
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
    //pre:tastaturen=double[], usb=double[], tastaturen.length>0, usb.length>0
    //post: double, grosste Zahl< Budget die = Summe zwischen 1 Zahl aus usb und 1 Zahl aus tastaturen
    //post: oder -1, wenn keine Summe<Budget existiert
    public double maxSumInBudget(double budget, double[] usb, double[] tastaturen){
        double maxValueTastatur,maxValueUsb,complInUsb,nr2inTast,nr2inUsb,complInTastatur;
        double budget1=budget, budget2=budget;
        int times=0;//zahlt wie viele Male die Listen von Tastaturen und Usb untersucht sind
        //name = city.getName() == null ? city.getName() : "N/A"
        int maximalLength=usb.length>tastaturen.length ? usb.length : tastaturen.length;
        do {
            times++;
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

        }while((nr2inTast==-1 || nr2inUsb==-1) && times<maximalLength); //wiederholt Suche wenn eine Summe nicht gefunden wurde
        //stoppt wenn alle Paare gecheckt wurden

        if(times==maximalLength) //wenn alle Paare von Summen gecheckt wurden und keine <Budget ist
            return -1;
        //wir vergleichen und senden die grosste Summe
        if(nr2inTast+maxValueUsb > nr2inUsb+maxValueTastatur){
            return nr2inTast+maxValueUsb;
        }
        else
            return nr2inUsb+maxValueTastatur;
    }
}
