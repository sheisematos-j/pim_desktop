/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pimquarto.unip;


import javax.swing.JFrame;


import javax.swing.ImageIcon; 
/**
 *
 * @author sdjma
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        setExtendedState(getExtendedState()|JFrame.MAXIMIZED_BOTH); 
           
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        painelImagemFundo1 = new com.pimquarto.unip.PainelImagemFundo();
        jMenuBar1 = new javax.swing.JMenuBar();
        jSolicitar = new javax.swing.JMenu();
        jConsultar = new javax.swing.JMenuItem();
        jGerenciar = new javax.swing.JMenuItem();
        jMoedas = new javax.swing.JMenu();
        jFuncionarios = new javax.swing.JMenu();
        jClientes = new javax.swing.JMenu();
        jIncluir = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jRelatorios = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        painelImagemFundo1.setImg(new ImageIcon("src/images/imagem_fundo.jpg"));
        getContentPane().add(painelImagemFundo1);
        painelImagemFundo1.setBounds(0, 0, 650, 470);

        jSolicitar.setText("Solicitações ");

        jConsultar.setText("Consultar");
        jConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsultarActionPerformed(evt);
            }
        });
        jSolicitar.add(jConsultar);

        jGerenciar.setText("Gerenciar");
        jGerenciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGerenciarActionPerformed(evt);
            }
        });
        jSolicitar.add(jGerenciar);

        jMenuBar1.add(jSolicitar);

        jMoedas.setText("Moedas ");
        jMenuBar1.add(jMoedas);

        jFuncionarios.setText("Funcionários");
        jMenuBar1.add(jFuncionarios);

        jClientes.setText("Clientes ");

        jIncluir.setText("Incluir ");
        jIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIncluirActionPerformed(evt);
            }
        });
        jClientes.add(jIncluir);

        jMenuItem4.setText("Buscar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jClientes.add(jMenuItem4);

        jMenuBar1.add(jClientes);

        jRelatorios.setText("Relatórios");
        jMenuBar1.add(jRelatorios);

        setJMenuBar(jMenuBar1);

        setBounds(0, 0, 1008, 546);
    }// </editor-fold>//GEN-END:initComponents

    private void jConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsultarActionPerformed
        jifconsultas obj=new jifconsultas();
        jdpprincipal.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_jConsultarActionPerformed

    private void jGerenciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGerenciarActionPerformed
       jifgerenciar obj=new jifgerenciar();
       jdpprincipal.add(obj);
       obj.setVisible(true);

    }//GEN-LAST:event_jGerenciarActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIncluirActionPerformed
        jifincluir obj=new jifincluir();
        jdpprincipal.add(obj);
        obj.setVisible(true);

    }//GEN-LAST:event_jIncluirActionPerformed

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
    private javax.swing.JMenu jClientes;
    private javax.swing.JMenuItem jConsultar;
    private javax.swing.JMenu jFuncionarios;
    private javax.swing.JMenuItem jGerenciar;
    private javax.swing.JMenuItem jIncluir;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenu jMoedas;
    private javax.swing.JMenu jRelatorios;
    private javax.swing.JMenu jSolicitar;
    private com.pimquarto.unip.PainelImagemFundo painelImagemFundo1;
    // End of variables declaration//GEN-END:variables

    private void setExtendedState() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
