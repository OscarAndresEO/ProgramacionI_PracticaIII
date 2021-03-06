/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

/**
 *
 * @author oscar
 */
public class Bitácora extends javax.swing.JDialog {

    /**
     * Creates new form Bitácora
     */
    public Bitácora(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(parent);
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
        jMenuBar1 = new javax.swing.JMenuBar();
        Dispositivos = new javax.swing.JMenu();
        GestionarDispositivos = new javax.swing.JMenuItem();
        Acciones = new javax.swing.JMenu();
        AccionesDispositivos = new javax.swing.JMenuItem();
        AccionesExternas = new javax.swing.JMenuItem();
        Reportes = new javax.swing.JMenu();
        Bitácora = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel1.setText("Bitácora");

        Dispositivos.setText("Dispositivos");

        GestionarDispositivos.setText("Gestionar Dispositivos");
        GestionarDispositivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestionarDispositivosActionPerformed(evt);
            }
        });
        Dispositivos.add(GestionarDispositivos);

        jMenuBar1.add(Dispositivos);

        Acciones.setText("Acciones");

        AccionesDispositivos.setText("Acciones con Dispositivos");
        AccionesDispositivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccionesDispositivosActionPerformed(evt);
            }
        });
        Acciones.add(AccionesDispositivos);

        AccionesExternas.setText("Acciones Externas al Dispositivo");
        AccionesExternas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccionesExternasActionPerformed(evt);
            }
        });
        Acciones.add(AccionesExternas);

        jMenuBar1.add(Acciones);

        Reportes.setText("Reportes");

        Bitácora.setText("Bitácora");
        Bitácora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BitácoraActionPerformed(evt);
            }
        });
        Reportes.add(Bitácora);

        jMenuBar1.add(Reportes);

        jMenu1.setText("Usuarios");

        jMenuItem1.setText("Gestionar Usuarios");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addContainerGap(311, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(247, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GestionarDispositivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionarDispositivosActionPerformed
         this.setVisible(false);
        Interfaz interfaz = new Interfaz();
        new GestionarDispositivos(interfaz,true).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_GestionarDispositivosActionPerformed

    private void AccionesDispositivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccionesDispositivosActionPerformed
        this.setVisible(false);
         Interfaz interfaz = new Interfaz();
        new AccionesDispositivos(interfaz,true).setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_AccionesDispositivosActionPerformed

    private void AccionesExternasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccionesExternasActionPerformed
         this.setVisible(false);
        Interfaz interfaz = new Interfaz();
        new AccionesExternas(interfaz,true).setVisible(true);
        this.setVisible(false);
       
    }//GEN-LAST:event_AccionesExternasActionPerformed

    private void BitácoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BitácoraActionPerformed
        this.setVisible(false);
        Interfaz interfaz = new Interfaz();
        new Bitácora(interfaz,true).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BitácoraActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
         this.setVisible(false);
        Interfaz interfaz = new Interfaz();
        new Usuarios(interfaz, true).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Bitácora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bitácora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bitácora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bitácora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Bitácora dialog = new Bitácora(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Acciones;
    private javax.swing.JMenuItem AccionesDispositivos;
    private javax.swing.JMenuItem AccionesExternas;
    private javax.swing.JMenuItem Bitácora;
    private javax.swing.JMenu Dispositivos;
    private javax.swing.JMenuItem GestionarDispositivos;
    private javax.swing.JMenu Reportes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
