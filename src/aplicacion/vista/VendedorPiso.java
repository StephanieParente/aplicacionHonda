/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.vista;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

public class VendedorPiso extends javax.swing.JFrame {
    
    int xMouse, yMouse;
    
    PageIniVP pI = new PageIniVP();
    Page1CotCli p1 = new Page1CotCli(); 
    aplicacion.vista.Page1BuscarVcl p2 = new aplicacion.vista.Page1BuscarVcl();
    Page3BusCli p3 = new Page3BusCli();
    Page4AggCli p4 = new Page4AggCli();
    Page5ModifCli p5 = new Page5ModifCli();
    Page6ElimCli p6 = new Page6ElimCli();
    Page7BusFact p7 = new Page7BusFact();
    Page8AggFact p8 = new Page8AggFact();
    Page9ModifFact p9 = new Page9ModifFact();
    Page10ElimFact p10 = new Page10ElimFact();
    
    public VendedorPiso() {
        initComponents();
        
        ShowPanel(pI);
        OcultarOptions();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        menusPnl = new javax.swing.JPanel();
        logoHonda = new javax.swing.JLabel();
        lblPacif = new javax.swing.JLabel();
        btnCli = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnInicio = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btnCotizacion = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        btnVehc = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JSeparator();
        btnFa = new javax.swing.JButton();
        pnlConsVehc = new javax.swing.JPanel();
        lblVcl3 = new javax.swing.JLabel();
        logoCar3 = new javax.swing.JLabel();
        btnConsVehiculos = new javax.swing.JButton();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        pnlConsCot = new javax.swing.JPanel();
        btnConsultarCot = new javax.swing.JButton();
        jSeparator13 = new javax.swing.JSeparator();
        pnlConsFac = new javax.swing.JScrollPane();
        pnlConsFa = new javax.swing.JPanel();
        jSeparator5 = new javax.swing.JSeparator();
        btnAgregarFa = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        btnConsultarFa = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        btnModificarFa = new javax.swing.JButton();
        btnEliminarFa = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();
        pnlConsClie = new javax.swing.JScrollPane();
        pnlConsCli = new javax.swing.JPanel();
        jSeparator9 = new javax.swing.JSeparator();
        btnAgregarC = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JSeparator();
        btnConsultarC = new javax.swing.JButton();
        jSeparator11 = new javax.swing.JSeparator();
        btnModificarC = new javax.swing.JButton();
        btnEliminarC = new javax.swing.JButton();
        jSeparator17 = new javax.swing.JSeparator();
        pnlCerrar = new javax.swing.JPanel();
        pnlColorCerrar = new javax.swing.JPanel();
        lblBtnCerrar = new javax.swing.JLabel();
        pnlContent = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(750, 500));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menusPnl.setBackground(new java.awt.Color(153, 153, 153));
        menusPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoHonda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hondaLogo-removebg-preview (1).png"))); // NOI18N
        menusPnl.add(logoHonda, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        lblPacif.setFont(new java.awt.Font("Hondafont", 0, 10)); // NOI18N
        lblPacif.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPacif.setText("Pacíifico");
        menusPnl.add(lblPacif, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 140, 20));

