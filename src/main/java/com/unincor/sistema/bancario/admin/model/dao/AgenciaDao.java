/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unincor.sistema.bancario.admin.model.dao;

import com.unincor.sistema.bancario.admin.configurations.MySQL;
import com.unincor.sistema.bancario.admin.model.domain.Agencia;
import com.unincor.sistema.bancario.admin.model.domain.Cliente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;

/**
 *
 * @author lucas
 */
public class AgenciaDao {
    public void inserirAgencia(Agencia agencia){
        String sql = "INSERT INTO agencias (codigoAgencia, cidade, uf, logradouro, "
                + "numero, cep) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection con = MySQL.connect();
                PreparedStatement ps = con.prepareStatement(sql)){
            ps.setString(1, agencia.getCodigoAgencia());
            ps.setString(2, agencia.getCidade());
            ps.setString(3, agencia.getUf());
            ps.setString(4, agencia.getLogradouro());
            ps.setString(5, agencia.getNumero());
            ps.setString(6, agencia.getCep());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List<Cliente> buscarTodasAgencias(){
        List<Agencia> agencias = new ArrayList<>();
        String sql = "SELECT * FROM agencias";
        try (Connection con = MySQL.connect();
                PreparedStatement ps = con.prepareStatement(sql)){
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Agencia agencia = new Agencia();
                agencia.setIdAgencia(rs.getLong("id_agencia"));
                agencia.setCodigoAgencia(rs.getString("codigoAgencia"));
                agencia.setCidade(rs.getString("cidade"));
                agencia.setUf(rs.getString("uf"));
                agencia.setLogradouro(rs.getString("logradouro"));
                agencia.setNumero(rs.getString("numero"));
                agencia.setCep(rs.getString("cep"));
                
                agencias.add(agencia);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AgenciaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return agencia;
        
    }
    
}
