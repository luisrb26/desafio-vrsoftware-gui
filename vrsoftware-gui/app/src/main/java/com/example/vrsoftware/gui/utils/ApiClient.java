/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.vrsoftware.gui.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class ApiClient {

    private String apiUrl;

    public ApiClient(String configFile) throws IOException {
        loadConfig(configFile);
    }

    private void loadConfig(String configFile) throws IOException {
        try (InputStream input = getClass().getClassLoader().getResourceAsStream(configFile)) {
            if (input == null) {
                throw new FileNotFoundException("Não foi possível encontrar o arquivo " + configFile);
            }
            Properties prop = new Properties();
            prop.load(input);
            this.apiUrl = prop.getProperty("api.url");
            if (this.apiUrl == null) {
                throw new IllegalStateException("A propriedade 'api.url' não foi encontrada no arquivo de configuração.");
            }
        }
    }

    public String sendPostRequest(String endpoint, String jsonInputString) {
        String urlString = apiUrl + endpoint;

        try {
            HttpURLConnection conn = (HttpURLConnection) new URL(urlString).openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json; utf-8");
            conn.setRequestProperty("Accept", "application/json");
            conn.setDoOutput(true);

            try (OutputStream os = conn.getOutputStream()) {
                byte[] input = jsonInputString.getBytes(StandardCharsets.UTF_8);
                os.write(input);
            }

            try (BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), StandardCharsets.UTF_8))) {
                StringBuilder response = new StringBuilder();
                String responseLine;
                while ((responseLine = br.readLine()) != null) {
                    response.append(responseLine.trim());
                }
                return response.toString();
            } finally {
                conn.disconnect();
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro na requisição: " + e.getMessage());
            return null;
        }
    }
    
    public String sendGetRequest(String endpoint) {
        String urlString = apiUrl + endpoint;

        try {
            HttpURLConnection conn = (HttpURLConnection) new URL(urlString).openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            return readResponse(conn);

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro na requisição GET: " + e.getMessage());
            return null;
        }
    }
    
    // TODO: Verificar reutilização no POST
    private String readResponse(HttpURLConnection conn) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), StandardCharsets.UTF_8))) {
            StringBuilder response = new StringBuilder();
            String responseLine;
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim());
            }
            return response.toString();
        } finally {
            conn.disconnect();
        }
    }
}
