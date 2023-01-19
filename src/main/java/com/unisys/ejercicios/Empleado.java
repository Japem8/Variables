package com.unisys.ejercicios;

public class Empleado extends Persona {
    protected int sueldo;
    private String cargo;

    public Empleado(String nombre, String apellido,String dni, String tlf,int sueldo,String cargo) {
        super(nombre,apellido,dni,tlf);
        this.sueldo = sueldo;
        this.cargo=cargo;
    }

    public Empleado() {
        super();
        this.sueldo = 0;
        this.cargo="";
    }
    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + super.getNombre() + '\'' +
                "apellido='" + super.getApellido() + '\'' +
                ", dni='" + super.getDni() + '\'' +
                ", tlf='" + super.getTlf() + '\'' +
                ", sueldo=" + sueldo +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
