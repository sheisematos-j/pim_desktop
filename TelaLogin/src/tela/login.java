/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;

/**
 *
 * @author sdjma
 */
public class login extends javax.swing.JInternalFrame {

    /**
     * Creates new form login
     */
    public login() {
        super(null,false,false,false);
        initComponents();
        
        try {
          bitcoin = javax.imageio.ImageIO.read(new java.net.URL(getClass().getResource("bitcoin.jpg"),"bitcoin.jpg"));
        } catch (IOException e) {}

        public void paint(Graphics bitcoin)
        {
          Bitcoin.drawImage(bitcoin, 0, 0,getWidth(),getHeight(),this);
        }
        


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

protected static Image bitcoin;

}

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

