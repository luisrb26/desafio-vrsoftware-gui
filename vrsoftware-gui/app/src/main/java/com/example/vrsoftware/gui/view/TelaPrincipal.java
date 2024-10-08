/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.example.vrsoftware.gui.view;

import com.example.vrsoftware.gui.view.cadastro.TelaCadastroCliente;
import com.example.vrsoftware.gui.view.cadastro.TelaCadastroPedido;
import com.example.vrsoftware.gui.view.cadastro.TelaCadastroProduto;
import com.example.vrsoftware.gui.view.consulta.TelaConsultaCliente;
import com.example.vrsoftware.gui.view.consulta.TelaConsultaPedido;
import com.example.vrsoftware.gui.view.consulta.TelaConsultaProduto;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;

/**
 *
 * @author Gabriel
 */
public class TelaPrincipal extends javax.swing.JFrame {

    private Map<String, JFrame> janelasAbertas;

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        janelasAbertas = new HashMap<>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBarTelaPrincipal = new javax.swing.JMenuBar();
        jMenuPedido = new javax.swing.JMenu();
        jMenuItemConsultarPedido = new javax.swing.JMenuItem();
        jMenuItemCadastrarPedido = new javax.swing.JMenuItem();
        jMenuProduto = new javax.swing.JMenu();
        jMenuItemConsultarProduto = new javax.swing.JMenuItem();
        jMenuItemCadastrarProduto = new javax.swing.JMenuItem();
        jMenuCliente = new javax.swing.JMenu();
        jMenuItemConsultarCliente = new javax.swing.JMenuItem();
        jMenuItemCadastrarCliente = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VR Software - Mercado Fulano");
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo-mercado.png"))); // NOI18N

        jMenuPedido.setText("Pedido");
        jMenuPedido.setToolTipText("");

        jMenuItemConsultarPedido.setText("Consultar");
        jMenuItemConsultarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultarPedidoActionPerformed(evt);
            }
        });
        jMenuPedido.add(jMenuItemConsultarPedido);

        jMenuItemCadastrarPedido.setText("Cadastrar");
        jMenuItemCadastrarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastrarPedidoActionPerformed(evt);
            }
        });
        jMenuPedido.add(jMenuItemCadastrarPedido);

        jMenuBarTelaPrincipal.add(jMenuPedido);

        jMenuProduto.setText("Produto");

        jMenuItemConsultarProduto.setText("Consultar");
        jMenuItemConsultarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultarProdutoActionPerformed(evt);
            }
        });
        jMenuProduto.add(jMenuItemConsultarProduto);

        jMenuItemCadastrarProduto.setText("Cadastrar");
        jMenuItemCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastrarProdutoActionPerformed(evt);
            }
        });
        jMenuProduto.add(jMenuItemCadastrarProduto);

        jMenuBarTelaPrincipal.add(jMenuProduto);

        jMenuCliente.setText("Cliente");

        jMenuItemConsultarCliente.setText("Consultar");
        jMenuItemConsultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultarClienteActionPerformed(evt);
            }
        });
        jMenuCliente.add(jMenuItemConsultarCliente);

        jMenuItemCadastrarCliente.setText("Cadastrar");
        jMenuItemCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastrarClienteActionPerformed(evt);
            }
        });
        jMenuCliente.add(jMenuItemCadastrarCliente);

        jMenuBarTelaPrincipal.add(jMenuCliente);

        setJMenuBar(jMenuBarTelaPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel1)
                .addContainerGap(150, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("VR Software - FRESH SUPERMARKET");
        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCadastrarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastrarPedidoActionPerformed
        abrirJanela("TelaCadastroPedido", new TelaCadastroPedido());
    }//GEN-LAST:event_jMenuItemCadastrarPedidoActionPerformed

    private void jMenuItemConsultarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultarProdutoActionPerformed
        abrirJanela("TelaConsultaProduto", new TelaConsultaProduto());
    }//GEN-LAST:event_jMenuItemConsultarProdutoActionPerformed

    private void jMenuItemConsultarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultarPedidoActionPerformed
        abrirJanela("TelaConsultaPedido", new TelaConsultaPedido());
    }//GEN-LAST:event_jMenuItemConsultarPedidoActionPerformed

    private void jMenuItemCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastrarClienteActionPerformed
        abrirJanela("TelaCadastroCliente", new TelaCadastroCliente());
    }//GEN-LAST:event_jMenuItemCadastrarClienteActionPerformed

    private void jMenuItemCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastrarProdutoActionPerformed
        abrirJanela("TelaCadastroProduto", new TelaCadastroProduto());
    }//GEN-LAST:event_jMenuItemCadastrarProdutoActionPerformed

    private void jMenuItemConsultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultarClienteActionPerformed
        abrirJanela("TelaConsultaCliente", new TelaConsultaCliente());
    }//GEN-LAST:event_jMenuItemConsultarClienteActionPerformed

    private void abrirJanela(String nomeFrame, JFrame frame) {
        if (!janelasAbertas.containsKey(nomeFrame)) {
            janelasAbertas.put(nomeFrame, frame);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    janelasAbertas.remove(nomeFrame);
                }
            });
        } else {
            janelasAbertas.get(nomeFrame).toFront();
            janelasAbertas.get(nomeFrame).requestFocus();
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBarTelaPrincipal;
    private javax.swing.JMenu jMenuCliente;
    private javax.swing.JMenuItem jMenuItemCadastrarCliente;
    private javax.swing.JMenuItem jMenuItemCadastrarPedido;
    private javax.swing.JMenuItem jMenuItemCadastrarProduto;
    private javax.swing.JMenuItem jMenuItemConsultarCliente;
    private javax.swing.JMenuItem jMenuItemConsultarPedido;
    private javax.swing.JMenuItem jMenuItemConsultarProduto;
    private javax.swing.JMenu jMenuPedido;
    private javax.swing.JMenu jMenuProduto;
    // End of variables declaration//GEN-END:variables
}
