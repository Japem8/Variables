package com.unisys.ejercicios;

public class GatoAppLombok {
    public static void main(String[] args) {
        GatoLombok misifu=new GatoLombok("Misifu","12");
        System.out.println(misifu);
        GatoLombok tarao=new GatoLombok();
        System.out.println(tarao);
        tarao.setName("Tarao");
        tarao.setAge("5");
        System.out.println(tarao);
    }
}
