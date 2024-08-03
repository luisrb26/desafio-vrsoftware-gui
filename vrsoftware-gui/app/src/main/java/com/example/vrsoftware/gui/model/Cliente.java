/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.vrsoftware.gui.model;

import java.math.BigDecimal;

/**
 *
 * @author Gabriel
 */
public class Cliente {
    private Long id;

    private String codigo;

    private String nome;
    
    private BigDecimal limiteCompra;
    
    private int diaFechamento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getLimiteCompra() {
        return limiteCompra;
    }

    public void setLimiteCompra(BigDecimal limiteCompra) {
        this.limiteCompra = limiteCompra;
    }

    public int getDiaFechamento() {
        return diaFechamento;
    }

    public void setDiaFechamento(int diaFechamento) {
        this.diaFechamento = diaFechamento;
    }

    public Cliente(String codigo, String nome, BigDecimal limiteCompra, int diaFechamento) {
        this.codigo = codigo;
        this.nome = nome;
        this.limiteCompra = limiteCompra;
        this.diaFechamento = diaFechamento;
    }
    
}
