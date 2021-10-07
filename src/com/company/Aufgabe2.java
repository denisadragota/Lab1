package com.company;

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
