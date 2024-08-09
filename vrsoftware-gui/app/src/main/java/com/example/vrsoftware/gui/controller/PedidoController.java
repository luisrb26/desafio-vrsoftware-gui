/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.vrsoftware.gui.controller;

import com.example.vrsoftware.gui.dto.PedidoResponse;
import com.example.vrsoftware.gui.model.ItemPedido;
import com.example.vrsoftware.gui.model.Pedido;
import com.example.vrsoftware.gui.utils.ApiClient;
import com.google.gson.Gson;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class PedidoController {

    private final ApiClient apiClient;
    private final Gson gson = new Gson();

    public PedidoController(ApiClient apiClient, Gson gson) {
        this.apiClient = apiClient;
    }

    public void cadastrarPedido(Long clienteId, List<Integer> produtosIds, List<Integer> quantidades) {
        try {
            // Validar que os arrays têm o mesmo tamanho
            if (produtosIds.size() != quantidades.size()) {
                throw new IllegalArgumentException("Os tamanhos dos arrays de IDs e quantidades devem ser iguais.");
            }

            // Criar um objeto JSON com os dados
            Map<String, Object> pedido = new HashMap<>();
            pedido.put("clienteId", clienteId);
            pedido.put("produtosIds", produtosIds);
            pedido.put("quantidades", quantidades);

            // Converter o objeto JSON para uma string
            String jsonInputString = gson.toJson(pedido);

            // Enviar a requisição POST
            String response = apiClient.sendPostRequest("/pedido/cadastrar", jsonInputString);
            Pedido resposta = this.gson.fromJson(response, Pedido.class);
            
            JOptionPane.showMessageDialog(null, "Pedido cadastrado com sucesso!  Pedido: " + resposta.getId());
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Erro de validação: " + e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro inesperado: " + e.getMessage());
        }
    }

    public List<PedidoResponse> buscarTodosPedidosComItens() {
        try {
            String jsonResponse = apiClient.sendGetRequest("/pedido/buscar-todos-com-itens");

            PedidoResponse[] pedidoArray = this.gson.fromJson(jsonResponse, PedidoResponse[].class);

            return Arrays.asList(pedidoArray);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao obter dados de cliente: " + e.getMessage());
        }
        return null;
    }
    
     public List<ItemPedido> buscarItens() {
        try {
            String jsonResponse = apiClient.sendGetRequest("/pedido/item-pedido");

            ItemPedido[] pedidoArray = this.gson.fromJson(jsonResponse, ItemPedido[].class);

            return Arrays.asList(pedidoArray);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao obter dados de cliente: " + e.getMessage());
        }
        return null;
    }

}
