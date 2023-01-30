package com.unisys.ejercicios.db;

import java.sql.*;
import java.util.Objects;

public class Connect {
    private Connection connection;
    public final static String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";

    public final static String USERNAME = "root";
    public final static String PASSWORD = "root";
    public final static String URL = "jdbc:mysql://localhost:3306/";
    public final static String DB="test";

    public Connect() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        Class.forName(DRIVER_NAME).newInstance ();
        connection = DriverManager.getConnection (URL+DB, USERNAME, PASSWORD);
    }
    public Connect(String driverName, String username, String password, String url,String db)
            throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{

        Class.forName(driverName).newInstance();
        connection = DriverManager.getConnection(url+db, username, password);
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Connect connect = (Connect) o;
        return Objects.equals(getConnection(), connect.getConnection());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getConnection());
    }

    @Override
    public String toString() {
        return "Connect{" +
                "connection=" + connection +
                '}';
    }
}
