package com.unisys.ejercicios;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProgramaColecciones {
    public static void main(String[] args) {
        Set <Pieza> listadoDePiezas=new HashSet<>();
        Pieza pieza=new Pieza("West Digital HDD","Disco duro sólido");
        Pieza pieza1=new Pieza("AMD 7896","Procesador");
        Pieza pieza2=new Pieza("Gigabyte AX700","Placa base");
        Pieza pieza3=new Pieza("Nvidia Gforce","Tarjeta Gráfica");
        Pieza pieza4=new Pieza("Nvidia Gforce","Tarjeta Gráfica");
        Ordenador ordenador=new Ordenador("Intel","intel celeron",listadoDePiezas);
        listadoDePiezas.add(pieza);
        listadoDePiezas.add(pieza1);
        listadoDePiezas.add(pieza2);
        listadoDePiezas.add(pieza3);
        listadoDePiezas.add(pieza4);
        System.out.println(ordenador);
    }
}
