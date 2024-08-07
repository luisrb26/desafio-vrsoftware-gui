/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.vrsoftware.gui.controller;

import com.example.vrsoftware.gui.model.Cliente;
import com.example.vrsoftware.gui.model.Pedido;
import com.example.vrsoftware.gui.utils.ApiClient;
import com.google.gson.Gson;
import java.io.IOException;
import java.math.BigDecimal;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class ClienteController {

    private final ApiClient apiClient;
    private final Gson gson;

    public ClienteController(ApiClient apiClient, Gson gson) {
        this.apiClient = apiClient;
        this.gson = gson;
    }

    public void cadastrarCliente(String codigo, String nome, BigDecimal limiteCompra, int diaFechamento) {
        try {
            // TODO: Revisar tratamento de Exceções
            validarInputs(codigo, nome, limiteCompra);
            Cliente cliente = new Cliente(codigo, nome, limiteCompra, diaFechamento);
            String jsonInputString = gson.toJson(cliente);
            String jsonResponse = apiClient.sendPostRequest("/cliente/cadastrar", jsonInputString);
            
            Cliente resposta = this.gson.fromJson(jsonResponse, Cliente.class);
            
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Erro de validação: " + e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro inesperado: " + e.getMessage());
        }
    }

    public String buscarTodosClientes() {
        try {
            return apiClient.sendGetRequest("/cliente/buscar-todos");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao obter dados de cliente: " + e.getMessage());
        }
        return null;
    }

    private void validarInputs(String codigo, String nome, BigDecimal limiteCompra) {
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("O código não pode ser nulo ou vazio.");
        }
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ser nulo ou vazio.");
        }
        if (limiteCompra == null || limiteCompra.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("O limite de compra deve ser um valor positivo.");
        }
    }
}
