/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unincor.sistema.bancario.admin.model.domain;

/**
 *
 * @author lucas
 */
public class Agencia {
    private Long idAgencia;
    private String codigoAgencia;
    private String cidade;
    private String uf;
    private String logradouro;
    private String numero;
    private String cep;

    public Agencia() {
    }

    public Agencia(Long idAgencia, String codigoAgencia, String cidade, String uf, String logradouro, String numero, String cep) {
        this.idAgencia = idAgencia;
        this.codigoAgencia = codigoAgencia;
        this.cidade = cidade;
        this.uf = uf;
        this.logradouro = logradouro;
        this.numero = numero;
        this.cep = cep;
    }
    
    
    
}
