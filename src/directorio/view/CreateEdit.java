/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package directorio.view;

import directorio.mensajes.Messages;
import java.awt.TextField;
import javax.swing.JOptionPane;

/**
 *
 * @author caliche
 */
public class CreateEdit extends javax.swing.JFrame {
 
    Messages msg2 = Messages.getMessagesRetriever();
    /**ut
     * Creates new form crear
     */
    public CreateEdit() {
        initComponents();
        Messages msg = Messages.getMessagesRetriever();
        lbCreateName.setText(msg.getMessage("create.label.name"));
        lbCrearTelefono.setText(msg.getMessage("create.label.phone"));
        btnGrabar.setLabel(msg.getMessage("create.label.add"));
        btnCrearCancelar.setLabel(msg.getMessage("create.label.cancel"));
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbCreateName = new java.awt.Label();
        lbCrearTelefono = new java.awt.Label();
        txtCrearNombre = new java.awt.TextField();
        txtCrearTelefono = new java.awt.TextField();
        btnGrabar = new java.awt.Button();
        btnCrearCancelar = new java.awt.Button();

        setMaximumSize(new java.awt.Dimension(200, 200));
        setMinimumSize(new java.awt.Dimension(300, 200));
        setPreferredSize(new java.awt.Dimension(300, 200));
        setResizable(false);

        lbCreateName.setMinimumSize(new java.awt.Dimension(200, 200));
        lbCreateName.setText("Nombre");

        lbCrearTelefono.setText("Telefono");

        btnGrabar.setLabel("Grabar");
        btnGrabar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGrabarMouseClicked(evt);
            }
        });

        btnCrearCancelar.setLabel("Cancelar");
        btnCrearCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearCancelarMouseClicked(evt);
            }
        });
        btnCrearCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbCreateName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(txtCrearNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbCrearTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(txtCrearTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnCrearCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCreateName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCrearNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbCrearTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCrearTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCancelarActionPerformed
        CreateEdit _crear = new CreateEdit();
        _crear.setVisible(false);
    }//GEN-LAST:event_btnCrearCancelarActionPerformed

    private void btnGrabarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGrabarMouseClicked
        if(!"".equals(txtCrearNombre.getText()) && !"".equals(txtCrearTelefono.getText())){
            //TODO:codigo para grabar nuevo contacto
        }else{
            JOptionPane.showMessageDialog(null, "campo obligatorias");
        }
        
        
    }//GEN-LAST:event_btnGrabarMouseClicked

    private void btnCrearCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearCancelarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrearCancelarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnCrearCancelar;
    private java.awt.Button btnGrabar;
    private java.awt.Label lbCrearTelefono;
    private java.awt.Label lbCreateName;
    private java.awt.TextField txtCrearNombre;
    private java.awt.TextField txtCrearTelefono;
    // End of variables declaration//GEN-END:variables
}
