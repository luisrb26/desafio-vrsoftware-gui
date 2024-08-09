    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.vrsoftware.gui.dto;

import com.example.vrsoftware.gui.model.Cliente;
import com.example.vrsoftware.gui.model.ItemPedido;
import java.util.List;

/**
 *
 * @author Gabriel
 */
public class PedidoResponse {
    private Long id;
    private String dataPedido;
    private String situacao;
    private Cliente cliente;

    public PedidoResponse(Long id, String dataPedido, String situacao, Cliente cliente, List<ItemPedido> itens) {
        this.id = id;
        this.dataPedido = dataPedido;
        this.situacao = situacao;
        this.cliente = cliente;
        this.itens = itens;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }
    private List<ItemPedido> itens;
}
