/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unincor.sistema.bancario.admin.model.services;

import com.unincor.sistema.bancario.admin.exceptions.CadastrosException;
import com.unincor.sistema.bancario.admin.model.dao.AgenciaDao;
import com.unincor.sistema.bancario.admin.model.domain.Agencia;


/**
 *
 * @author lucas
 */
public class AgenciaService {
    
    private final AgenciaDao agenciaDao = new AgenciaDao();
    
    public void salvarAgencia(Agencia agencia) throws CadastrosException{
        if (agencia.getCodigoAgencia() == null
                || agencia.getCodigoAgencia().isBlank()) {
    throw new CadastrosException("A agencia não possui" + "um codigo de agencia!");
    }
        Agencia agenciaBusca = agenciaDao.buscarAgenciaPorCodigo(agencia.getCodigoAgencia());
        if (agenciaBusca != null) {
           throw new CadastrosException("o codigo de agencia ja esta cadastrado");         
        }
        if (agencia.getCidade()==null|| agencia.getCidade().isBlank()  ) {
            throw new CadastrosException("A cidade nao esta cadastrada !");
            
        }
        if (agencia.getUf()== null || agencia.getUf().isBlank()) {
            throw new CadastrosException("A UF nao esta cadastrada !");
            
        }
        agenciaDao.inserirAgencia(agencia);
}
 
}
    
