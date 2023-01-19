package com.unisys.ejercicios;

public class Jefe extends Empleado {
    private boolean bonus;

    public boolean isBonus() {
        return bonus;
    }

    public void setBonus(boolean bonus) {
        this.bonus = bonus;
    }

    public Jefe(String nombre, String apellido, String dni, String tlf, int sueldo, String cargo, boolean bonus) {
        super(nombre, apellido, dni, tlf, sueldo, cargo);
        this.bonus = bonus;
    }

    public Jefe() {
        super();
        this.bonus = false;
    }
}
