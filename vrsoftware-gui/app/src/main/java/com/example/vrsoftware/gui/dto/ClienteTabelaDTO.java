/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.vrsoftware.gui.dto;

import java.math.BigDecimal;

/**
 *
 * @author Gabriel
 */
public class ClienteTabelaDTO {

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

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public ClienteTabelaDTO(Long qntPedidos, String codigo, String nome, BigDecimal preco) {
        this.qntPedidos = qntPedidos;
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    public Long getQntPedidos() {
        return qntPedidos;
    }

    public void setQntPedidos(Long qntPedidos) {
        this.qntPedidos = qntPedidos;
    }

    private Long qntPedidos;
    private String codigo;
    private String nome;
    private BigDecimal preco;
}
