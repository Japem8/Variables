package com.unisys.ejercicios;

import java.util.*;

public class EjercicioColecciones {
    public static void main(String[] args) {
        List <String> listado=new ArrayList<>();
        Set <Integer> numeros=new HashSet<>();
        Map <Integer,String> mapa=new HashMap<>();
        listado.add("Listado1");
        listado.add("Listado2");
        System.out.println(listado.get(0));
        for (String cadena:listado) {
            System.out.println(cadena);
        }
        Integer pos =listado.size();
        System.out.println(pos);
        listado.remove(pos-1);
        for (String cadena:listado) {
            System.out.println(cadena);
        }
        numeros.add(5);
        numeros.add(32);
        for (Integer numero:numeros) {
            System.out.println(numero);
        }
        mapa.put(0,"Primer elemento");
        mapa.put(1,"Segundo elemento");
        System.out.println(mapa.get(0));
        for (String value : mapa.values()) {
            System.out.println(value);
        }
        Actor actor1=new Actor("Antonio",7,"Drama");
        Actor actor2=new Actor("Ramon",12,"Comedia");
        List <Actor> reparto=new ArrayList<>();
        reparto.add(actor1);
        reparto.add(actor2);
        Serie serie=new Serie("Fleabag","Comedia",2016,reparto);
        System.out.println(serie.getReparto());
    }
}
