/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.example.vrsoftware.gui.view.cadastro;

import com.example.vrsoftware.gui.controller.ClienteController;
import com.example.vrsoftware.gui.controller.PedidoController;
import com.example.vrsoftware.gui.controller.ProdutoController;
import com.example.vrsoftware.gui.model.Cliente;
import com.example.vrsoftware.gui.model.Produto;
import com.example.vrsoftware.gui.utils.ApiClient;
import com.google.gson.Gson;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gabriel
 */
public class TelaCadastroPedido extends javax.swing.JFrame {

    public Cliente[] clientes = new Cliente[0];
    private Cliente clienteSelecionado;
    private Produto[] produtos;

    /**
     * Creates new form TelaCadastroPedido
     */
    public TelaCadastroPedido() {
        initComponents();
        carregarListaClientes();
        carregarListaProdutos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jDialog3 = new javax.swing.JDialog();
        jDialog4 = new javax.swing.JDialog();
        jDialog5 = new javax.swing.JDialog();
        jLabelCadastro = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jComboBoxListaClientes = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCodigoCliente = new javax.swing.JTextField();
        jLabelCodigoCliente = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldLimiteCompra = new javax.swing.JTextField();
        jLabelLimiteCompra = new javax.swing.JLabel();
        jTextFieldDiaFechamento = new javax.swing.JTextField();
        jLabelDiaFechamento = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProdutos = new javax.swing.JTable();
        jButtonAdicionarProduto = new javax.swing.JButton();
        jComboBoxListaProdutos = new javax.swing.JComboBox<>();
        jSpinnerQuantidade = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog4Layout = new javax.swing.GroupLayout(jDialog4.getContentPane());
        jDialog4.getContentPane().setLayout(jDialog4Layout);
        jDialog4Layout.setHorizontalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog4Layout.setVerticalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog5Layout = new javax.swing.GroupLayout(jDialog5.getContentPane());
        jDialog5.getContentPane().setLayout(jDialog5Layout);
        jDialog5Layout.setHorizontalGroup(
            jDialog5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog5Layout.setVerticalGroup(
            jDialog5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("VR Software - Mercado Fulano - Cadastro Pedido");
        setResizable(false);

        jLabelCadastro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelCadastro.setText("Cadastro de Pedido");
        jLabelCadastro.setToolTipText("");

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(750, 370));

        jComboBoxListaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxListaClientesActionPerformed(evt);
            }
        });

        jLabel1.setText("Cliente");

        jTextFieldCodigoCliente.setEditable(false);
        jTextFieldCodigoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoClienteActionPerformed(evt);
            }
        });

        jLabelCodigoCliente.setText("Código");

        jTextFieldNome.setEditable(false);
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jLabelNome.setText("Nome");

        jTextFieldLimiteCompra.setEditable(false);
        jTextFieldLimiteCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLimiteCompraActionPerformed(evt);
            }
        });

        jLabelLimiteCompra.setText("Limite de Compra");

        jTextFieldDiaFechamento.setEditable(false);
        jTextFieldDiaFechamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDiaFechamentoActionPerformed(evt);
            }
        });

        jLabelDiaFechamento.setText("Dia de Fechamento");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCodigoCliente)
                            .addComponent(jTextFieldCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNome)
                            .addComponent(jTextFieldNome)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelLimiteCompra)
                                        .addGap(102, 102, 102))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextFieldLimiteCompra)
                                        .addGap(44, 44, 44)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelDiaFechamento)
                                    .addComponent(jTextFieldDiaFechamento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 410, Short.MAX_VALUE))
                    .addComponent(jComboBoxListaClientes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxListaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelCodigoCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelLimiteCompra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldLimiteCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelDiaFechamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDiaFechamento, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(188, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dados do Cliente", jPanel1);

        jTableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Quantidade", "Descrição do Produto", "Preço (UN)", "Preço Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableProdutos);
        if (jTableProdutos.getColumnModel().getColumnCount() > 0) {
            jTableProdutos.getColumnModel().getColumn(0).setResizable(false);
            jTableProdutos.getColumnModel().getColumn(1).setResizable(false);
            jTableProdutos.getColumnModel().getColumn(2).setResizable(false);
            jTableProdutos.getColumnModel().getColumn(3).setResizable(false);
            jTableProdutos.getColumnModel().getColumn(4).setResizable(false);
        }

        jButtonAdicionarProduto.setText("Adicionar Produto");
        jButtonAdicionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarProdutoActionPerformed(evt);
            }
        });

        jComboBoxListaProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxListaProdutosActionPerformed(evt);
            }
        });

        jSpinnerQuantidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jSpinnerQuantidade.setModel(new javax.swing.SpinnerNumberModel(1, 1, 999, 1));

        jLabel2.setText("Selecione o Produto:");

        jLabel3.setText("Quantidade");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jComboBoxListaProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinnerQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAdicionarProduto)
                        .addGap(13, 13, 13)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxListaProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAdicionarProduto))
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Produtos", jPanel2);

        jButtonSalvar.setText("Finalizar Pedido");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancelar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(274, 274, 274)
                            .addComponent(jLabelCadastro))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabelCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonCancelar))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("VR Software - Cadastro de Pedido");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxListaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxListaClientesActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTableProdutos.getModel();
        // Reseta lista de pedidos
        model.setRowCount(0);

        int selectedIndex = jComboBoxListaClientes.getSelectedIndex();

        if (selectedIndex != -1 && clientes != null) {
            clienteSelecionado = clientes[selectedIndex];

            jTextFieldCodigoCliente.setText(clienteSelecionado.getCodigo());
            jTextFieldNome.setText(clienteSelecionado.getNome());
            jTextFieldLimiteCompra.setText("R$ " + clienteSelecionado.getLimiteCompra().toString());
            jTextFieldDiaFechamento.setText(String.valueOf(clienteSelecionado.getDiaFechamento()));
        }
    }//GEN-LAST:event_jComboBoxListaClientesActionPerformed

    private void jTextFieldCodigoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoClienteActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        try {
            ApiClient apiClient = new ApiClient("config.properties");
            Gson gson = new Gson();

            PedidoController pedidoController = new PedidoController(apiClient, gson);

            DefaultTableModel model = (DefaultTableModel) jTableProdutos.getModel();

            List<Integer> produtosIds = new ArrayList<>();
            List<Integer> quantidades = new ArrayList<>();

            // Iterar sobre as linhas da tabela e extrair os dados
            for (int i = 0; i < model.getRowCount(); i++) {
                String codigoProduto = (String) model.getValueAt(i, 0);
                Integer quantidade = (Integer) model.getValueAt(i, 1);

                Long produtoId = obterIdPorCodigo(codigoProduto);
                if (produtoId != null) {
                    produtosIds.add(produtoId.intValue());
                    quantidades.add(quantidade);
                } else {
                    JOptionPane.showMessageDialog(null, "Código do produto não encontrado: " + codigoProduto);
                    return;
                }
            }
            
            if (produtosIds.size() <= 0) {
                JOptionPane.showMessageDialog(null, "Você precisa adicionar pelo menos um produto no seu pedido!");
                return;
            }
            
            Long clienteId = 0L;
            for (Cliente cliente : this.clientes) {
                if (cliente.getCodigo().equals(jTextFieldCodigoCliente.getText())) {
                    clienteId = cliente.getId();
                }
            }

            pedidoController.cadastrarPedido(clienteId, produtosIds, quantidades);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao inicializar o pedido: " + e.getMessage());
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonAdicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarProdutoActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTableProdutos.getModel();
        int selectedIndex = jComboBoxListaProdutos.getSelectedIndex();

        if (selectedIndex == -1 || produtos == null) {
            return;
        }

        Produto produtoSelecionado = produtos[selectedIndex];
        int quantidade = (Integer) jSpinnerQuantidade.getValue();
        jSpinnerQuantidade.setValue(1);

        BigDecimal preco = produtoSelecionado.getPreco();
        BigDecimal total = preco.multiply(BigDecimal.valueOf(quantidade));

        if (clienteSelecionado.getLimiteCompra().compareTo(total) < 0) {
            JOptionPane.showMessageDialog(null, "Você não tem limite de crédito disponível. Não é possível adicionar o produto!");
            return;
        }

        boolean produtoEncontrado = false;

        for (int i = 0; i < model.getRowCount(); i++) {
            String codigo = (String) model.getValueAt(i, 0);

            if (codigo.equals(produtoSelecionado.getCodigo())) {
                int quantidadeAtual = (Integer) model.getValueAt(i, 1) + quantidade;
                model.setValueAt(quantidadeAtual, i, 1);
                model.setValueAt(preco.multiply(BigDecimal.valueOf(quantidadeAtual)), i, 4);
                produtoEncontrado = true;
                break;
            }
        }

        if (!produtoEncontrado) {
            model.addRow(new Object[]{
                produtoSelecionado.getCodigo(),
                quantidade,
                produtoSelecionado.getDescricao(),
                preco,
                total
            });
        }
    }//GEN-LAST:event_jButtonAdicionarProdutoActionPerformed

    private Long obterIdPorCodigo(String codigo) {
        for (Produto produto : produtos) {
            if (produto.getCodigo().equals(codigo)) {
                return produto.getId();
            }
        }
        return null; // Retorna null se o código não for encontrado
    }

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jTextFieldLimiteCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLimiteCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLimiteCompraActionPerformed

    private void jTextFieldDiaFechamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDiaFechamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDiaFechamentoActionPerformed

    private void jComboBoxListaProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxListaProdutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxListaProdutosActionPerformed

    private void carregarListaProdutos() {
        try {
            DefaultTableModel model = (DefaultTableModel) jTableProdutos.getModel();
            ApiClient apiClient = new ApiClient("config.properties");
            Gson gson = new Gson();
            ProdutoController produtoController = new ProdutoController(apiClient, gson);

            model.setRowCount(0);

            String jsonResponse = produtoController.buscarTodosProdutos();

            produtos = gson.fromJson(jsonResponse, Produto[].class);

            jComboBoxListaProdutos.removeAllItems();

            for (Produto produto : produtos) {
                jComboBoxListaProdutos.addItem(produto.getDescricao() + " - R$" + produto.getPreco());
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao inicializar o produto: " + e.getMessage());
        }
    }

    private void carregarListaClientes() {
        try {
            ApiClient apiClient = new ApiClient("config.properties");
            Gson gson = new Gson();
            ClienteController clienteController = new ClienteController(apiClient, gson);

            String jsonResponse = clienteController.buscarTodosClientes();

            clientes = gson.fromJson(jsonResponse, Cliente[].class);

            jComboBoxListaClientes.removeAllItems();

            for (Cliente cliente : clientes) {
                jComboBoxListaClientes.addItem(cliente.getNome());
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao inicializar o cliente: " + e.getMessage());
        }
    }

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
            java.util.logging.Logger.getLogger(TelaCadastroPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionarProduto;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxListaClientes;
    private javax.swing.JComboBox<String> jComboBoxListaProdutos;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JDialog jDialog4;
    private javax.swing.JDialog jDialog5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelCadastro;
    private javax.swing.JLabel jLabelCodigoCliente;
    private javax.swing.JLabel jLabelDiaFechamento;
    private javax.swing.JLabel jLabelLimiteCompra;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerQuantidade;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableProdutos;
    private javax.swing.JTextField jTextFieldCodigoCliente;
    private javax.swing.JTextField jTextFieldDiaFechamento;
    private javax.swing.JTextField jTextFieldLimiteCompra;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
