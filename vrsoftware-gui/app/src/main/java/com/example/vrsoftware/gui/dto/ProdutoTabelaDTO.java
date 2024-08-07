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
public class ProdutoTabelaDTO {

    private String codigo;
    private String descricao;
    private BigDecimal valorTotal;

    public ProdutoTabelaDTO(String codigo, String descricao, BigDecimal valorTotal) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valorTotal = valorTotal;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

}
