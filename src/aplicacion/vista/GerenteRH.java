/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.vista;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

public class GerenteRH extends javax.swing.JFrame {
    
    int xMouse, yMouse;
    
    PageIniGRH pI = new PageIniGRH();
    Page1BuscarEmp p1 = new Page1BuscarEmp();
    Page2AggEmp p2 = new Page2AggEmp();
    Page3ModifEmp p3 = new Page3ModifEmp();
    Page4EliminarEmp p4 = new Page4EliminarEmp();
    
    public GerenteRH() {
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
        pnlInicio = new javax.swing.JPanel();
        lblInicio = new javax.swing.JLabel();
        logoInicio = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        menuEmp = new javax.swing.JPanel();
        lblEmp = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        logoEmp = new javax.swing.JLabel();
        lblPacif = new javax.swing.JLabel();
        pnlSEmp = new javax.swing.JScrollPane();
        pnlOpcion = new javax.swing.JPanel();
        jSeparator5 = new javax.swing.JSeparator();
        btnAgregarEmp = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        btnConsultarrEmp = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        btnModificarrEmp = new javax.swing.JButton();
        btnEliminarrEmp = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        menuDept = new javax.swing.JPanel();
        lblDept = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        logoDept = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        menuDirEmp = new javax.swing.JPanel();
        lblDirEmp = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        logoDirEmp = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        pnlSDept = new javax.swing.JScrollPane();
        pnlOpcion1 = new javax.swing.JPanel();
        jSeparator13 = new javax.swing.JSeparator();
        btnAgregarDept = new javax.swing.JButton();
        jSeparator14 = new javax.swing.JSeparator();
        btnConsultarDept = new javax.swing.JButton();
        jSeparator15 = new javax.swing.JSeparator();
        btnModificarDept = new javax.swing.JButton();
        btnEliminarDept = new javax.swing.JButton();
        jSeparator16 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        pnlSDirEmp = new javax.swing.JScrollPane();
        pnlOpcion2 = new javax.swing.JPanel();
        jSeparator17 = new javax.swing.JSeparator();
        btnAggDirEmp = new javax.swing.JButton();
        jSeparator18 = new javax.swing.JSeparator();
        btnConsDirEmp = new javax.swing.JButton();
        jSeparator19 = new javax.swing.JSeparator();
        btnModDirEmp = new javax.swing.JButton();
        btnElimDirEmp = new javax.swing.JButton();
        jSeparator20 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
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

        pnlInicio.setBackground(new java.awt.Color(153, 153, 153));
        pnlInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlInicioMouseClicked(evt);
            }
        });

        lblInicio.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblInicio.setText("Inicio");
        lblInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInicioMouseClicked(evt);
            }
        });

        logoInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pagina-de-inicio (1).png"))); // NOI18N
        logoInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoInicioMouseClicked(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout pnlInicioLayout = new javax.swing.GroupLayout(pnlInicio);
        pnlInicio.setLayout(pnlInicioLayout);
        pnlInicioLayout.setHorizontalGroup(
            pnlInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInicioLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(logoInicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
            .addGroup(pnlInicioLayout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlInicioLayout.setVerticalGroup(
            pnlInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInicioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logoInicio)
                    .addComponent(lblInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        menusPnl.add(pnlInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 50));

        menuEmp.setBackground(new java.awt.Color(153, 153, 153));
        menuEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuEmpMouseClicked(evt);
            }
        });
        menuEmp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEmp.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblEmp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblEmp.setText("Empleados");
        lblEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEmpMouseClicked(evt);
            }
        });
        menuEmp.add(lblEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 20));

        jSeparator3.setBackground(new java.awt.Color(102, 102, 102));
        menuEmp.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 126, 186, 10));

        logoEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconmonstr-user-1-24.png"))); // NOI18N
        logoEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoEmp.setMaximumSize(new java.awt.Dimension(20, 20));
        logoEmp.setMinimumSize(new java.awt.Dimension(20, 20));
        logoEmp.setPreferredSize(new java.awt.Dimension(20, 20));
        logoEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoEmpMouseClicked(evt);
            }
        });
        menuEmp.add(logoEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 28, 30));

        menusPnl.add(menuEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 200, 40));

        lblPacif.setFont(new java.awt.Font("Hondafont", 0, 10)); // NOI18N
        lblPacif.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPacif.setText("Pacíifico");
        menusPnl.add(lblPacif, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 140, 20));

        pnlSEmp.setBackground(new java.awt.Color(153, 153, 153));

        pnlOpcion.setBackground(new java.awt.Color(153, 153, 153));
        pnlOpcion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator5.setBackground(new java.awt.Color(51, 51, 51));
        pnlOpcion.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 105, 116, 10));

        btnAgregarEmp.setBackground(new java.awt.Color(153, 153, 153));
        btnAgregarEmp.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnAgregarEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconmonstr-user-23-24.png"))); // NOI18N
        btnAgregarEmp.setText("Agregar");
        btnAgregarEmp.setBorder(null);
        btnAgregarEmp.setContentAreaFilled(false);
        btnAgregarEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarEmp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAgregarEmp.setOpaque(true);
        btnAgregarEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarEmpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarEmpMouseExited(evt);
            }
        });
        btnAgregarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEmpActionPerformed(evt);
            }
        });
        pnlOpcion.add(btnAgregarEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 59, 116, 40));

        jSeparator4.setBackground(new java.awt.Color(51, 51, 51));
        pnlOpcion.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 46, 116, 10));

        btnConsultarrEmp.setBackground(new java.awt.Color(153, 153, 153));
        btnConsultarrEmp.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnConsultarrEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_search_client_25px_1.png"))); // NOI18N
        btnConsultarrEmp.setText("Consultar");
        btnConsultarrEmp.setBorder(null);
        btnConsultarrEmp.setContentAreaFilled(false);
        btnConsultarrEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultarrEmp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnConsultarrEmp.setOpaque(true);
        btnConsultarrEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsultarrEmpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConsultarrEmpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConsultarrEmpMouseExited(evt);
            }
        });
        btnConsultarrEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarrEmpActionPerformed(evt);
            }
        });
        pnlOpcion.add(btnConsultarrEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 0, 116, 40));

        jSeparator6.setBackground(new java.awt.Color(51, 51, 51));
        pnlOpcion.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 167, 116, 10));

        btnModificarrEmp.setBackground(new java.awt.Color(153, 153, 153));
        btnModificarrEmp.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnModificarrEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconmonstr-user-32-24.png"))); // NOI18N
        btnModificarrEmp.setText("Modificar");
        btnModificarrEmp.setBorder(null);
        btnModificarrEmp.setContentAreaFilled(false);
        btnModificarrEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificarrEmp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnModificarrEmp.setOpaque(true);
        btnModificarrEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnModificarrEmpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnModificarrEmpMouseExited(evt);
            }
        });
        btnModificarrEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarrEmpActionPerformed(evt);
            }
        });
        pnlOpcion.add(btnModificarrEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 121, 116, 40));

        btnEliminarrEmp.setBackground(new java.awt.Color(153, 153, 153));
        btnEliminarrEmp.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEliminarrEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconmonstr-user-26-24.png"))); // NOI18N
        btnEliminarrEmp.setText("Eliminar");
        btnEliminarrEmp.setBorder(null);
        btnEliminarrEmp.setContentAreaFilled(false);
        btnEliminarrEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarrEmp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEliminarrEmp.setOpaque(true);
        btnEliminarrEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarrEmpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarrEmpMouseExited(evt);
            }
        });
        btnEliminarrEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarrEmpActionPerformed(evt);
            }
        });
        pnlOpcion.add(btnEliminarrEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 183, 116, 40));

        jSeparator7.setBackground(new java.awt.Color(51, 51, 51));
        pnlOpcion.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 229, 116, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconmonstr-user-1-24.png"))); // NOI18N
        pnlOpcion.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        pnlSEmp.setViewportView(pnlOpcion);

        menusPnl.add(pnlSEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 210, 120));

        jSeparator8.setBackground(new java.awt.Color(102, 102, 102));
        menusPnl.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 190, 10));

        menuDept.setBackground(new java.awt.Color(153, 153, 153));
        menuDept.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuDept.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuDeptMouseClicked(evt);
            }
        });
        menuDept.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDept.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblDept.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDept.setText("Departamentos");
        lblDept.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDept.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDeptMouseClicked(evt);
            }
        });
        menuDept.add(lblDept, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 20));

        jSeparator9.setBackground(new java.awt.Color(102, 102, 102));
        menuDept.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 126, 186, 10));

        logoDept.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Office_25px_1.png"))); // NOI18N
        logoDept.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoDept.setMaximumSize(new java.awt.Dimension(20, 20));
        logoDept.setMinimumSize(new java.awt.Dimension(20, 20));
        logoDept.setPreferredSize(new java.awt.Dimension(20, 20));
        logoDept.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoDeptMouseClicked(evt);
            }
        });
        menuDept.add(logoDept, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 28, 30));

        menusPnl.add(menuDept, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 200, 40));

        jSeparator10.setBackground(new java.awt.Color(102, 102, 102));
        menusPnl.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 190, 10));

        menuDirEmp.setBackground(new java.awt.Color(153, 153, 153));
        menuDirEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuDirEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuDirEmpMouseClicked(evt);
            }
        });
        menuDirEmp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDirEmp.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblDirEmp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDirEmp.setText("Direcciones Empleados");
        lblDirEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDirEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDirEmpMouseClicked(evt);
            }
        });
        menuDirEmp.add(lblDirEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 20));

        jSeparator11.setBackground(new java.awt.Color(102, 102, 102));
        menuDirEmp.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 126, 186, 10));

        logoDirEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_address_25px.png"))); // NOI18N
        logoDirEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoDirEmp.setMaximumSize(new java.awt.Dimension(20, 20));
        logoDirEmp.setMinimumSize(new java.awt.Dimension(20, 20));
        logoDirEmp.setPreferredSize(new java.awt.Dimension(20, 20));
        logoDirEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoDirEmpMouseClicked(evt);
            }
        });
        menuDirEmp.add(logoDirEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 28, 30));

        menusPnl.add(menuDirEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 200, 40));

        jSeparator12.setBackground(new java.awt.Color(102, 102, 102));
        menusPnl.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 190, 10));

        pnlSDept.setBackground(new java.awt.Color(153, 153, 153));

        pnlOpcion1.setBackground(new java.awt.Color(153, 153, 153));
        pnlOpcion1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator13.setBackground(new java.awt.Color(51, 51, 51));
        pnlOpcion1.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 105, 116, 10));

        btnAgregarDept.setBackground(new java.awt.Color(153, 153, 153));
        btnAgregarDept.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnAgregarDept.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton-mas (1).png"))); // NOI18N
        btnAgregarDept.setText("Agregar");
        btnAgregarDept.setBorder(null);
        btnAgregarDept.setContentAreaFilled(false);
        btnAgregarDept.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarDept.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAgregarDept.setOpaque(true);
        btnAgregarDept.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarDeptMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarDeptMouseExited(evt);
            }
        });
        btnAgregarDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarDeptActionPerformed(evt);
            }
        });
        pnlOpcion1.add(btnAgregarDept, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 59, 116, 40));

        jSeparator14.setBackground(new java.awt.Color(51, 51, 51));
        pnlOpcion1.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 46, 116, 10));

        btnConsultarDept.setBackground(new java.awt.Color(153, 153, 153));
        btnConsultarDept.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnConsultarDept.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconmonstr-magnifier-11-24.png"))); // NOI18N
        btnConsultarDept.setText("Consultar");
        btnConsultarDept.setBorder(null);
        btnConsultarDept.setContentAreaFilled(false);
        btnConsultarDept.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultarDept.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnConsultarDept.setOpaque(true);
        btnConsultarDept.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsultarDeptMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConsultarDeptMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConsultarDeptMouseExited(evt);
            }
        });
        btnConsultarDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarDeptActionPerformed(evt);
            }
        });
        pnlOpcion1.add(btnConsultarDept, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 0, 116, 40));

        jSeparator15.setBackground(new java.awt.Color(51, 51, 51));
        pnlOpcion1.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 167, 116, 10));

        btnModificarDept.setBackground(new java.awt.Color(153, 153, 153));
        btnModificarDept.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnModificarDept.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_edit_property_20px.png"))); // NOI18N
        btnModificarDept.setText("Modificar");
        btnModificarDept.setBorder(null);
        btnModificarDept.setContentAreaFilled(false);
        btnModificarDept.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificarDept.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnModificarDept.setOpaque(true);
        btnModificarDept.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnModificarDeptMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnModificarDeptMouseExited(evt);
            }
        });
        btnModificarDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarDeptActionPerformed(evt);
            }
        });
        pnlOpcion1.add(btnModificarDept, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 121, 116, 40));

        btnEliminarDept.setBackground(new java.awt.Color(153, 153, 153));
        btnEliminarDept.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEliminarDept.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_delete_database_20px_1.png"))); // NOI18N
        btnEliminarDept.setText("Eliminar");
        btnEliminarDept.setBorder(null);
        btnEliminarDept.setContentAreaFilled(false);
        btnEliminarDept.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarDept.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEliminarDept.setOpaque(true);
        btnEliminarDept.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarDeptMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarDeptMouseExited(evt);
            }
        });
        btnEliminarDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarDeptActionPerformed(evt);
            }
        });
        pnlOpcion1.add(btnEliminarDept, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 183, 116, 40));

        jSeparator16.setBackground(new java.awt.Color(51, 51, 51));
        pnlOpcion1.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 229, 116, 10));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Office_25px_1.png"))); // NOI18N
        pnlOpcion1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        pnlSDept.setViewportView(pnlOpcion1);

        menusPnl.add(pnlSDept, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 210, 120));

        pnlSDirEmp.setBackground(new java.awt.Color(153, 153, 153));

        pnlOpcion2.setBackground(new java.awt.Color(153, 153, 153));
        pnlOpcion2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator17.setBackground(new java.awt.Color(51, 51, 51));
        pnlOpcion2.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 105, 116, 10));

        btnAggDirEmp.setBackground(new java.awt.Color(153, 153, 153));
        btnAggDirEmp.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnAggDirEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton-mas (1).png"))); // NOI18N
        btnAggDirEmp.setText("Agregar");
        btnAggDirEmp.setBorder(null);
        btnAggDirEmp.setContentAreaFilled(false);
        btnAggDirEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAggDirEmp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAggDirEmp.setOpaque(true);
        btnAggDirEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAggDirEmpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAggDirEmpMouseExited(evt);
            }
        });
        btnAggDirEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAggDirEmpActionPerformed(evt);
            }
        });
        pnlOpcion2.add(btnAggDirEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 59, 116, 40));

        jSeparator18.setBackground(new java.awt.Color(51, 51, 51));
        pnlOpcion2.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 46, 116, 10));

        btnConsDirEmp.setBackground(new java.awt.Color(153, 153, 153));
        btnConsDirEmp.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnConsDirEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconmonstr-magnifier-11-24.png"))); // NOI18N
        btnConsDirEmp.setText("Consultar");
        btnConsDirEmp.setBorder(null);
        btnConsDirEmp.setContentAreaFilled(false);
        btnConsDirEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsDirEmp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnConsDirEmp.setOpaque(true);
        btnConsDirEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsDirEmpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConsDirEmpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConsDirEmpMouseExited(evt);
            }
        });
        btnConsDirEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsDirEmpActionPerformed(evt);
            }
        });
        pnlOpcion2.add(btnConsDirEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 0, 116, 40));

        jSeparator19.setBackground(new java.awt.Color(51, 51, 51));
        pnlOpcion2.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 167, 116, 10));

        btnModDirEmp.setBackground(new java.awt.Color(153, 153, 153));
        btnModDirEmp.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnModDirEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_edit_property_20px.png"))); // NOI18N
        btnModDirEmp.setText("Modificar");
        btnModDirEmp.setBorder(null);
        btnModDirEmp.setContentAreaFilled(false);
        btnModDirEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModDirEmp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnModDirEmp.setOpaque(true);
        btnModDirEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnModDirEmpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnModDirEmpMouseExited(evt);
            }
        });
        btnModDirEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModDirEmpActionPerformed(evt);
            }
        });
        pnlOpcion2.add(btnModDirEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 121, 116, 40));

        btnElimDirEmp.setBackground(new java.awt.Color(153, 153, 153));
        btnElimDirEmp.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnElimDirEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_delete_database_20px_1.png"))); // NOI18N
        btnElimDirEmp.setText("Eliminar");
        btnElimDirEmp.setBorder(null);
        btnElimDirEmp.setContentAreaFilled(false);
        btnElimDirEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnElimDirEmp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnElimDirEmp.setOpaque(true);
        btnElimDirEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnElimDirEmpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnElimDirEmpMouseExited(evt);
            }
        });
        btnElimDirEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimDirEmpActionPerformed(evt);
            }
        });
        pnlOpcion2.add(btnElimDirEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 183, 116, 40));

        jSeparator20.setBackground(new java.awt.Color(51, 51, 51));
        pnlOpcion2.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 229, 116, 10));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_address_25px.png"))); // NOI18N
        pnlOpcion2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        pnlSDirEmp.setViewportView(pnlOpcion2);

        menusPnl.add(pnlSDirEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 210, 120));

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

    private void btnAgregarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEmpActionPerformed
        ShowPanel(p2);
    }//GEN-LAST:event_btnAgregarEmpActionPerformed

    private void lblEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEmpMouseClicked
        if (pnlSEmp.isVisible()) {
            pnlSEmp.setVisible(false);
        }else{
            OcultarOptions();
            pnlSEmp.setVisible(true);
        }
    }//GEN-LAST:event_lblEmpMouseClicked

    private void menuEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuEmpMouseClicked
        if (pnlSEmp.isVisible()) {
            pnlSEmp.setVisible(false);
        }else{
            OcultarOptions();
            pnlSEmp.setVisible(true);
        }
    }//GEN-LAST:event_menuEmpMouseClicked

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

    private void pnlInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlInicioMouseClicked
        ShowPanel(p1);
    }//GEN-LAST:event_pnlInicioMouseClicked

    private void btnConsultarrEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarrEmpActionPerformed
        ShowPanel(p1);
    }//GEN-LAST:event_btnConsultarrEmpActionPerformed

    private void btnConsultarrEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarrEmpMouseClicked

    }//GEN-LAST:event_btnConsultarrEmpMouseClicked

    private void btnModificarrEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarrEmpActionPerformed
        ShowPanel(p3);
    }//GEN-LAST:event_btnModificarrEmpActionPerformed

    private void logoEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoEmpMouseClicked
        if (pnlSEmp.isVisible()) {
            pnlSEmp.setVisible(false);
        }else{
            OcultarOptions();
            pnlSEmp.setVisible(true);
        }
    }//GEN-LAST:event_logoEmpMouseClicked

    private void lblInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicioMouseClicked
        ShowPanel(pI);
    }//GEN-LAST:event_lblInicioMouseClicked

    private void logoInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoInicioMouseClicked
        ShowPanel(pI);
    }//GEN-LAST:event_logoInicioMouseClicked

    private void btnEliminarrEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarrEmpActionPerformed
        ShowPanel(p4);
    }//GEN-LAST:event_btnEliminarrEmpActionPerformed

    private void lblDeptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDeptMouseClicked
        if (pnlSDept.isVisible()) {
            pnlSDept.setVisible(false);
        }else{
            OcultarOptions();
            pnlSDept.setVisible(true);
        }
    }//GEN-LAST:event_lblDeptMouseClicked

    private void logoDeptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoDeptMouseClicked
        if (pnlSDept.isVisible()) {
            pnlSDept.setVisible(false);
        }else{
            OcultarOptions();
            pnlSDept.setVisible(true);
        }
    }//GEN-LAST:event_logoDeptMouseClicked

    private void menuDeptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuDeptMouseClicked
        if (pnlSDept.isVisible()) {
            pnlSDept.setVisible(false);
        }else{
            OcultarOptions();
            pnlSDept.setVisible(true);
        }
    }//GEN-LAST:event_menuDeptMouseClicked

    private void lblDirEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDirEmpMouseClicked
        if (pnlSDirEmp.isVisible()) {
            pnlSDirEmp.setVisible(false);
        }else{
            OcultarOptions();
            pnlSDirEmp.setVisible(true);
        }
    }//GEN-LAST:event_lblDirEmpMouseClicked

    private void logoDirEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoDirEmpMouseClicked
        if (pnlSDirEmp.isVisible()) {
            pnlSDirEmp.setVisible(false);
        }else{
            OcultarOptions();
            pnlSDirEmp.setVisible(true);
        }
    }//GEN-LAST:event_logoDirEmpMouseClicked

    private void menuDirEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuDirEmpMouseClicked
        if (pnlSDirEmp.isVisible()) {
            pnlSDirEmp.setVisible(false);
        }else{
            OcultarOptions();
            pnlSDirEmp.setVisible(true);
        }
    }//GEN-LAST:event_menuDirEmpMouseClicked

    private void btnAgregarDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarDeptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarDeptActionPerformed

    private void btnConsultarDeptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarDeptMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarDeptMouseClicked

    private void btnConsultarDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarDeptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarDeptActionPerformed

    private void btnModificarDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarDeptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarDeptActionPerformed

    private void btnEliminarDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDeptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarDeptActionPerformed

    private void btnAggDirEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAggDirEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAggDirEmpActionPerformed

    private void btnConsDirEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsDirEmpMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsDirEmpMouseClicked

    private void btnConsDirEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsDirEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsDirEmpActionPerformed

    private void btnModDirEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModDirEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModDirEmpActionPerformed

    private void btnElimDirEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimDirEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnElimDirEmpActionPerformed

    private void btnAgregarEmpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarEmpMouseEntered
        btnAgregarEmp.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_btnAgregarEmpMouseEntered

    private void btnAgregarEmpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarEmpMouseExited
        btnAgregarEmp.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_btnAgregarEmpMouseExited

    private void btnConsultarrEmpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarrEmpMouseEntered
        btnConsultarrEmp.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_btnConsultarrEmpMouseEntered

    private void btnConsultarrEmpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarrEmpMouseExited
        btnConsultarrEmp.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_btnConsultarrEmpMouseExited

    private void btnModificarrEmpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarrEmpMouseEntered
        btnModificarrEmp.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_btnModificarrEmpMouseEntered

    private void btnModificarrEmpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarrEmpMouseExited
        btnModificarrEmp.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_btnModificarrEmpMouseExited

    private void btnEliminarrEmpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarrEmpMouseEntered
        btnEliminarrEmp.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_btnEliminarrEmpMouseEntered

    private void btnEliminarrEmpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarrEmpMouseExited
        btnEliminarrEmp.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_btnEliminarrEmpMouseExited

    private void btnAgregarDeptMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarDeptMouseEntered
        btnAgregarDept.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_btnAgregarDeptMouseEntered

    private void btnAgregarDeptMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarDeptMouseExited
        btnAgregarDept.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_btnAgregarDeptMouseExited

    private void btnConsultarDeptMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarDeptMouseEntered
        btnConsultarDept.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_btnConsultarDeptMouseEntered

    private void btnConsultarDeptMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarDeptMouseExited
        btnConsultarDept.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_btnConsultarDeptMouseExited

    private void btnModificarDeptMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarDeptMouseEntered
        btnModificarDept.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_btnModificarDeptMouseEntered

    private void btnModificarDeptMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarDeptMouseExited
        btnModificarDept.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_btnModificarDeptMouseExited

    private void btnEliminarDeptMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarDeptMouseEntered
        btnEliminarDept.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_btnEliminarDeptMouseEntered

    private void btnEliminarDeptMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarDeptMouseExited
        btnEliminarDept.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_btnEliminarDeptMouseExited

    private void btnAggDirEmpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAggDirEmpMouseEntered
        btnAggDirEmp.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_btnAggDirEmpMouseEntered

    private void btnAggDirEmpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAggDirEmpMouseExited
        btnAggDirEmp.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_btnAggDirEmpMouseExited

    private void btnConsDirEmpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsDirEmpMouseEntered
        btnConsDirEmp.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_btnConsDirEmpMouseEntered

    private void btnConsDirEmpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsDirEmpMouseExited
        btnConsDirEmp.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_btnConsDirEmpMouseExited

    private void btnModDirEmpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModDirEmpMouseEntered
        btnModDirEmp.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_btnModDirEmpMouseEntered

    private void btnModDirEmpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModDirEmpMouseExited
        btnModDirEmp.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_btnModDirEmpMouseExited

    private void btnElimDirEmpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnElimDirEmpMouseEntered
        btnElimDirEmp.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_btnElimDirEmpMouseEntered

    private void btnElimDirEmpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnElimDirEmpMouseExited
        btnElimDirEmp.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_btnElimDirEmpMouseExited

    private void ShowPanel(JPanel p){
        p.setSize(540, 480);
        p.setLocation(0, 0);
        
        pnlContent.removeAll();
        pnlContent.add(p, BorderLayout.CENTER);
        pnlContent.revalidate();
        pnlContent.repaint();
    }
    
    private void OcultarOptions () {
        pnlSEmp.setVisible(false);
        pnlSDept.setVisible(false);
        pnlSDirEmp.setVisible(false);
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
            java.util.logging.Logger.getLogger(GerenteRH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenteRH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenteRH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenteRH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new GerenteRH().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnAggDirEmp;
    private javax.swing.JButton btnAgregarDept;
    private javax.swing.JButton btnAgregarEmp;
    private javax.swing.JButton btnConsDirEmp;
    private javax.swing.JButton btnConsultarDept;
    private javax.swing.JButton btnConsultarrEmp;
    private javax.swing.JButton btnElimDirEmp;
    private javax.swing.JButton btnEliminarDept;
    private javax.swing.JButton btnEliminarrEmp;
    private javax.swing.JButton btnModDirEmp;
    private javax.swing.JButton btnModificarDept;
    private javax.swing.JButton btnModificarrEmp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblBtnCerrar;
    private javax.swing.JLabel lblDept;
    private javax.swing.JLabel lblDirEmp;
    private javax.swing.JLabel lblEmp;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblPacif;
    private javax.swing.JLabel logoDept;
    private javax.swing.JLabel logoDirEmp;
    private javax.swing.JLabel logoEmp;
    private javax.swing.JLabel logoHonda;
    private javax.swing.JLabel logoInicio;
    private javax.swing.JPanel menuDept;
    private javax.swing.JPanel menuDirEmp;
    private javax.swing.JPanel menuEmp;
    private javax.swing.JPanel menusPnl;
    private javax.swing.JPanel pnlCerrar;
    private javax.swing.JPanel pnlColorCerrar;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JPanel pnlInicio;
    private javax.swing.JPanel pnlOpcion;
    private javax.swing.JPanel pnlOpcion1;
    private javax.swing.JPanel pnlOpcion2;
    private javax.swing.JScrollPane pnlSDept;
    private javax.swing.JScrollPane pnlSDirEmp;
    private javax.swing.JScrollPane pnlSEmp;
    // End of variables declaration//GEN-END:variables

}
