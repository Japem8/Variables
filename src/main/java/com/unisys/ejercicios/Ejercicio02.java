package com.unisys.ejercicios;

public class Ejercicio02 {
    public static void main(String[] args) {
        int i;
        int edad;
        i=1;
        edad=17;
        System.out.println("Empieza bucle while...");
        while (i<11){
            System.out.println("Vuelta numero while: "+i);
            i++;
        }
        // do while
        i=1;
        System.out.println("Empieza bucle do-while...");
        do{
            System.out.println("Vuelta numero do-while: "+i);
            i++;
        }while (i<11);
        System.out.println("Empieza bucle for...");
        // for de tipo simple
        for (i=1;i<11;i++){
            System.out.println("Vuelta numero for: "+i);
        }
        if (edad >= 18) {
            System.out.println("Mayor de edad.Puede conducir un coche");
        } else {
            System.out.println("No es mayor de edad.No puede conducir un coche");
        }
        var resultado= switch (edad) {
            case 18 -> "Conduce coche";
            case 21 -> "Puede beber en USA";
            default -> "Tiene edad: " + edad;
        };
            System.out.println(resultado);
        i=1;
        while (i<11){
            System.out.println("Vuelta numero while raruno: "+i);
            if(i==2) {
                i++;
                continue;
            }
            if(i==5) {
                break;
            }
            i++;
        }
    }
}
