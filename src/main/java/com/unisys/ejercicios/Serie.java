package com.unisys.ejercicios;

import java.io.Serializable;
import java.util.*;

public class Serie implements Serializable {
    private String titulo;
    private String genero;
    private Integer anyoPublicacion;
    private List <Actor> reparto;
    private static final long serialVersionUID = 8672134L;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getAnyoPublicacion() {
        return anyoPublicacion;
    }

    public void setAnyoPublicacion(Integer anyoPublicacion) {
        this.anyoPublicacion = anyoPublicacion;
    }

    public List<Actor> getReparto() {
        return reparto;
    }

    public void setReparto(List<Actor> reparto) {
        this.reparto = reparto;
    }

    public Serie(String titulo, String genero, Integer anyoPublicacion, List <Actor> reparto) {
        this.titulo = titulo;
        this.genero = genero;
        this.anyoPublicacion = anyoPublicacion;
        this.reparto = reparto;
    }

    public Serie() {
        this.titulo = "";
        this.genero = "";
        this.anyoPublicacion = 0;
        this.reparto =null;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", anyoPublicacion=" + anyoPublicacion +
                ", reparto=" + reparto +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return Objects.equals(getTitulo(), serie.getTitulo()) && Objects.equals(getGenero(), serie.getGenero()) && Objects.equals(getAnyoPublicacion(), serie.getAnyoPublicacion()) && Objects.equals(getReparto(), serie.getReparto());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitulo(), getGenero(), getAnyoPublicacion(), getReparto());
    }
}
