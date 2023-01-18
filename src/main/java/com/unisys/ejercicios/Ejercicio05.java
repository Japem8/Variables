package com.unisys.ejercicios;

public class Ejercicio05 {
    public static void main(String[] args) {
        String razaFluky;
        Perro toby=new Perro();
        System.out.println("Raza de Toby: "+toby.raza);
        toby.raza="Terrier";
        System.out.println("Raza de Toby: "+toby.raza);
        Perro otto=new Perro();
        System.out.println("Raza de Otto: "+otto.raza);
        otto.raza="Pastor Alemán";
        System.out.println("Raza de Otto: "+otto.raza);
        Perro fluky=new Perro("Pastor de aguas");
        System.out.println("Raza de Fluky: "+fluky.raza);
        razaFluky=fluky.getRaza();
        System.out.println("Raza de Fluky: "+razaFluky);
        fluky.setRaza("Caniche ovejero");
        System.out.println("Raza de Fluky: "+fluky.raza);
        System.out.println(toby);
        System.out.println(fluky);
        System.out.println(otto);
    }
}
