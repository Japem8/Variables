package com.unisys.ejercicios;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

public class Ordenador2 implements Serializable {
    private static final long serialVersionUID = 1234568L;
    private String marca;
    private String modelo;
    private List <Pieza> misPiezasOrdenadas;

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

    public List<Pieza> getListadoDePiezas() {
        return misPiezasOrdenadas;
    }

    public void setListadoDePiezas(List <Pieza> piezas) {
        this.misPiezasOrdenadas = piezas;
    }

    public Ordenador2(String marca, String modelo, List <Pieza> piezas) {
        this.marca = marca;
        this.modelo = modelo;
        this.misPiezasOrdenadas = piezas;
    }

    public Ordenador2() {
        this.marca = "";
        this.modelo = "";
        this.misPiezasOrdenadas = null;
    }

    @Override
    public String toString() {
        return "Ordenador{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", misPiezas='" + misPiezasOrdenadas + '\'' +
                '}';
    }
}
