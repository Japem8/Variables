package com.unisys.ejercicios;

public class Ejercicio04 {
    public static void main(String[] args) {
        String saludo="Hola";
        String saludo2="Adios";
        System.out.println("Longitud de saludo: "+saludo.length());
        char c4=saludo.charAt(3);
        System.out.println("El caracter 4 de saludo es: "+c4);
        System.out.println(saludo.toUpperCase());
        System.out.println(saludo.toLowerCase());
        System.out.println(saludo.indexOf('l'));
        if (saludo.equals(saludo2)) {
            System.out.println("Las cadenas son iguales");
        }else {
            System.out.println("Las cadenas son distintas");
        }
    }
}
