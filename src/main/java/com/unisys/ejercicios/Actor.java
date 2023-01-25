package com.unisys.ejercicios;

import java.io.Serializable;
import java.util.Objects;

public class Actor implements Serializable {
    private String nombre;
    private Integer anyosExperiencia;
    private String generoFavorito;
    private static final long serialVersionUID = 8642031L;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getAnyosExperiencia() {
        return anyosExperiencia;
    }

    public void setAnyosExperiencia(Integer anyosExperiencia) {
        this.anyosExperiencia = anyosExperiencia;
    }

    public String getGeneroFavorito() {
        return generoFavorito;
    }

    public void setGeneroFavorito(String generoFavorito) {
        this.generoFavorito = generoFavorito;
    }

    public Actor(String nombre, Integer anyosExperiencia, String generoFavorito) {
        this.nombre = nombre;
        this.anyosExperiencia = anyosExperiencia;
        this.generoFavorito = generoFavorito;
    }

    public Actor() {
        this.nombre = "";
        this.anyosExperiencia = 0;
        this.generoFavorito = "";
    }

    @Override
    public String toString() {
        return "Actor{" +
                "nombre='" + nombre + '\'' +
                ", anyosExperiencia=" + anyosExperiencia +
                ", generoFavorito='" + generoFavorito + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return Objects.equals(getNombre(), actor.getNombre()) && Objects.equals(getAnyosExperiencia(), actor.getAnyosExperiencia()) && Objects.equals(getGeneroFavorito(), actor.getGeneroFavorito());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getAnyosExperiencia(), getGeneroFavorito());
    }
}
