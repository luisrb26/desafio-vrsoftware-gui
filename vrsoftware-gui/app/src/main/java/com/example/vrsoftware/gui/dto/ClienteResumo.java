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
public class ClienteResumo {

    private String codigoCliente;
    private String nomeCliente;
    private int quantidadePedidos;
    private BigDecimal valorTotalPedidos;

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getQuantidadePedidos() {
        return quantidadePedidos;
    }

    public void setQuantidadePedidos(int quantidadePedidos) {
        this.quantidadePedidos = quantidadePedidos;
    }

    public BigDecimal getValorTotalPedidos() {
        return valorTotalPedidos;
    }

    public void setValorTotalPedidos(BigDecimal valorTotalPedidos) {
        this.valorTotalPedidos = valorTotalPedidos;
    }

    
    
    public ClienteResumo(String codigoCliente, String nomeCliente, int quantidadePedidos, BigDecimal valorTotalPedidos) {
        this.codigoCliente = codigoCliente;
        this.nomeCliente = nomeCliente;
        this.quantidadePedidos = quantidadePedidos;
        this.valorTotalPedidos = valorTotalPedidos;
    }

    // Getters e setters podem ser adicionados aqui
    @Override
    public String toString() {
        return "ClienteResumo{"
                + "codigoCliente='" + codigoCliente + '\''
                + ", nomeCliente='" + nomeCliente + '\''
                + ", quantidadePedidos=" + quantidadePedidos
                + ", valorTotalPedidos=" + valorTotalPedidos
                + '}';
    }
}
