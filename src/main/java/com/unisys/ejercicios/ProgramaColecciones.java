package com.unisys.ejercicios;

import java.util.*;

public class ProgramaColecciones {
    public static void main(String[] args) {
        Set <Pieza> listadoDePiezas=new HashSet<>();
        List <Pieza> listadoDePiezasOrdenadas=new ArrayList<>();
        Pieza pieza=new Pieza("West Digital HDD","Disco duro sólido");
        Pieza pieza1=new Pieza("AMD 7896","Procesador");
        Pieza pieza2=new Pieza("Gigabyte AX700","Placa base");
        Pieza pieza3=new Pieza("Nvidia Gforce","Tarjeta Grafica");
        Pieza pieza4=new Pieza("Nvidia Gforce","Tarjeta Grafica");
        Pieza pieza5=new Pieza("AMD Ryzen 5 5600","Procesador");
        Pieza pieza6=new Pieza("Nvidia Geforce 1800","Tarjeta Grafica");
        Pieza pieza7=new Pieza("Seagate HDD","Disco duro");
        listadoDePiezas.add(pieza);
        listadoDePiezas.add(pieza1);
        listadoDePiezas.add(pieza2);
        listadoDePiezas.add(pieza3);
        listadoDePiezas.add(pieza4);
        listadoDePiezasOrdenadas.add(pieza7);
        listadoDePiezasOrdenadas.add(pieza5);
        listadoDePiezasOrdenadas.add(pieza6);
        listadoDePiezasOrdenadas.sort(Comparator.comparing(Pieza::toString));
        Ordenador ordenador=new Ordenador("Intel","Intel i7 box",listadoDePiezas);
        Ordenador2 ordenador2=new Ordenador2("AMD","AMD 5600",listadoDePiezasOrdenadas);
        System.out.println("Esto es un ordenador con un SET de piezas");
        System.out.println(ordenador);
        System.out.println("Esto es un ordenador con un LIST ordenado de piezas");
        System.out.println(ordenador2);
    }
}
