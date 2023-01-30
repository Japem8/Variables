package com.unisys.ejercicios;

import com.unisys.ejercicios.db.Connect;
import com.unisys.ejercicios.domain.Cliente;
import com.unisys.ejercicios.repositories.*;

import java.sql.SQLException;

public class App {
    public final static String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";

    public final static String USERNAME = "root";
    public final static String PASSWORD = "root";
    public final static String URL = "jdbc:mysql://localhost:3306/";
    public final static String DB="test";
    public static void main(String[] args){
        try{
            //Connect conexion = new Connect();
            Connect conexion = new Connect(DRIVER_NAME,USERNAME,PASSWORD,URL,DB);
            System.out.println("Conexión creada");
            System.out.println(conexion);
            Cliente cliente =new Cliente();
            cliente.setDireccion("Madrid");
            cliente.setNombre("Pepe");
            cliente.setTlf("917453345");
            System.out.println(cliente);
            ClienteDAO clienteDAO = new ClienteDAOImpl(conexion);
            clienteDAO.add(cliente);
            System.out.println(cliente);
            cliente = clienteDAO.findByID(cliente.getId());
            System.out.println(cliente);
            conexion.getConnection().close();
            System.out.println("Conection closed");
        } catch (ClassNotFoundException e) {
            System.out.println("Error de clase no encontrada");
            System.out.println(e.getMessage());
        } catch (InstantiationException e) {
            System.out.println("Error de conexión");
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error SQL");
            System.out.println(e.getMessage());
        } catch (IllegalAccessException e) {
            System.out.println("Error de acceso");
            System.out.println(e.getMessage());
        }

    }
}
