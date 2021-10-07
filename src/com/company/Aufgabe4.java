package com.company;

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
                max=x;
        }
        return max;
    }

    //berechnen Max Preis < Budget
    public double maxUsbInBudget(double[] usb, double budget){
        double max=-1; //initial Wert des Maximum =erste Preis
        for (double x:usb) { //durchlaufen array Tastaturen
            if(x>max && x<=budget) //doppelte Bedingung
                max=x;
        }
        return max;
    }
}
