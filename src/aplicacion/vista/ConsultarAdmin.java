/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.vista;

import java.awt.Color;

public class ConsultarAdmin extends javax.swing.JPanel {

    public ConsultarAdmin() {
        initComponents();
        
        OcultarPanels();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        listaBuscarPorVcl = new javax.swing.JComboBox<>();
        txtBuscar = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableConsultarVrs = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        lblMessage = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        listaEntidades = new javax.swing.JComboBox<>();
        listaVersiones = new javax.swing.JComboBox<>();
        listaModelos = new javax.swing.JComboBox<>();
        listaColores = new javax.swing.JComboBox<>();
        listaEmpleados = new javax.swing.JComboBox<>();
        listaDept = new javax.swing.JComboBox<>();
        listaDirEmp = new javax.swing.JComboBox<>();
        listaCotiz = new javax.swing.JComboBox<>();
        listaFacts = new javax.swing.JComboBox<>();
        listaClientes = new javax.swing.JComboBox<>();
        listaDirClientes = new javax.swing.JComboBox<>();
        lblInstruct = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 470));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Administrador de base de datos");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 260, 30));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Consultar");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 147, -1));

        listaBuscarPorVcl.setBackground(new java.awt.Color(214, 5, 5));
        listaBuscarPorVcl.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        listaBuscarPorVcl.setForeground(new java.awt.Color(255, 255, 255));
        listaBuscarPorVcl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Núm. de Serie", "Precio", "País Procedencia", "Stock", "Versión", "Transmisión", "Motor", "Modelo", "Color" }));
        listaBuscarPorVcl.setBorder(new javax.swing.border.MatteBorder(null));
        listaBuscarPorVcl.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listaBuscarPorVcl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaBuscarPorVclActionPerformed(evt);
            }
        });
        jPanel1.add(listaBuscarPorVcl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 120, 35));

        txtBuscar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(153, 153, 153));
        txtBuscar.setText("Introduzca algun valor para buscar...");
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
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 244, 35));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 280, 10));

        tableConsultarVrs.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tableConsultarVrs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableConsultarVrs);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, 230));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 10, 470));

        lblMessage.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblMessage.setForeground(new java.awt.Color(0, 193, 75));
        jPanel1.add(lblMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 450, 30));

        btnConsultar.setBackground(new java.awt.Color(214, 5, 5));
        btnConsultar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnConsultar.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 100, 40));

        listaEntidades.setBackground(new java.awt.Color(214, 5, 5));
        listaEntidades.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        listaEntidades.setForeground(new java.awt.Color(255, 255, 255));
        listaEntidades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vehículos", "Versiones", "Modelos", "Colores", "Empleados", "Departamentos", "DireccionesEmpleados", "Cotizaciones", "Facturas", "Clientes", "DireccionesClientes" }));
        listaEntidades.setBorder(new javax.swing.border.MatteBorder(null));
        listaEntidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaEntidadesActionPerformed(evt);
            }
        });
        jPanel1.add(listaEntidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 170, 40));

        listaVersiones.setBackground(new java.awt.Color(214, 5, 5));
        listaVersiones.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        listaVersiones.setForeground(new java.awt.Color(255, 255, 255));
        listaVersiones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id", "Nombre", "Transmisión", "Motor" }));
        listaVersiones.setBorder(new javax.swing.border.MatteBorder(null));
        listaVersiones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(listaVersiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 120, 35));

        listaModelos.setBackground(new java.awt.Color(214, 5, 5));
        listaModelos.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        listaModelos.setForeground(new java.awt.Color(255, 255, 255));
        listaModelos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id", "Nombre" }));
        listaModelos.setBorder(new javax.swing.border.MatteBorder(null));
        listaModelos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(listaModelos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 120, 35));

        listaColores.setBackground(new java.awt.Color(214, 5, 5));
        listaColores.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        listaColores.setForeground(new java.awt.Color(255, 255, 255));
        listaColores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id", "Nombre" }));
        listaColores.setBorder(new javax.swing.border.MatteBorder(null));
        listaColores.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(listaColores, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 120, 35));

        listaEmpleados.setBackground(new java.awt.Color(214, 5, 5));
        listaEmpleados.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        listaEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        listaEmpleados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id", "Nombre", "Apellidos", "Comisión", "NSS", "Teléfono", "Correo" }));
        listaEmpleados.setBorder(new javax.swing.border.MatteBorder(null));
        listaEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(listaEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 120, 35));

        listaDept.setBackground(new java.awt.Color(214, 5, 5));
        listaDept.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        listaDept.setForeground(new java.awt.Color(255, 255, 255));
        listaDept.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id", "Nombre" }));
        listaDept.setBorder(new javax.swing.border.MatteBorder(null));
        listaDept.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(listaDept, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 120, 35));

        listaDirEmp.setBackground(new java.awt.Color(214, 5, 5));
        listaDirEmp.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        listaDirEmp.setForeground(new java.awt.Color(255, 255, 255));
        listaDirEmp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id", "Calle", "Colonia", "Núm Ext", "C. Postal" }));
        listaDirEmp.setBorder(new javax.swing.border.MatteBorder(null));
        listaDirEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(listaDirEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 120, 35));

        listaCotiz.setBackground(new java.awt.Color(214, 5, 5));
        listaCotiz.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        listaCotiz.setForeground(new java.awt.Color(255, 255, 255));
        listaCotiz.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id", "Fecha Cot.", "Usuario", "Teléfono", "Correo" }));
        listaCotiz.setBorder(new javax.swing.border.MatteBorder(null));
        listaCotiz.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(listaCotiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 120, 35));

        listaFacts.setBackground(new java.awt.Color(214, 5, 5));
        listaFacts.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        listaFacts.setForeground(new java.awt.Color(255, 255, 255));
        listaFacts.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id", "Fecha Venta", "Método Pago" }));
        listaFacts.setBorder(new javax.swing.border.MatteBorder(null));
        listaFacts.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(listaFacts, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 120, 35));

        listaClientes.setBackground(new java.awt.Color(214, 5, 5));
        listaClientes.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        listaClientes.setForeground(new java.awt.Color(255, 255, 255));
        listaClientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id", "Nombre", "Apellidos", "Sueldo", "RFC", "H. Crediticio", "FechaRegistro", "Teléfono", "Correo" }));
        listaClientes.setBorder(new javax.swing.border.MatteBorder(null));
        listaClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(listaClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 120, 35));

        listaDirClientes.setBackground(new java.awt.Color(214, 5, 5));
        listaDirClientes.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        listaDirClientes.setForeground(new java.awt.Color(255, 255, 255));
        listaDirClientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id", "Nombre", "Transmisión", "Motor" }));
        listaDirClientes.setBorder(new javax.swing.border.MatteBorder(null));
        listaDirClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(listaDirClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 120, 35));

        lblInstruct.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblInstruct.setForeground(new java.awt.Color(153, 153, 153));
        lblInstruct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstruct.setText("Seleccione una entidad para consultar sus campos");
        jPanel1.add(lblInstruct, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 320, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarMousePressed
        if (txtBuscar.getText().equals("Introduzca algun valor para buscar...")) {
            txtBuscar.setText("");
            txtBuscar.setForeground(Color.black);
        }else if(txtBuscar.getText().isEmpty()) {
            txtBuscar.setText("Introduzca algun valor para buscar...");
            txtBuscar.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtBuscarMousePressed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed

    }//GEN-LAST:event_txtBuscarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void listaEntidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaEntidadesActionPerformed
        switch (listaEntidades.getSelectedItem().toString()) {
            case "Vehículos":
                OcultarPanels();
                listaBuscarPorVcl.setVisible(true);
                break;
            case "Versiones":
                OcultarPanels();
                listaVersiones.setVisible(true);
                break;
            case "Modelos":
                OcultarPanels();
                listaModelos.setVisible(true);
                break;
            case "Colores":
                OcultarPanels();
                listaColores.setVisible(true);
                break;
            case "Empleados":
                OcultarPanels();
                listaEmpleados.setVisible(true);
                break;
            case "Departamentos":
                OcultarPanels();
                listaDept.setVisible(true);
                break;
            case "DireccionesEmpleados":
                OcultarPanels();
                listaDirEmp.setVisible(true);
                break;
            case "Cotizaciones":
                OcultarPanels();
                listaCotiz.setVisible(true);
                break;
            case "Facturas":
                OcultarPanels();
                listaFacts.setVisible(true);
                break;
            case "Clientes":
                OcultarPanels();
                listaClientes.setVisible(true);
                break;
            case "DireccionesClientes":
                OcultarPanels();
                listaDirClientes.setVisible(true);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_listaEntidadesActionPerformed

    private void listaBuscarPorVclActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaBuscarPorVclActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaBuscarPorVclActionPerformed

    private void OcultarPanels () {
        listaBuscarPorVcl.setVisible(false);
        listaVersiones.setVisible(false);
        listaModelos.setVisible(false);
        listaColores.setVisible(false);
        listaEmpleados.setVisible(false);
        listaDept.setVisible(false);
        listaDirEmp.setVisible(false);
        listaCotiz.setVisible(false);
        listaFacts.setVisible(false);
        listaClientes.setVisible(false);
        listaDirClientes.setVisible(false);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblInstruct;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JComboBox<String> listaBuscarPorVcl;
    private javax.swing.JComboBox<String> listaClientes;
    private javax.swing.JComboBox<String> listaColores;
    private javax.swing.JComboBox<String> listaCotiz;
    private javax.swing.JComboBox<String> listaDept;
    private javax.swing.JComboBox<String> listaDirClientes;
    private javax.swing.JComboBox<String> listaDirEmp;
    private javax.swing.JComboBox<String> listaEmpleados;
    private javax.swing.JComboBox<String> listaEntidades;
    private javax.swing.JComboBox<String> listaFacts;
    private javax.swing.JComboBox<String> listaModelos;
    private javax.swing.JComboBox<String> listaVersiones;
    private javax.swing.JTable tableConsultarVrs;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
