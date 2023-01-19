package com.unisys.ejercicios;

public class Persona {
    private String nombre;
    private String apellido;
    private String dni;
    private String tlf;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public Persona(String nombre, String apellido, String dni, String tlf) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.tlf = tlf;
    }

    public Persona() {
        this.nombre="";
        this.apellido="";
        this.dni="";
        this.tlf="";
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", tlf='" + tlf + '\'' +
                '}';
    }
}
