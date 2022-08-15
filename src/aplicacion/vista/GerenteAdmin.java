/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.vista;

import aplicacion.vista.AgregarAdmin;
import aplicacion.vista.PageIniGAd;
import java.awt.BorderLayout;

import java.awt.Color;
import javax.swing.JPanel;

public class GerenteAdmin extends javax.swing.JFrame {
    
    int xMouse, yMouse;
    
    PageIniGAd pI = new PageIniGAd();
    Page1BuscarVcl p1 = new Page1BuscarVcl();
    Page2ConsFct p2Fct = new Page2ConsFct();
    Page3ConsCli p3Cli = new Page3ConsCli();
    Page4ConsCot p4Cot = new Page4ConsCot();
    Page5ElimCot p5Cot = new Page5ElimCot();
    AgregarAdmin pAD = new AgregarAdmin();
    
    public GerenteAdmin() {
        initComponents();
        
        ShowPanel(pI);
        
        OcultarOptions();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        pnlCerrar = new javax.swing.JPanel();
        pnlColorCerrar = new javax.swing.JPanel();
        lblBtnCerrar = new javax.swing.JLabel();
        pnlContent = new javax.swing.JPanel();
        menusPnl = new javax.swing.JPanel();
        logoHonda = new javax.swing.JLabel();
        lblPacif = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnClientes = new javax.swing.JButton();
        btnVhcls = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JSeparator();
        btnInicio = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JSeparator();
        btnFacturas = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JSeparator();
        btnCotiz = new javax.swing.JButton();
        jSeparator11 = new javax.swing.JSeparator();
        pnlOpcionVcl = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        btnConsultarVcl = new javax.swing.JButton();
        lblLogos2 = new javax.swing.JLabel();
        pnlOpcionFct = new javax.swing.JPanel();
        jSeparator13 = new javax.swing.JSeparator();
        btnConsultarFact = new javax.swing.JButton();
        lblLogos4 = new javax.swing.JLabel();
        pnlOpcionCli = new javax.swing.JPanel();
        jSeparator17 = new javax.swing.JSeparator();
        btnConsultarCli = new javax.swing.JButton();
        lblLogos3 = new javax.swing.JLabel();
        pnlOpcionCot = new javax.swing.JPanel();
        jSeparator21 = new javax.swing.JSeparator();
        btnConsultarCot = new javax.swing.JButton();
        btnEliminarCot = new javax.swing.JButton();
        jSeparator23 = new javax.swing.JSeparator();
        lblLogos1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(750, 500));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        menusPnl.setBackground(new java.awt.Color(153, 153, 153));
        menusPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoHonda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hondaLogo-removebg-preview (1).png"))); // NOI18N
        menusPnl.add(logoHonda, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        lblPacif.setFont(new java.awt.Font("Hondafont", 0, 10)); // NOI18N
        lblPacif.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPacif.setText("Pacíifico");
        menusPnl.add(lblPacif, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 140, 20));

