/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.vrsoftware.gui.controller;

import com.example.vrsoftware.gui.model.Produto;
import com.example.vrsoftware.gui.utils.ApiClient;
import com.google.gson.Gson;
import java.math.BigDecimal;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class ProdutoController {

    private final ApiClient apiClient;
    private final Gson gson;

    public ProdutoController(ApiClient apiClient, Gson gson) {
        this.apiClient = apiClient;
        this.gson = gson;
    }

    public void cadastrarProduto(String codigo, String descricao, BigDecimal preco) {
        try {
            // TODO: Revisar tratamento de Exceções
            validarInputs(codigo, descricao, preco);
            Produto produto = new Produto(codigo, descricao, preco);
            String jsonInputString = gson.toJson(produto);
            String response = apiClient.sendPostRequest("/produto/cadastrar", jsonInputString);
            JOptionPane.showMessageDialog(null, "Resposta da API: " + response);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Erro de validação: " + e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro inesperado: " + e.getMessage());
        }
    }

    public String buscarTodosProdutos() {
        try {
            return apiClient.sendGetRequest("/produto/buscar-todos");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao obter dados de produtos: " + e.getMessage());
        }
        return null;
    }

    private void validarInputs(String codigo, String descricao, BigDecimal preco) {
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("O código não pode ser nulo ou vazio.");
        }
        if (descricao == null || descricao.trim().isEmpty()) {
            throw new IllegalArgumentException("O descricao não pode ser nulo ou vazio.");
        }
        if (preco == null || preco.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("O limite de compra deve ser um valor positivo.");
        }
    }
}
