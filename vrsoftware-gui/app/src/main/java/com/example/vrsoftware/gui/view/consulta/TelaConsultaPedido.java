/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.example.vrsoftware.gui.view.consulta;

import com.example.vrsoftware.gui.controller.PedidoController;
import com.example.vrsoftware.gui.dto.ClienteTabelaDTO;
import com.example.vrsoftware.gui.utils.ApiClient;
import com.example.vrsoftware.gui.dto.PedidoResponse;
import com.example.vrsoftware.gui.dto.ProdutoTabelaDTO;
import com.example.vrsoftware.gui.model.ItemPedido;
import com.google.gson.Gson;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gabriel
 */
public class TelaConsultaPedido extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroPedido
     */
    public TelaConsultaPedido() {
        initComponents();
        carregarListaProdutos();
    }

    private void carregarListaProdutos() {
        DefaultTableModel modelPorPedido = (DefaultTableModel) jTablePorPedido.getModel();
        DefaultTableModel modelPorCliente = (DefaultTableModel) jTablePorCliente.getModel();
        DefaultTableModel modelPorProduto = (DefaultTableModel) jTablePorProduto.getModel();

        // Limpa os dados existentes
        modelPorPedido.setRowCount(0);
        modelPorCliente.setRowCount(0);
        modelPorProduto.setRowCount(0);

        // TODO: Revisar tratamento de exceções
        try {

            //TODO: Refatorar lógica de carregamento das abas
            ApiClient apiClient = new ApiClient("config.properties");
            Gson gson = new Gson();

            PedidoController pedidoController = new PedidoController(apiClient, gson);

            List<PedidoResponse> pedidos = pedidoController.buscarTodosPedidosComItens();

            List<ItemPedido> listaPedidos = pedidoController.buscarItens();

            // COMEÇO PARTE CARREGAMENTO POR PEDIDO
            pedidos.forEach(pedido -> {
                Object[] dado = criarDadoParaTabelaPorPedido(pedido);
                modelPorPedido.addRow(dado);
            });

            List<ClienteTabelaDTO> clientes = new ArrayList<>();
            Map<String, ClienteTabelaDTO> mapaClientes = new HashMap<>();

            List<ProdutoTabelaDTO> produtos = new ArrayList<>();
            Map<String, ProdutoTabelaDTO> mapaProdutos = new HashMap<>();

            // COMEÇO PARTE CARREGAMENTO POR CLIENTE
            listaPedidos.forEach(pedido -> {
                String nomeCliente = pedido.getPedido().getCliente().getNome();
                BigDecimal valorAtual = pedido.getPrecoUnitario().multiply(new BigDecimal(pedido.getQuantidade()));

                if (mapaClientes.containsKey(nomeCliente)) {
                    ClienteTabelaDTO clienteExistente = mapaClientes.get(nomeCliente);
                    clienteExistente.setPreco(clienteExistente.getPreco().add(valorAtual));
                    clienteExistente.setQntPedidos(clienteExistente.getQntPedidos() + 1L);
                } else {
                    ClienteTabelaDTO novoCliente = new ClienteTabelaDTO(
                            1L,
                            pedido.getPedido().getCliente().getCodigo(),
                            nomeCliente,
                            valorAtual
                    );
                    mapaClientes.put(nomeCliente, novoCliente);
                    clientes.add(novoCliente);
                }
                String nomeProduto = pedido.getProduto().getDescricao();
                BigDecimal valorTotal = pedido.getPrecoUnitario().multiply(new BigDecimal(pedido.getQuantidade()));

                if (mapaProdutos.containsKey(nomeProduto)) {
                    ProdutoTabelaDTO produtoExistente = mapaProdutos.get(nomeProduto);
                    produtoExistente.setValorTotal(produtoExistente.getValorTotal().add(valorTotal));
                } else {
                    ProdutoTabelaDTO novoProduto = new ProdutoTabelaDTO(
                            pedido.getProduto().getCodigo(),
                            pedido.getProduto().getDescricao(),
                            valorTotal
                    );
                    mapaProdutos.put(nomeProduto, novoProduto);
                    produtos.add(novoProduto);
                }
            });

            clientes.forEach(cliente -> {
                modelPorCliente.addRow(new Object[]{
                    cliente.getCodigo(),
                    cliente.getNome(),
                    "R$ " + cliente.getPreco()
                });
            });

            produtos.forEach(produto -> {
                modelPorProduto.addRow(new Object[]{
                    produto.getCodigo(),
                    produto.getDescricao(),
                    "R$ " + produto.getValorTotal()
                });
            });

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar dados: " + e.getMessage());
        }
    }

    private static Object[] criarDadoParaTabelaPorPedido(PedidoResponse pedido) {
        BigDecimal valorTotalPedido = BigDecimal.ZERO;

        // Calcula o valor total do pedido
        for (ItemPedido item : pedido.getItens()) {
            BigDecimal valorItem = item.getPrecoUnitario().multiply(new BigDecimal(item.getQuantidade()));
            valorTotalPedido = valorTotalPedido.add(valorItem);
        }

        // Cria o array de dados para adicionar na tabela
        return new Object[]{
            pedido.getId(),
            pedido.getCliente().getNome(),
            pedido.getDataPedido(),
            "R$ " + valorTotalPedido
        };
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCadastro = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePorPedido = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePorCliente = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablePorProduto = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("VR Software - Mercado Fulano - Cadastro Pedido");
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        jLabelCadastro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelCadastro.setText("Consulta de Pedido");
        jLabelCadastro.setToolTipText("");

        jTablePorPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nº Pedido", "Cliente", "Data", "Valor Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTablePorPedido);

        jTabbedPane1.addTab("Por Pedido", jScrollPane1);

        jTablePorCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Nome", "Valor Total Pedidos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTablePorCliente);

        jTabbedPane1.addTab("Por Cliente", jScrollPane2);

        jTablePorProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Descrição", "Valor Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTablePorProduto);

        jTabbedPane1.addTab("Por Produto", jScrollPane3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addComponent(jLabelCadastro)
                .addContainerGap(302, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabelCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        getAccessibleContext().setAccessibleName("VR Software - Consulta de Pedido");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaPedido.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaPedido.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaPedido.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaPedido.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsultaPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelCadastro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTablePorCliente;
    private javax.swing.JTable jTablePorPedido;
    private javax.swing.JTable jTablePorProduto;
    // End of variables declaration//GEN-END:variables
}