        jSeparator2.setBackground(new java.awt.Color(102, 102, 102));
        menusPnl.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 190, 10));

        btnClientes.setBackground(new java.awt.Color(153, 153, 153));
        btnClientes.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_customer_20px.png"))); // NOI18N
        btnClientes.setText("Clientes");
        btnClientes.setBorder(null);
        btnClientes.setContentAreaFilled(false);
        btnClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnClientes.setOpaque(true);
        btnClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClientesMouseExited(evt);
            }
        });
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        menusPnl.add(btnClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 190, 30));

        btnVhcls.setBackground(new java.awt.Color(153, 153, 153));
        btnVhcls.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnVhcls.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/car (1).png"))); // NOI18N
        btnVhcls.setText("Vehículos");
        btnVhcls.setBorder(null);
        btnVhcls.setContentAreaFilled(false);
        btnVhcls.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVhcls.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnVhcls.setOpaque(true);
        btnVhcls.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVhclsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVhclsMouseExited(evt);
            }
        });
        btnVhcls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVhclsActionPerformed(evt);
            }
        });
        menusPnl.add(btnVhcls, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 180, 30));

        jSeparator8.setBackground(new java.awt.Color(102, 102, 102));
        menusPnl.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 190, 10));

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
        menusPnl.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 190, 30));

        jSeparator9.setBackground(new java.awt.Color(102, 102, 102));
        menusPnl.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 190, 10));

        btnFacturas.setBackground(new java.awt.Color(153, 153, 153));
        btnFacturas.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnFacturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_receipt_20px.png"))); // NOI18N
        btnFacturas.setText("Facturas");
        btnFacturas.setBorder(null);
        btnFacturas.setContentAreaFilled(false);
        btnFacturas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFacturas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnFacturas.setOpaque(true);
        btnFacturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFacturasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFacturasMouseExited(evt);
            }
        });
        btnFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturasActionPerformed(evt);
            }
        });
        menusPnl.add(btnFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 190, 30));

        jSeparator10.setBackground(new java.awt.Color(102, 102, 102));
        menusPnl.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 190, 10));

        btnCotiz.setBackground(new java.awt.Color(153, 153, 153));
        btnCotiz.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnCotiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_price_20px.png"))); // NOI18N
        btnCotiz.setText("Cotizaciones");
        btnCotiz.setBorder(null);
        btnCotiz.setContentAreaFilled(false);
        btnCotiz.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCotiz.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCotiz.setOpaque(true);
        btnCotiz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCotizMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCotizMouseExited(evt);
            }
        });
        btnCotiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCotizActionPerformed(evt);
            }
        });
        menusPnl.add(btnCotiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 190, 30));

        jSeparator11.setBackground(new java.awt.Color(102, 102, 102));
        menusPnl.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 190, 10));

        pnlOpcionVcl.setBackground(new java.awt.Color(153, 153, 153));

        jSeparator4.setBackground(new java.awt.Color(51, 51, 51));

        btnConsultarVcl.setBackground(new java.awt.Color(153, 153, 153));
        btnConsultarVcl.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnConsultarVcl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscando-coche.png"))); // NOI18N
        btnConsultarVcl.setText("Consultar");
        btnConsultarVcl.setBorder(null);
        btnConsultarVcl.setContentAreaFilled(false);
        btnConsultarVcl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultarVcl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnConsultarVcl.setOpaque(true);
        btnConsultarVcl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsultarVclMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConsultarVclMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConsultarVclMouseExited(evt);
            }
        });
        btnConsultarVcl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarVclActionPerformed(evt);
            }
        });

        lblLogos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/car (1).png"))); // NOI18N

        javax.swing.GroupLayout pnlOpcionVclLayout = new javax.swing.GroupLayout(pnlOpcionVcl);
        pnlOpcionVcl.setLayout(pnlOpcionVclLayout);
        pnlOpcionVclLayout.setHorizontalGroup(
            pnlOpcionVclLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcionVclLayout.createSequentialGroup()
                .addComponent(lblLogos2)
                .addGap(18, 18, 18)
                .addGroup(pnlOpcionVclLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator4)
                    .addComponent(btnConsultarVcl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        pnlOpcionVclLayout.setVerticalGroup(
            pnlOpcionVclLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcionVclLayout.createSequentialGroup()
                .addGroup(pnlOpcionVclLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConsultarVcl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLogos2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menusPnl.add(pnlOpcionVcl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 180, -1));

        pnlOpcionFct.setBackground(new java.awt.Color(153, 153, 153));

        jSeparator13.setBackground(new java.awt.Color(51, 51, 51));

        btnConsultarFact.setBackground(new java.awt.Color(153, 153, 153));
        btnConsultarFact.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnConsultarFact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_search_in_list_20px_1.png"))); // NOI18N
        btnConsultarFact.setText("Consultar");
        btnConsultarFact.setBorder(null);
        btnConsultarFact.setContentAreaFilled(false);
        btnConsultarFact.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultarFact.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnConsultarFact.setOpaque(true);
        btnConsultarFact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsultarFactMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConsultarFactMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConsultarFactMouseExited(evt);
            }
        });
        btnConsultarFact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarFactActionPerformed(evt);
            }
        });

        lblLogos4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_receipt_20px.png"))); // NOI18N

        javax.swing.GroupLayout pnlOpcionFctLayout = new javax.swing.GroupLayout(pnlOpcionFct);
        pnlOpcionFct.setLayout(pnlOpcionFctLayout);
        pnlOpcionFctLayout.setHorizontalGroup(
            pnlOpcionFctLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcionFctLayout.createSequentialGroup()
                .addComponent(lblLogos4)
                .addGap(14, 14, 14)
                .addGroup(pnlOpcionFctLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator13)
                    .addComponent(btnConsultarFact, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        pnlOpcionFctLayout.setVerticalGroup(
            pnlOpcionFctLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcionFctLayout.createSequentialGroup()
                .addGroup(pnlOpcionFctLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConsultarFact, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLogos4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menusPnl.add(pnlOpcionFct, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 180, -1));

        pnlOpcionCli.setBackground(new java.awt.Color(153, 153, 153));

        jSeparator17.setBackground(new java.awt.Color(51, 51, 51));

        btnConsultarCli.setBackground(new java.awt.Color(153, 153, 153));
        btnConsultarCli.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnConsultarCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_search_client_25px_1.png"))); // NOI18N
        btnConsultarCli.setText("Consultar");
        btnConsultarCli.setBorder(null);
        btnConsultarCli.setContentAreaFilled(false);
        btnConsultarCli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultarCli.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnConsultarCli.setOpaque(true);
        btnConsultarCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsultarCliMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConsultarCliMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConsultarCliMouseExited(evt);
            }
        });
        btnConsultarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarCliActionPerformed(evt);
            }
        });

        lblLogos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_customer_20px.png"))); // NOI18N

        javax.swing.GroupLayout pnlOpcionCliLayout = new javax.swing.GroupLayout(pnlOpcionCli);
        pnlOpcionCli.setLayout(pnlOpcionCliLayout);
        pnlOpcionCliLayout.setHorizontalGroup(
            pnlOpcionCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcionCliLayout.createSequentialGroup()
                .addComponent(lblLogos3)
                .addGap(14, 14, 14)
                .addGroup(pnlOpcionCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator17)
                    .addComponent(btnConsultarCli, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlOpcionCliLayout.setVerticalGroup(
            pnlOpcionCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcionCliLayout.createSequentialGroup()
                .addGroup(pnlOpcionCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConsultarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLogos3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menusPnl.add(pnlOpcionCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 180, -1));

        pnlOpcionCot.setBackground(new java.awt.Color(153, 153, 153));
        pnlOpcionCot.setPreferredSize(new java.awt.Dimension(210, 210));
        pnlOpcionCot.setVerifyInputWhenFocusTarget(false);
        pnlOpcionCot.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator21.setBackground(new java.awt.Color(51, 51, 51));
        pnlOpcionCot.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 46, 116, 10));

        btnConsultarCot.setBackground(new java.awt.Color(153, 153, 153));
        btnConsultarCot.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnConsultarCot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_search_in_list_20px_1.png"))); // NOI18N
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
        pnlOpcionCot.add(btnConsultarCot, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 116, 40));

        btnEliminarCot.setBackground(new java.awt.Color(153, 153, 153));
        btnEliminarCot.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEliminarCot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Delete_Graph_Report_20px.png"))); // NOI18N
        btnEliminarCot.setText("Eliminar");
        btnEliminarCot.setBorder(null);
        btnEliminarCot.setContentAreaFilled(false);
        btnEliminarCot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarCot.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEliminarCot.setOpaque(true);
        btnEliminarCot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarCotMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarCotMouseExited(evt);
            }
        });
        btnEliminarCot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCotActionPerformed(evt);
            }
        });
        pnlOpcionCot.add(btnEliminarCot, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 62, 116, 40));

        jSeparator23.setBackground(new java.awt.Color(51, 51, 51));
        pnlOpcionCot.add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 108, 116, 10));

        lblLogos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_price_20px.png"))); // NOI18N
        pnlOpcionCot.add(lblLogos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        menusPnl.add(pnlOpcionCot, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 180, 120));

        background.add(menusPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 210, 480));

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

    private void btnClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseEntered
        btnClientes.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_btnClientesMouseEntered

    private void btnClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseExited
        btnClientes.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_btnClientesMouseExited

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        if (pnlOpcionCli.isVisible()) {
            pnlOpcionCli.setVisible(false);
        }else{
            OcultarOptions();
            pnlOpcionCli.setVisible(true);
        }
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnVhclsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVhclsMouseEntered
        btnVhcls.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_btnVhclsMouseEntered

    private void btnVhclsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVhclsMouseExited
        btnVhcls.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_btnVhclsMouseExited

    private void btnVhclsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVhclsActionPerformed
        if (pnlOpcionVcl.isVisible()) {
            pnlOpcionVcl.setVisible(false);
        }else{
            OcultarOptions();
            pnlOpcionVcl.setVisible(true);
        }
    }//GEN-LAST:event_btnVhclsActionPerformed

    private void btnInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseEntered
        btnInicio.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_btnInicioMouseEntered

    private void btnInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseExited
        btnInicio.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_btnInicioMouseExited

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        ShowPanel(pI);
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnFacturasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFacturasMouseEntered
        btnFacturas.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_btnFacturasMouseEntered

    private void btnFacturasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFacturasMouseExited
        btnFacturas.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_btnFacturasMouseExited

    private void btnFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturasActionPerformed
        if (pnlOpcionFct.isVisible()) {
            pnlOpcionFct.setVisible(false);
        }else{
            OcultarOptions();
            pnlOpcionFct.setVisible(true);
        }
    }//GEN-LAST:event_btnFacturasActionPerformed

    private void btnCotizMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCotizMouseEntered
        btnCotiz.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_btnCotizMouseEntered

    private void btnCotizMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCotizMouseExited
        btnCotiz.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_btnCotizMouseExited

    private void btnCotizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCotizActionPerformed
        if (pnlOpcionCot.isVisible()) {
            pnlOpcionCot.setVisible(false);
        }else{
            OcultarOptions();
            pnlOpcionCot.setVisible(true);
        }
    }//GEN-LAST:event_btnCotizActionPerformed

    private void btnConsultarVclMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarVclMouseClicked

    }//GEN-LAST:event_btnConsultarVclMouseClicked

    private void btnConsultarVclMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarVclMouseEntered
        btnConsultarVcl.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_btnConsultarVclMouseEntered

    private void btnConsultarVclMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarVclMouseExited
        btnConsultarVcl.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_btnConsultarVclMouseExited

    private void btnConsultarVclActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarVclActionPerformed
        p1.lblUsuario.setText("Gerente Administrativo");
        ShowPanel(p1);
    }//GEN-LAST:event_btnConsultarVclActionPerformed

    private void btnConsultarFactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarFactMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarFactMouseClicked

    private void btnConsultarFactMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarFactMouseEntered
        btnConsultarFact.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_btnConsultarFactMouseEntered

    private void btnConsultarFactMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarFactMouseExited
        btnConsultarFact.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_btnConsultarFactMouseExited

    private void btnConsultarFactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarFactActionPerformed
        ShowPanel(p2Fct);
    }//GEN-LAST:event_btnConsultarFactActionPerformed

    private void btnConsultarCliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarCliMouseClicked

    }//GEN-LAST:event_btnConsultarCliMouseClicked

    private void btnConsultarCliMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarCliMouseEntered
        btnConsultarCli.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_btnConsultarCliMouseEntered

    private void btnConsultarCliMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarCliMouseExited
        btnConsultarCli.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_btnConsultarCliMouseExited

    private void btnConsultarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarCliActionPerformed
        ShowPanel(p3Cli);
    }//GEN-LAST:event_btnConsultarCliActionPerformed

    private void btnConsultarCotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarCotMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarCotMouseClicked

    private void btnConsultarCotMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarCotMouseEntered
        btnConsultarCot.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_btnConsultarCotMouseEntered

    private void btnConsultarCotMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarCotMouseExited
        btnConsultarCot.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_btnConsultarCotMouseExited

    private void btnConsultarCotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarCotActionPerformed
        ShowPanel(p4Cot);
    }//GEN-LAST:event_btnConsultarCotActionPerformed

    private void btnEliminarCotMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarCotMouseEntered
        btnEliminarCot.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_btnEliminarCotMouseEntered

    private void btnEliminarCotMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarCotMouseExited
        btnEliminarCot.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_btnEliminarCotMouseExited

    private void btnEliminarCotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCotActionPerformed
        ShowPanel(p5Cot);
    }//GEN-LAST:event_btnEliminarCotActionPerformed

    private void ShowPanel(JPanel p){
        p.setSize(540, 480);
        p.setLocation(0, 0);
        
        pnlContent.removeAll();
        pnlContent.add(p, BorderLayout.CENTER);
        pnlContent.revalidate();
        pnlContent.repaint();
    }
    
    private void OcultarOptions() {
        pnlOpcionVcl.setVisible(false);
        pnlOpcionFct.setVisible(false);
        pnlOpcionCli.setVisible(false);
        pnlOpcionCot.setVisible(false);
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
            java.util.logging.Logger.getLogger(GerenteAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenteAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenteAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenteAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenteAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnConsultarCli;
    private javax.swing.JButton btnConsultarCot;
    private javax.swing.JButton btnConsultarFact;
    private javax.swing.JButton btnConsultarVcl;
    private javax.swing.JButton btnCotiz;
    private javax.swing.JButton btnEliminarCot;
    private javax.swing.JButton btnFacturas;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnVhcls;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblBtnCerrar;
    private javax.swing.JLabel lblLogos1;
    private javax.swing.JLabel lblLogos2;
    private javax.swing.JLabel lblLogos3;
    private javax.swing.JLabel lblLogos4;
    private javax.swing.JLabel lblPacif;
    private javax.swing.JLabel logoHonda;
    private javax.swing.JPanel menusPnl;
    private javax.swing.JPanel pnlCerrar;
    private javax.swing.JPanel pnlColorCerrar;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JPanel pnlOpcionCli;
    private javax.swing.JPanel pnlOpcionCot;
    private javax.swing.JPanel pnlOpcionFct;
    private javax.swing.JPanel pnlOpcionVcl;
    // End of variables declaration//GEN-END:variables

}
