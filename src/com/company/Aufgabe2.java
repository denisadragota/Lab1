package com.company;

class Aufgabe2{
    //Durchlaufen alle Zahlen, und vergleichen jede mit einen kurrenten Maximum
    //pre:zahlen=double[],zahlen.length>0
    //post:max=double, max=grosste Zahl von zahlen[]
    public double maximum(double[] zahlen){
        double max=zahlen[0];
        int i;
        for(i=1;i<zahlen.length;i++){
            if(zahlen[i]>max)
                max=zahlen[i];
        }
        return max;
    }
    //Durchlaufen alle Zahlen, und vergleichen jede mit einen kurrenten Minimum
    //pre:zahlen=double[], zahlen.length>0
    //post:min=double, min=kleinste Zahl von zahlen[]
    public double minimum(double[] zahlen){
        int i;
        double min=zahlen[0];
        for(i=1;i<zahlen.length;i++){
            if(zahlen[i]<min)
                min=zahlen[i];
        }
        return min;
    }

    //maximale Summe von n-1 Zahlen = Summe aller Zahlen - minimale Zahl
    //Methode 1: wir verwenden die Methode minimum()
    //weniger effizient, weil wir 2-mal durch die Zahlen durchlaufen
    //pre:zahlen=double[],zahlen.length>0
    //post:sum=double, sum=maximale Summe von n-1 Zahlen von zahlen[]
    public double maxSum1(double[] zahlen){
        int i;
        double sum=0;
        for(i=0;i<zahlen.length;i++)
            sum+=zahlen[i];
        sum-=minimum(zahlen);
        return sum;
    }

    //Methode 2: bei einem Durchlaufen(effizient), wir berechnen die Summe und speichern das Minimum, un am Ende zu subtrahieren
    //pre:zahlen=double[],zahlen.length>0
    //post:sum=double, sum=maximale Summe von n-1 Zahlen von zahlen[]
    public double maxSum2(double[] zahlen){
        int i;
        double sum=0,min=zahlen[0];
        for(i=0;i<zahlen.length;i++) {
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
    //pre:zahlen=double[], zahlen.length>0
    //post:sum=double, sum=minimale Summe von n-1 Zahlen von zahlen[]
    public double minSum1(double[] zahlen){
        int i;
        double sum=0;
        for(i=0;i<zahlen.length;i++)
            sum+=zahlen[i];
        sum-=maximum(zahlen);
        return sum;
    }

    //Methode 2: bei einem Durchlaufen(effizient), wir berechnen die Summe und speichern das Maximum, un am Ende subtrahieren
    //pre:zahlen.length>0, zahlen=double[]
    //post:sum=double, sum=minimale Summe von n-1 Zahlen von zahlen[]
    public double minSum2(double[] zahlen){
        int i;
        double sum=0,max=zahlen[0];
        for(i=0;i<zahlen.length;i++) {
            sum += zahlen[i];
            if (zahlen[i] > max)
                max = zahlen[i];
        }
        sum-=max;
        return sum;
    }
}
