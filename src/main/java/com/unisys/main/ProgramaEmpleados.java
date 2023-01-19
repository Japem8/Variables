package com.unisys.main;

import com.unisys.ejercicios.Currito;
import com.unisys.ejercicios.Empleado;
import com.unisys.ejercicios.Jefe;

public class ProgramaEmpleados {
    public static void main(String[] args) {
        Empleado empleado1=new Empleado();
        System.out.println(empleado1);
        Empleado empleado2=new Empleado("Pepito","Sanchez","02345668M","913457588",50000,"Pringao");
        System.out.println(empleado2);
        String nombre=empleado2.getNombre();
        System.out.println(nombre);
        Currito currito1=new Currito();
        currito1.setMarron(true);
        if(currito1.isMarron()) {
            System.out.println("Menudo marrón te ha caído");
        }else {
            System.out.println("Un día tranquilo");
        }
        Jefe jefazo=new Jefe();
        jefazo.setBonus(true);
        if (jefazo.isBonus()) {
            System.out.println("Me lo llevo muerto");
        } else {
            System.out.println("Esto no va a pasar");
        }
//        No tengo acceso a jefazo.sueldo porque es un atributo protected de la clase Empleado
        jefazo.setSueldo(80000);
        int sueldoJefazo = jefazo.getSueldo();
        System.out.println("Sueldo del jefazo: "+sueldoJefazo);
        currito1.setSueldo(20000);
        int sueldoCurrito=currito1.getSueldo();
        System.out.println("Sueldo del currito: "+sueldoCurrito);
    }
}