        btnCli.setBackground(new java.awt.Color(153, 153, 153));
        btnCli.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_user_20px_2.png"))); // NOI18N
        btnCli.setText("Clientes");
        btnCli.setBorder(null);
        btnCli.setContentAreaFilled(false);
        btnCli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCli.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCli.setOpaque(true);
        btnCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCliMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCliMouseExited(evt);
            }
        });
        btnCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCliActionPerformed(evt);
            }
        });
        menusPnl.add(btnCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 190, 30));

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        menusPnl.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 190, 30));

        btnInicio.setBackground(new java.awt.Color(153, 153, 153));
        btnInicio.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pagina-de-inicio (1).png"))); // NOI18N
        btnInicio.setText("Inicio");
        btnInicio.setBorder(null);
        btnInicio.setContentAreaFilled(false);
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInicio.setOpaque(true);
        btnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInicioMouseExited(evt);
            }
        });
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        menusPnl.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 190, 30));

        jSeparator2.setBackground(new java.awt.Color(102, 102, 102));
        menusPnl.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 190, 30));

        btnCotizacion.setBackground(new java.awt.Color(153, 153, 153));
        btnCotizacion.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnCotizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_file_20px.png"))); // NOI18N
        btnCotizacion.setText("Cotizacion");
        btnCotizacion.setBorder(null);
        btnCotizacion.setContentAreaFilled(false);
        btnCotizacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCotizacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCotizacion.setOpaque(true);
        btnCotizacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCotizacionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCotizacionMouseExited(evt);
            }
        });
        btnCotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCotizacionActionPerformed(evt);
            }
        });
        menusPnl.add(btnCotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 190, 30));

        jSeparator3.setBackground(new java.awt.Color(102, 102, 102));
        menusPnl.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 190, 30));

        btnVehc.setBackground(new java.awt.Color(153, 153, 153));
        btnVehc.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnVehc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/car (1).png"))); // NOI18N
        btnVehc.setText("Vehiculos");
        btnVehc.setBorder(null);
        btnVehc.setContentAreaFilled(false);
        btnVehc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVehc.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnVehc.setOpaque(true);
        btnVehc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVehcMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVehcMouseExited(evt);
            }
        });
        btnVehc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVehcActionPerformed(evt);
            }
        });
        menusPnl.add(btnVehc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 190, 30));

        jSeparator8.setBackground(new java.awt.Color(102, 102, 102));
        menusPnl.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 190, 30));

        btnFa.setBackground(new java.awt.Color(153, 153, 153));
        btnFa.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnFa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_finance_document_20px.png"))); // NOI18N
        btnFa.setText("Facturas");
        btnFa.setBorder(null);
        btnFa.setContentAreaFilled(false);
        btnFa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnFa.setOpaque(true);
        btnFa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFaMouseExited(evt);
            }
        });
        btnFa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFaActionPerformed(evt);
            }
        });
        menusPnl.add(btnFa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 190, 30));

        pnlConsVehc.setBackground(new java.awt.Color(153, 153, 153));
        pnlConsVehc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlConsVehc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlConsVehcMouseClicked(evt);
            }
        });
        pnlConsVehc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblVcl3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblVcl3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblVcl3.setText("Facturas");
        lblVcl3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVcl3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVcl3MouseClicked(evt);
            }
        });
        pnlConsVehc.add(lblVcl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, 20));

        logoCar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_file_20px.png"))); // NOI18N
        logoCar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoCar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoCar3MouseClicked(evt);
            }
        });
        pnlConsVehc.add(logoCar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        btnConsVehiculos.setBackground(new java.awt.Color(153, 153, 153));
        btnConsVehiculos.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnConsVehiculos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscando-coche.png"))); // NOI18N
        btnConsVehiculos.setText("Consultar");
        btnConsVehiculos.setBorder(null);
        btnConsVehiculos.setContentAreaFilled(false);
        btnConsVehiculos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsVehiculos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnConsVehiculos.setOpaque(true);
        btnConsVehiculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsVehiculosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConsVehiculosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConsVehiculosMouseExited(evt);
            }
        });
        btnConsVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsVehiculosActionPerformed(evt);
            }
        });
        pnlConsVehc.add(btnConsVehiculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 116, 40));

        jSeparator12.setBackground(new java.awt.Color(51, 51, 51));
        pnlConsVehc.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 140, 10));

        menusPnl.add(pnlConsVehc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, 45));

        jSeparator14.setBackground(new java.awt.Color(102, 102, 102));
        menusPnl.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 190, 30));

        pnlConsCot.setBackground(new java.awt.Color(153, 153, 153));
        pnlConsCot.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnConsultarCot.setBackground(new java.awt.Color(153, 153, 153));
        btnConsultarCot.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnConsultarCot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_search_account_20px_1.png"))); // NOI18N
        btnConsultarCot.setText("Consultar");
        btnConsultarCot.setBorder(null);
        btnConsultarCot.setContentAreaFilled(false);
        btnConsultarCot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultarCot.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnConsultarCot.setOpaque(true);
        btnConsultarCot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsultarCotMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConsultarCotMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConsultarCotMouseExited(evt);
            }
        });
        btnConsultarCot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarCotActionPerformed(evt);
            }
        });
        pnlConsCot.add(btnConsultarCot, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 116, 40));

        jSeparator13.setBackground(new java.awt.Color(51, 51, 51));
        pnlConsCot.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 49, 140, 10));

        menusPnl.add(pnlConsCot, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 210, -1));

        pnlConsFac.setBackground(new java.awt.Color(153, 153, 153));

        pnlConsFa.setBackground(new java.awt.Color(153, 153, 153));
        pnlConsFa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator5.setBackground(new java.awt.Color(51, 51, 51));
        pnlConsFa.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 111, 116, 10));

        btnAgregarFa.setBackground(new java.awt.Color(153, 153, 153));
        btnAgregarFa.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnAgregarFa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconmonstr-user-26-24.png"))); // NOI18N
        btnAgregarFa.setText("Agregar");
        btnAgregarFa.setBorder(null);
        btnAgregarFa.setContentAreaFilled(false);
        btnAgregarFa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarFa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAgregarFa.setOpaque(true);
        btnAgregarFa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarFaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarFaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarFaMouseExited(evt);
            }
        });
        btnAgregarFa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarFaActionPerformed(evt);
            }
        });
        pnlConsFa.add(btnAgregarFa, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 62, 116, 40));

        jSeparator4.setBackground(new java.awt.Color(51, 51, 51));
        pnlConsFa.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 49, 116, 10));

        btnConsultarFa.setBackground(new java.awt.Color(153, 153, 153));
        btnConsultarFa.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnConsultarFa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_search_client_20px.png"))); // NOI18N
        btnConsultarFa.setText("Consultar");
        btnConsultarFa.setBorder(null);
        btnConsultarFa.setContentAreaFilled(false);
        btnConsultarFa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultarFa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnConsultarFa.setOpaque(true);
        btnConsultarFa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsultarFaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConsultarFaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConsultarFaMouseExited(evt);
            }
        });
        btnConsultarFa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarFaActionPerformed(evt);
            }
        });
        pnlConsFa.add(btnConsultarFa, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 0, 116, 40));

        jSeparator6.setBackground(new java.awt.Color(51, 51, 51));
        pnlConsFa.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 179, 116, 10));

        btnModificarFa.setBackground(new java.awt.Color(153, 153, 153));
        btnModificarFa.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnModificarFa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_edit_property_20px.png"))); // NOI18N
        btnModificarFa.setText("Modificar");
        btnModificarFa.setBorder(null);
        btnModificarFa.setContentAreaFilled(false);
        btnModificarFa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificarFa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnModificarFa.setOpaque(true);
        btnModificarFa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnModificarFaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnModificarFaMouseExited(evt);
            }
        });
        btnModificarFa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarFaActionPerformed(evt);
            }
        });
        pnlConsFa.add(btnModificarFa, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 130, 116, 40));

        btnEliminarFa.setBackground(new java.awt.Color(153, 153, 153));
        btnEliminarFa.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEliminarFa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconmonstr-user-26-24.png"))); // NOI18N
        btnEliminarFa.setText("Eliminar");
        btnEliminarFa.setBorder(null);
        btnEliminarFa.setContentAreaFilled(false);
        btnEliminarFa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarFa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEliminarFa.setOpaque(true);
        btnEliminarFa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarFaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarFaMouseExited(evt);
            }
        });
        btnEliminarFa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarFaActionPerformed(evt);
            }
        });
        pnlConsFa.add(btnEliminarFa, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 198, 116, 40));

        jSeparator7.setBackground(new java.awt.Color(51, 51, 51));
        pnlConsFa.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 247, 116, 10));

        pnlConsFac.setViewportView(pnlConsFa);

        menusPnl.add(pnlConsFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 186, 116));

        pnlConsClie.setBackground(new java.awt.Color(153, 153, 153));

        pnlConsCli.setBackground(new java.awt.Color(153, 153, 153));
        pnlConsCli.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator9.setBackground(new java.awt.Color(51, 51, 51));
        pnlConsCli.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 111, 116, 10));

        btnAgregarC.setBackground(new java.awt.Color(153, 153, 153));
        btnAgregarC.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnAgregarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconmonstr-user-26-24.png"))); // NOI18N
        btnAgregarC.setText("Agregar");
        btnAgregarC.setBorder(null);
        btnAgregarC.setContentAreaFilled(false);
        btnAgregarC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAgregarC.setOpaque(true);
        btnAgregarC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarCMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarCMouseExited(evt);
            }
        });
        btnAgregarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCActionPerformed(evt);
            }
        });
        pnlConsCli.add(btnAgregarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 62, 116, 40));

        jSeparator10.setBackground(new java.awt.Color(51, 51, 51));
        pnlConsCli.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 49, 116, 10));

        btnConsultarC.setBackground(new java.awt.Color(153, 153, 153));
        btnConsultarC.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnConsultarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_search_client_20px.png"))); // NOI18N
        btnConsultarC.setText("Consultar");
        btnConsultarC.setBorder(null);
        btnConsultarC.setContentAreaFilled(false);
        btnConsultarC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultarC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnConsultarC.setOpaque(true);
        btnConsultarC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsultarCMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConsultarCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConsultarCMouseExited(evt);
            }
        });
        btnConsultarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarCActionPerformed(evt);
            }
        });
        pnlConsCli.add(btnConsultarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 0, 116, 40));

        jSeparator11.setBackground(new java.awt.Color(51, 51, 51));
        pnlConsCli.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 179, 116, 10));

        btnModificarC.setBackground(new java.awt.Color(153, 153, 153));
        btnModificarC.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnModificarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_edit_property_20px.png"))); // NOI18N
        btnModificarC.setText("Modificar");
        btnModificarC.setBorder(null);
        btnModificarC.setContentAreaFilled(false);
        btnModificarC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificarC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnModificarC.setOpaque(true);
        btnModificarC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnModificarCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnModificarCMouseExited(evt);
            }
        });
        btnModificarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarCActionPerformed(evt);
            }
        });
        pnlConsCli.add(btnModificarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 130, 116, 40));

        btnEliminarC.setBackground(new java.awt.Color(153, 153, 153));
        btnEliminarC.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEliminarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconmonstr-user-26-24.png"))); // NOI18N
        btnEliminarC.setText("Eliminar");
        btnEliminarC.setBorder(null);
        btnEliminarC.setContentAreaFilled(false);
        btnEliminarC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEliminarC.setOpaque(true);
        btnEliminarC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarCMouseExited(evt);
            }
        });
        btnEliminarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCActionPerformed(evt);
            }
        });
        pnlConsCli.add(btnEliminarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 198, 116, 40));

        jSeparator17.setBackground(new java.awt.Color(51, 51, 51));
        pnlConsCli.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 247, 116, 10));

        pnlConsClie.setViewportView(pnlConsCli);

        menusPnl.add(pnlConsClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 190, 118));

        background.add(menusPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 210, 480));

        pnlCerrar.setBackground(new java.awt.Color(185, 5, 12));
        pnlCerrar.setPreferredSize(new java.awt.Dimension(25, 25));
        pnlCerrar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlCerrarMouseDragged(evt);
            }
        });
        pnlCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlCerrarMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlCerrarMousePressed(evt);
            }
        });

        pnlColorCerrar.setBackground(new java.awt.Color(185, 5, 12));

        lblBtnCerrar.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        lblBtnCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtnCerrar.setText("X");
        lblBtnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBtnCerrar.setPreferredSize(new java.awt.Dimension(25, 25));
        lblBtnCerrar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblBtnCerrarMouseMoved(evt);
            }
        });
        lblBtnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBtnCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBtnCerrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlColorCerrarLayout = new javax.swing.GroupLayout(pnlColorCerrar);
        pnlColorCerrar.setLayout(pnlColorCerrarLayout);
        pnlColorCerrarLayout.setHorizontalGroup(
            pnlColorCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnCerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );
        pnlColorCerrarLayout.setVerticalGroup(
            pnlColorCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnCerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlCerrarLayout = new javax.swing.GroupLayout(pnlCerrar);
        pnlCerrar.setLayout(pnlCerrarLayout);
        pnlCerrarLayout.setHorizontalGroup(
            pnlCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCerrarLayout.createSequentialGroup()
                .addGap(0, 717, Short.MAX_VALUE)
                .addComponent(pnlColorCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlCerrarLayout.setVerticalGroup(
            pnlCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlColorCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        background.add(pnlCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 30));

        pnlContent.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlContentLayout = new javax.swing.GroupLayout(pnlContent);
        pnlContent.setLayout(pnlContentLayout);
        pnlContentLayout.setHorizontalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );
        pnlContentLayout.setVerticalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        background.add(pnlContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 540, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblBtnCerrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnCerrarMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_lblBtnCerrarMouseMoved

    private void lblBtnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblBtnCerrarMouseClicked

    private void lblBtnCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnCerrarMouseEntered
        pnlColorCerrar.setBackground(Color.red);
        lblBtnCerrar.setForeground(Color.white);
    }//GEN-LAST:event_lblBtnCerrarMouseEntered

    private void lblBtnCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnCerrarMouseExited
        pnlColorCerrar.setBackground(new Color(185, 5, 12));
        lblBtnCerrar.setForeground(Color.black);
    }//GEN-LAST:event_lblBtnCerrarMouseExited

    private void pnlCerrarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCerrarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_pnlCerrarMouseDragged

    private void pnlCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCerrarMouseEntered

    }//GEN-LAST:event_pnlCerrarMouseEntered

    private void pnlCerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCerrarMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_pnlCerrarMousePressed

    private void lblVcl3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVcl3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblVcl3MouseClicked

    private void logoCar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoCar3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_logoCar3MouseClicked

    private void pnlConsVehcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlConsVehcMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlConsVehcMouseClicked

    private void btnConsVehiculosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsVehiculosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsVehiculosMouseClicked

    private void btnConsVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsVehiculosActionPerformed
        ShowPanel(p2);
    }//GEN-LAST:event_btnConsVehiculosActionPerformed

    private void btnAgregarFaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarFaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarFaMouseClicked

    private void btnAgregarFaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarFaMouseEntered
        btnAgregarFa.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_btnAgregarFaMouseEntered

    private void btnAgregarFaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarFaMouseExited
        btnAgregarFa.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_btnAgregarFaMouseExited

    private void btnAgregarFaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarFaActionPerformed
        ShowPanel(p8);
    }//GEN-LAST:event_btnAgregarFaActionPerformed

    private void btnConsultarFaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarFaMouseClicked

    }//GEN-LAST:event_btnConsultarFaMouseClicked

    private void btnConsultarFaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarFaMouseEntered
        btnConsultarFa.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_btnConsultarFaMouseEntered

    private void btnConsultarFaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarFaMouseExited
        btnConsultarFa.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_btnConsultarFaMouseExited

    private void btnConsultarFaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarFaActionPerformed
        ShowPanel(p7);
    }//GEN-LAST:event_btnConsultarFaActionPerformed

    private void btnModificarFaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarFaMouseEntered
        btnModificarFa.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_btnModificarFaMouseEntered

    private void btnModificarFaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarFaMouseExited
        btnModificarFa.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_btnModificarFaMouseExited

    private void btnModificarFaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarFaActionPerformed
        ShowPanel(p9);
    }//GEN-LAST:event_btnModificarFaActionPerformed

    private void btnEliminarFaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarFaMouseEntered
        btnEliminarFa.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_btnEliminarFaMouseEntered

    private void btnEliminarFaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarFaMouseExited
        btnEliminarFa.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_btnEliminarFaMouseExited

    private void btnEliminarFaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarFaActionPerformed
        ShowPanel(p10);
    }//GEN-LAST:event_btnEliminarFaActionPerformed

    private void btnConsultarCotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarCotActionPerformed
        ShowPanel(p1);
    }//GEN-LAST:event_btnConsultarCotActionPerformed

    private void btnConsultarCotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarCotMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarCotMouseClicked

    private void btnCliMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCliMouseEntered
        btnCli.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_btnCliMouseEntered

    private void btnCliMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCliMouseExited
        btnCli.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_btnCliMouseExited

    private void btnCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCliActionPerformed
        if (pnlConsClie.isVisible()) {
            pnlConsClie.setVisible(false);
        }else{
            OcultarOptions();
            pnlConsClie.setVisible(true);
        }
    }//GEN-LAST:event_btnCliActionPerformed

    private void btnInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseEntered
        btnInicio.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_btnInicioMouseEntered

    private void btnInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseExited
        btnInicio.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_btnInicioMouseExited

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        ShowPanel(pI);
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnCotizacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCotizacionMouseEntered
        btnCotizacion.setBackground(new Color(204, 204, 204));    }//GEN-LAST:event_btnCotizacionMouseEntered

    private void btnCotizacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCotizacionMouseExited
        btnCotizacion.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_btnCotizacionMouseExited

    private void btnCotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCotizacionActionPerformed
        if (pnlConsCot.isVisible()) {
            pnlConsCot.setVisible(false);
        }else{
            OcultarOptions();
            pnlConsCot.setVisible(true);
        }
    }//GEN-LAST:event_btnCotizacionActionPerformed

    private void btnVehcMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVehcMouseEntered
        btnVehc.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_btnVehcMouseEntered

    private void btnVehcMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVehcMouseExited
        btnVehc.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_btnVehcMouseExited

    private void btnVehcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVehcActionPerformed
        if (pnlConsVehc.isVisible()) {
            pnlConsVehc.setVisible(false);
        }else{
            OcultarOptions();
            pnlConsVehc.setVisible(true);
        }     
    }//GEN-LAST:event_btnVehcActionPerformed

    private void btnAgregarCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarCMouseClicked
        btnAgregarC.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_btnAgregarCMouseClicked

    private void btnAgregarCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarCMouseEntered
        
    }//GEN-LAST:event_btnAgregarCMouseEntered

    private void btnAgregarCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarCMouseExited
        btnAgregarC.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_btnAgregarCMouseExited

    private void btnAgregarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCActionPerformed
        ShowPanel(p4);
    }//GEN-LAST:event_btnAgregarCActionPerformed

    private void btnConsultarCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarCMouseClicked
        btnConsultarC.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_btnConsultarCMouseClicked

    private void btnConsultarCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarCMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarCMouseEntered

    private void btnConsultarCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarCMouseExited
        btnConsultarC.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_btnConsultarCMouseExited

    private void btnConsultarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarCActionPerformed
        ShowPanel(p3);
    }//GEN-LAST:event_btnConsultarCActionPerformed

    private void btnModificarCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarCMouseEntered
        btnModificarC.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_btnModificarCMouseEntered

    private void btnModificarCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarCMouseExited
        btnModificarC.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_btnModificarCMouseExited

    private void btnModificarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarCActionPerformed
        ShowPanel(p5);
    }//GEN-LAST:event_btnModificarCActionPerformed

    private void btnEliminarCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarCMouseEntered
        btnEliminarC.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_btnEliminarCMouseEntered

    private void btnEliminarCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarCMouseExited
        btnEliminarC.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_btnEliminarCMouseExited

    private void btnEliminarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCActionPerformed
        ShowPanel(p6);
    }//GEN-LAST:event_btnEliminarCActionPerformed

    private void btnFaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFaMouseEntered
        btnFa.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_btnFaMouseEntered

    private void btnFaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFaMouseExited
        btnFa.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_btnFaMouseExited

    private void btnFaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFaActionPerformed
        if (pnlConsFac.isVisible()) {
            pnlConsFac.setVisible(false);
        }else{
            OcultarOptions();
            pnlConsFac.setVisible(true);
        }
    }//GEN-LAST:event_btnFaActionPerformed

    private void btnConsultarCotMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarCotMouseEntered
        btnConsultarCot.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_btnConsultarCotMouseEntered

    private void btnConsultarCotMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarCotMouseExited
        btnConsultarCot.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_btnConsultarCotMouseExited

    private void btnConsVehiculosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsVehiculosMouseEntered
        btnConsVehiculos.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_btnConsVehiculosMouseEntered

    private void btnConsVehiculosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsVehiculosMouseExited
        btnConsVehiculos.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_btnConsVehiculosMouseExited

    private void ShowPanel(JPanel p){
        p.setSize(540, 480);
        p.setLocation(0, 0);
        
        pnlContent.removeAll();
        pnlContent.add(p, BorderLayout.CENTER);
        pnlContent.revalidate();
        pnlContent.repaint();
    }
    
    private void OcultarOptions () {
        pnlConsCot.setVisible(false);
        pnlConsVehc.setVisible(false);
        pnlConsClie.setVisible(false);
        pnlConsFac.setVisible(false);
    }
    
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
            java.util.logging.Logger.getLogger(VendedorPiso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VendedorPiso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VendedorPiso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VendedorPiso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new VendedorPiso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnAgregarC;
    private javax.swing.JButton btnAgregarFa;
    private javax.swing.JButton btnCli;
    private javax.swing.JButton btnConsVehiculos;
    private javax.swing.JButton btnConsultarC;
    private javax.swing.JButton btnConsultarCot;
    private javax.swing.JButton btnConsultarFa;
    private javax.swing.JButton btnCotizacion;
    private javax.swing.JButton btnEliminarC;
    private javax.swing.JButton btnEliminarFa;
    private javax.swing.JButton btnFa;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnModificarC;
    private javax.swing.JButton btnModificarFa;
    private javax.swing.JButton btnVehc;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblBtnCerrar;
    private javax.swing.JLabel lblPacif;
    private javax.swing.JLabel lblVcl3;
    private javax.swing.JLabel logoCar3;
    private javax.swing.JLabel logoHonda;
    private javax.swing.JPanel menusPnl;
    private javax.swing.JPanel pnlCerrar;
    private javax.swing.JPanel pnlColorCerrar;
    private javax.swing.JPanel pnlConsCli;
    private javax.swing.JScrollPane pnlConsClie;
    private javax.swing.JPanel pnlConsCot;
    private javax.swing.JPanel pnlConsFa;
    private javax.swing.JScrollPane pnlConsFac;
    private javax.swing.JPanel pnlConsVehc;
    private javax.swing.JPanel pnlContent;
    // End of variables declaration//GEN-END:variables

}
