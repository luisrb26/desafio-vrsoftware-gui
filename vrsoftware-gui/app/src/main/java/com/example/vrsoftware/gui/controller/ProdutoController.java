/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.vrsoftware.gui.controller;

import com.example.vrsoftware.gui.utils.ApiClient;
import com.google.gson.Gson;
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
    
    public String buscarTodosProdutos() {
        try {
            return apiClient.sendGetRequest("/produto/buscar-todos");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao obter dados de produtos: " + e.getMessage());
        }
        return null;
    }
}
