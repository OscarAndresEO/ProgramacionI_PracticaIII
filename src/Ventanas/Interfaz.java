package Ventanas;

import Clases.*;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author oscar
 */
public class Interfaz extends javax.swing.JFrame {

    public ListaEnlazada lista = new ListaEnlazada();

    public static String usuario1, contraseña1;

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        contraseña = new javax.swing.JPasswordField();
        usuario = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        labelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonSalir.setBackground(new java.awt.Color(0, 0, 51));
        BotonSalir.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        BotonSalir.setForeground(new java.awt.Color(255, 255, 255));
        BotonSalir.setText("Salir");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(BotonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 70, 30));

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 20));

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 90, -1));

        contraseña.setBackground(new java.awt.Color(0, 0, 102));
        contraseña.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        contraseña.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 130, 30));

        usuario.setBackground(new java.awt.Color(0, 0, 102));
        usuario.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        usuario.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 130, 30));

        jButton1.setBackground(new java.awt.Color(0, 0, 51));
        jButton1.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Sesion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 100, 30));

        labelFondo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelFondo.setForeground(new java.awt.Color(255, 255, 255));
        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(labelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BotonSalirActionPerformed

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.usuario1 = usuario.getText();
        this.contraseña1 = contraseña.getText();

        GestionarDispositivos gd = new GestionarDispositivos();
        gd.setLista(this.lista);

        Crear c = new Crear();
        c.setLista(this.lista);

        try {
            ConexionDB conn = ConexionDB.getConexionDB(usuario1, contraseña1);
            if (conn.acceso) {

                new Menu(this, true).setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Nombre de usuario o contraseña inválida."
                        + "\n Por favor intente nuevamente.");
                usuario.setText("");
                contraseña.setText("");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Interfaz().setVisible(true);
            }
        }
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonSalir;
    public javax.swing.JPasswordField contraseña;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelFondo;
    public javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
