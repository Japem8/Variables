package com.unisys.ejercicios.repositories;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

import com.unisys.ejercicios.domain.Cliente;
import com.unisys.ejercicios.db.Connect;

public class ClienteDAOImpl implements  ClienteDAO{
    private static final String TABLE = "clientes";
    private static final String NAME = "nombre";
    private static final String DIR = "direccion";
    private static final String TLF= "tlf";
    private static final String ID= "id";
    private Connect conexion;

    public ClienteDAOImpl(Connect conexion) {
        this.conexion = conexion;
    }

    @Override
    public Cliente add(Cliente cliente) throws SQLException {
        String sql = "INSERT into "+TABLE+" ("+NAME+","+DIR+","+TLF+
                ") VALUES(?,?,?)";
        PreparedStatement prest;
        prest = this.conexion.getConnection().prepareStatement(sql);
        prest.setString(1, cliente.getNombre());
        prest.setString(2,cliente.getDireccion());
        prest.setString(3,cliente.getTlf());
        int count = prest.executeUpdate();
        System.out.println("count: "+ count);
        ResultSet rs = null;
        rs = prest.executeQuery("SELECT LAST_INSERT_ID()");
        if (rs.next()) {
            System.out.println("inserted correctly");
            cliente.setId(rs.getLong(1));
        } else {
            System.out.println("Not inserted correctly");
            cliente.setId(-1L);
        }
        return cliente;
        }
        @Override
    public List<Cliente> findAll() throws SQLException {
        String sql="SELECT * FROM "+TABLE;
        Statement statement = this.conexion.getConnection().createStatement();
        ResultSet r = statement.executeQuery(sql);
        List<Cliente> listado = new LinkedList<>();
        Cliente cliente;
        while(r.next()){
            cliente = new Cliente();
            cliente.setId(r.getLong(1));
            cliente.setNombre(r.getString(2));
            cliente.setDireccion(r.getString(3));
            cliente.setTlf(r.getString(4));
            listado.add(cliente);
        }
        return listado;
    }
    @Override
    public Cliente findByID(Long id) throws SQLException {
        // consulta en la bbdd buscando por ID
        String sql = "SELECT * FROM "+TABLE+" WHERE "+ID+" = ?";
        PreparedStatement prest;
        prest = this.conexion.getConnection().prepareStatement(sql);
        prest.setLong(1, id);
        ResultSet r = prest.executeQuery();
        // rellenar un objeto de Cliente con los datos de la bbdd
        Cliente cliente = new Cliente();
        if(r.next()){
            cliente.setId(r.getLong(1));
            cliente.setNombre(r.getString(2));
            cliente.setDireccion(r.getString(3));
            cliente.setTlf(r.getString(4));
        }
        // devolver el objeto cliente
        return cliente;
    }
    @Override
    public Cliente update(Long id, Cliente cliente) throws SQLException {
        String sql = "UPDATE "+TABLE+" SET "+NAME+
                " = ?, "+DIR+" = ?, "+TLF+" = ? WHERE "+ID+" = ?";
        PreparedStatement prest;
        prest = this.conexion.getConnection().prepareStatement(sql);
        prest.setString(1, cliente.getNombre());
        prest.setString(2,cliente.getDireccion());
        prest.setString(3,cliente.getTlf());
        prest.setLong(4,id);
        int count = prest.executeUpdate();
        System.out.println("count: " + count);
        if (count==1){
            cliente.setId(id);
        }else{
            cliente.setId(-1L);
        }
        return cliente;
    }
    @Override
    public Cliente delete(Long id) throws SQLException {
        Cliente cliente = findByID(id);
        if (cliente.getId()>0){
            String sql = "DELETE from "+TABLE+" WHERE "+ID+" = ?";
            PreparedStatement prest;
            prest = this.conexion.getConnection().prepareStatement(sql);
            prest.setLong(1,id);
            int count = prest.executeUpdate();
            if (count>0){
                System.out.println("Deleting Successfully!");
            }else{
                cliente = new Cliente();
            }
        }
        return cliente;
    }
}
