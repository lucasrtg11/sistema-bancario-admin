/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unincor.sistema.bancario.admin.configurations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lucas
 */
public class MySQL {
    private static String URL = "jdbc:mysql://localhost:3306/sistema_bancario";
    
    private static String USER = "root";
    
    private static String PASS = "admin";
    
    public static Connection connect(){
        try {
            Connection con = DriverManager.getConnection(URL, USER, PASS);
            return con;
        } catch (SQLException ex) {
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public static void main(String[] args) {
        System.out.println(connect());
    }
    
}
