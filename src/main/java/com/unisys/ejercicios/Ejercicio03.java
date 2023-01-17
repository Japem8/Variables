package com.unisys.ejercicios;

import java.util.Arrays;

public class Ejercicio03 {
    public static void main(String[] args) {
        int miArray[] = new int[4];
        float flotantes[] = new float[2000];
        int i;
        miArray[0]=1;
        miArray[1]=2;
        miArray[2]=3;
        miArray[3]=4;
        for (int fila:miArray) {
            System.out.println("Valor de celda: "+fila);
        }
        i=0;
        while(i< miArray.length) {
            System.out.println("Valor de celda "+i+": "+miArray[i]);
            i++;
        }
        i=0;
        do {
            System.out.println("Valor de celda " + i + ": " + miArray[i]);
            i++;
        }while(i< miArray.length);
        Arrays.fill(flotantes,0);//Todo el array vale 0
        flotantes[1]=7.3f;
        System.out.println("Segunda posición del array flotantes: "+flotantes[1]);
        System.out.println("Numero de elementos del array: "+flotantes.length);
    }
}
