/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.vista;


/**
 *
 * @author Usuario
 */
public class PageIniAd extends javax.swing.JPanel {

    /**
     * Creates new form pageIni
     */
    public PageIniAd() {
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

        contentIni = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        lblBienv = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnCSesion = new javax.swing.JButton();

        contentIni.setBackground(new java.awt.Color(255, 255, 255));
        contentIni.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsuario.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario.setText("Administrador de base de datos");
        lblUsuario.setToolTipText("");
        contentIni.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 260, 30));

        lblBienv.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblBienv.setText("Bienvenido a Honda Pacífico");
        contentIni.add(lblBienv, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 240, -1));

        lblUsername.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblUsername.setText("Usuario: ");
        contentIni.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 410, 40));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        contentIni.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 10, 470));

        btnCSesion.setBackground(new java.awt.Color(214, 5, 5));
        btnCSesion.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnCSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCSesion.setText("Cerrar Sesión");
        contentIni.add(btnCSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 130, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(contentIni, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(contentIni, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCSesion;
    private javax.swing.JPanel contentIni;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBienv;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables
}
