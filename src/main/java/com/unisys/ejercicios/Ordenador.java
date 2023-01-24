package com.unisys.ejercicios;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Ordenador implements Serializable {
    private static final long serialVersionUID = 1234567L;
    private String marca;
    private String modelo;
    private Set <Pieza> misPiezas;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Set<Pieza> getListadoDePiezas() {
        return misPiezas;
    }

    public void setListadoDePiezas(Set <Pieza> piezas) {
        this.misPiezas = piezas;
    }

    public Ordenador(String marca, String modelo, Set <Pieza> piezas) {
        this.marca = marca;
        this.modelo = modelo;
        this.misPiezas = piezas;
    }

    public Ordenador() {
        this.marca = "";
        this.modelo = "";
        this.misPiezas = null;
    }

    @Override
    public String toString() {
        return "Ordenador{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", pieza='" + misPiezas + '\'' +
                '}';
    }
}
