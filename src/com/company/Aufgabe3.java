package com.company;

import java.util.Arrays;


public class Aufgabe3 {
    //wir berechnen die Summe je 2 Ziffern von derselben Position und addieren den Rest, der von der vorigen Summe geblieben ist
    //Rest=summe/10, wenn die Summe>9 ist
    public int[] Summe(int[] zahl1, int[] zahl2){
        int n= zahl1.length, rest=0, posSum=0;
        int[] result=new int[n+1]; //Result-Array mit n+1 Positionen (kann eine Ziffer mehr haben, Uberschuss)
        Arrays.setAll(result, p->0);//initialisieren mit 0 alle Positionen
        //wir beginnen vom Ende der Zahlen die Additionen auf Positionen
        while(n>0){
            posSum=zahl1[n-1]+zahl2[n-1]+rest; //die Summe 2-er Ziffer + vorige gebliebene Rest
            if(posSum<10) {
                result[n] = posSum; //speichern die Summe der Ziffern auf jede Position
                rest=0;
            }
            else { //wenn die Summe>9 ist
                result[n]=posSum%10; //speichern die letzte Ziffer der Summe
                rest=posSum/10; //Rest gespeichert und addieren bei der nachsten Position
            }
            n--;
        }
        result[0]=rest; //die Result-Zahl kann eine Ziffer mehr haben, wenn Rest bleibt

        if(result[0]==0) //wenn Rest=0 (erste Ziffer=0), dann senden wir das Ergebnis beginnend von der 2-ten Position
            return Arrays.copyOfRange(result,1,zahl1.length+1);
        else //erste Position ist nicht Null
            return result;
    }

    //wir vergleichen die zwei Zahlen und berechnen die Differenz zwischen der grossten und der kleinsten (und stellen ein (-) Zeihen wenn sie verwechselt waren)
    public int[] Differenz(int[] zahl1, int[] zahl2){
        int n= zahl1.length, posDiff=0, lastNotNullPos=0;
        int[] result=new int[n]; //Result Array
        boolean negative=false; //wenn die erste gegebene Zahl < zweite Zahl, dann stellen wir ein (-) Zeichen beim Ergebnis
        Arrays.setAll(result, p->0);

        //vergleichen die zwei Zahlen als Strings
        String string1=Arrays.toString(zahl1);
        String string2=Arrays.toString(zahl2);
        if(string1.compareTo(string2)<0) { //wenn erste Zahl< zweite Zahl
            //wir verwechseln sie untereinander und berechnen die Differenz zw grosse Zahl-kleine Zahl
            negative=true; //das zeigt uns, dass die Differenz negativ sein muss
            int[] aux=zahl1;
            zahl1=zahl2;
            zahl2=aux;
        }

        //jetzt haben wir in zahl1 die grosste Zahl
        while(n>0){
            posDiff=zahl1[n-1]-zahl2[n-1];
            if(posDiff<0) { //wir mussen 10 borgen
                int borrowPosition=n-2; //Position von wo zu borgen
                //wir suchen die gute Position zu borgen
                while(borrowPosition >=0 && zahl1[borrowPosition]-1<0 ){
                    zahl1[borrowPosition]=9;
                    borrowPosition--;
                }
                zahl1[borrowPosition] -= 1; //borgen
                posDiff = zahl1[n - 1] + 10 - zahl2[n - 1]; //differenz der 2 Ziffern von derselben Position
                result[n-1] = posDiff; //speichern Differenz
            }
            else {//man muss nicht borgen
                result[n-1]=posDiff; //speichern Differenz
            }

            if(result[n-1]!=0) //wir speichern die letzte nicht-Null Position (vom Anfang die erste)
                lastNotNullPos=n-1;
            n--;
        }
        if(negative) //wenn am Anfang beim Vergleich die Differenz der Zahlen negativ sein musste
            result[lastNotNullPos]*=(-1); //wir stellen ein (-) Zeichen vor der ersten nicht-Null Ziffer
        return result;
    }

    //wir berechnen die Multiplikation jeder Position mit der gegebenen Ziffer und addieren den Rest, der von der vorigenMultiplikation geblieben ist
    //Rest=multipl/10, wenn die Multipl>9 ist
    public int[] Multiplikation(int[] zahl1, int ziffer){
        int n= zahl1.length, rest=0, posMul=0;
        int[] result=new int[n+1]; //Result-Array mit n+1 Positionen (kann eine Ziffer mehr haben, Ubserschuss)
        Arrays.setAll(result, p->0);
        while(n>0){
            posMul=zahl1[n-1]*ziffer+rest; //Multiplikation + vorherige Rest geblieben
            if(posMul<10) { //kein Rest bleibt
                result[n] = posMul; //speichern Multiplikation Ziffer
                rest=0;
            }
            else { //bleibt Rest
                result[n]=posMul%10; //speichern letzte Ziffer der Multiplikation
                rest=posMul/10; //speichern Rest
            }
            n--;
        }
        result[0]=rest; //erste Ziffer = 0 oder gebliebene Rest

        if(result[0]==0) //wenn kein Uberschuss war, dann senden wir den Array ohne 0 am Anfang
            return Arrays.copyOfRange(result,1,zahl1.length+1);
        else //ganze Array
            return result;
    }

    //berechnen fur jede Position den Quotient also (Position + 10*rest)/ziffer
    //Rest bleibt, wenn eine Division nicht exakt ist, also % ziffer
    public int[] Division(int[] zahl1, int ziffer){
        int n=0, rest=0, posDiv=0;
        int[] result=new int[zahl1.length]; //Result-Array
        Arrays.setAll(result, p->0);
        while(n<zahl1.length){ //wir beginnen vom Anfang des Arrays
            posDiv=(zahl1[n]+10*rest)/ziffer;//Quotient
            rest=(zahl1[n]+10*rest)%ziffer; //Rest
            result[n] = posDiv; //speichern Quotient
            n++;
        }
        return result;
    }
}
