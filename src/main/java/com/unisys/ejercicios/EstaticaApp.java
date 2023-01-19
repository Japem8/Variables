package com.unisys.ejercicios;

import static com.unisys.ejercicios.Estatica.berrinche;
public class EstaticaApp {
    public static void main(String[] args) {
        String queja;
        System.out.println(Estatica.pi);
        queja=berrinche();
        System.out.println(queja);
    }
}
