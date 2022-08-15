/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.vista;

import java.awt.Color;

/**
 *
 * @author Usuario
 */
public class Page1BuscModelo extends javax.swing.JPanel {

    /**
     * Creates new form page1
     */
    public Page1BuscModelo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        lblUsuario = new javax.swing.JLabel();
        lblAccion = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableConsultarM = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        lblMessage = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        lblIdVrs = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(600, 470));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsuario.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario.setText("Gerente de Taller");
        lblUsuario.setToolTipText("");
        add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 220, 50));

        lblAccion.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblAccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAccion.setText("Consultar Modelo");
        add(lblAccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 147, -1));

        txtBuscar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(153, 153, 153));
        txtBuscar.setText("Introduzca algun Id para buscar...");
        txtBuscar.setBorder(null);
        txtBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtBuscarMousePressed(evt);
            }
        });
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 244, 40));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 280, 10));

        tableConsultarM.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tableConsultarM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableConsultarM);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, 240));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 10, 470));

        lblMessage.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblMessage.setForeground(new java.awt.Color(0, 193, 75));
        add(lblMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 450, 30));

        btnConsultar.setBackground(new java.awt.Color(214, 5, 5));
        btnConsultar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnConsultar.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 100, 40));

        lblIdVrs.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblIdVrs.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIdVrs.setText("Id:");
        add(lblIdVrs, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 110, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void txtBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarMousePressed
        if (txtBuscar.getText().equals("Introduzca algun valor para buscar...")) {
            txtBuscar.setText("");
            txtBuscar.setForeground(Color.black);
        }else if(txtBuscar.getText().isEmpty()) {
            txtBuscar.setText("Introduzca algun valor para buscar...");
            txtBuscar.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtBuscarMousePressed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblAccion;
    private javax.swing.JLabel lblIdVrs;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTable tableConsultarM;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}