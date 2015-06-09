/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package directorio.view;


import directorio.mensajes.Messages;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import directorio.cotroller.DirectorioController;
import directorio.cotroller.FileLanguageManage;
import directorio.cotroller.dto.ContactDTO;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ComponentListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Action;
import javax.swing.JCheckBox;
import javax.swing.event.MouseInputListener;


/**
 *
 * @author caliche
 */
public class MainScreen extends javax.swing.JFrame {
    final static String CONFIGURATION_FILE_PATH = "directorio.mensajes.config";
    DirectorioController _controller = DirectorioController.getDirectorioController();
    private ContactDTO currentContact = null;
    Messages msg = Messages.getMessagesRetriever();
    int y=0;
    MainScreen _main = this;
    ContactPainter _contactPainter = new ContactPainter(_main);
    /**
     * Creates new form principal
     */
    public MainScreen() {
        try {
            FileLanguageManage file = new FileLanguageManage(CONFIGURATION_FILE_PATH);
            Messages.language = file.getLanguage();
        } catch (Exception e) {
            
        }
        msg = Messages.getMessagesRetriever();
        initComponents();
        this.center();
        this.setVisible(true);
        jLLanguage.setText(msg.getMessage("MainScreen.label.language"));
        btnAdd.setText(msg.getMessage("MainScreen.label.addContact"));
        btnSearch.setText(msg.getMessage("MainScreen.label.search"));
        btnChange.setText(msg.getMessage("MainScreen.label.change"));
        jTabbedcontact.removeTabAt(0);
        jTabbedcontact.addTab(msg.getMessage("MainScreen.label.contacts"), jPanel2);
        if(Messages.language.equals("Inglés") || Messages.language.equals("English"))
        {
            comboLanguage.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "English", "Spanish" }));
        }
        _contactPainter.buildContactList(this.jPanel2,_controller.getActiveContacts());
        
        this.update(getGraphics());
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
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jFrame1 = new javax.swing.JFrame();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollBar1 = new javax.swing.JScrollBar();
        jMenuItem2 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        comboLanguage = new javax.swing.JComboBox();
        jLLanguage = new javax.swing.JLabel();
        txtFindContact = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnChange = new javax.swing.JButton();
        jTabbedcontact = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenuItem2.setText("jMenuItem2");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        comboLanguage.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Español", "Inglés" }));
        comboLanguage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboLanguageMouseClicked(evt);
            }
        });
        comboLanguage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboLanguageActionPerformed(evt);
            }
        });

        jLLanguage.setText("Idioma");

        txtFindContact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFindContactKeyReleased(evt);
            }
        });

        btnAdd.setText("Agregar Contacto");
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnSearch.setText("Buscar");
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchMouseClicked(evt);
            }
        });
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnChange.setText("cambio");
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 456, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 284, Short.MAX_VALUE)
        );

        jTabbedcontact.addTab("contactos", jPanel2);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedcontact)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtFindContact, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLLanguage)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnChange)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(96, 96, 96)))
                        .addGap(66, 66, 66))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFindContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(jLLanguage)
                    .addComponent(comboLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChange))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jTabbedcontact))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked
        
    }//GEN-LAST:event_btnSearchMouseClicked

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed

        Messages.language = comboLanguage.getSelectedItem().toString();
        msg = Messages.getMessagesRetriever();
        jLLanguage.setText(msg.getMessage("MainScreen.label.language"));
        btnAdd.setText(msg.getMessage("MainScreen.label.addContact"));
        btnSearch.setText(msg.getMessage("MainScreen.label.search"));
        btnChange.setText(msg.getMessage("MainScreen.label.change"));
        jTabbedcontact.removeTabAt(0);
        jTabbedcontact.addTab(msg.getMessage("MainScreen.label.contacts"), jPanel2);
        comboLanguage.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Español", "Inglés" }));
        if(Messages.language.equals("Inglés") || Messages.language.equals("English"))
        {
            comboLanguage.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "English", "Spanish" }));
        }
        _contactPainter.buildContactList(this.jPanel2,_controller.getActiveContacts());
        try {
            FileLanguageManage file = new FileLanguageManage(CONFIGURATION_FILE_PATH);
            file.setLanguage(Messages.language);
        } catch (Exception e) {
        }
        
                
    }//GEN-LAST:event_btnChangeActionPerformed

    private void comboLanguageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboLanguageActionPerformed
        
    }//GEN-LAST:event_comboLanguageActionPerformed

    private void comboLanguageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboLanguageMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_comboLanguageMouseClicked
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        CreateEdit _crear = new CreateEdit(this);
        _crear.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        CreateEdit _crear = new CreateEdit(this);
        ContactDTO contact = new ContactDTO();
        contact.setContactname("");
        contact.setContacphone("");
        _crear.setContact(contact);
        _crear.setVisible(true);
        _main.setEnabled(false);
    }//GEN-LAST:event_btnAddMouseClicked

    private void txtFindContactKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFindContactKeyReleased
        List<ContactDTO> contacts = _controller.findContactByCharName(txtFindContact.getText());
        _contactPainter.buildContactList(this.jPanel2,contacts);
        this.update(getGraphics());
    }//GEN-LAST:event_txtFindContactKeyReleased

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        this.txtFindContactKeyReleased(null);
    }//GEN-LAST:event_btnSearchActionPerformed
    
    public void showFilterContacts(){
        this.txtFindContactKeyReleased(null);
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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    private void center()
    {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnChange;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox comboLanguage;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLLanguage;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JTabbedPane jTabbedcontact;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtFindContact;
    // End of variables declaration//GEN-END:variables

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public ContactPainter getContactPainter() {
        return _contactPainter;
    }

    public void setContactPainter(ContactPainter _contactPainter) {
        this._contactPainter = _contactPainter;
    }
    
    
}
