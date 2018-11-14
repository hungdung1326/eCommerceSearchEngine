/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hung.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author hungn
 */
public class DBConnection {

    private static Connection conn;

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        if (conn == null) {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/products", "sa", "sa");
        }
        return conn;
    }

}
