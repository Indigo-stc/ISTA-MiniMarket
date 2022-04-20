package vista;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Factura extends javax.swing.JPanel {

    public Factura() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlgPersona = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtBuscarPersoD = new javax.swing.JTextField();
        btnActualizar1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPersonas2 = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        blEstado1 = new javax.swing.JLabel();
        btnAgregarPersoD = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        xd = new javax.swing.JPanel();
        panelfactura = new javax.swing.JPanel();
        panelarriba = new javax.swing.JPanel();
        lblvrfnombre = new javax.swing.JLabel();
        lblfechaV = new javax.swing.JLabel();
        lblfecha = new javax.swing.JLabel();
        Titulo_factura = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblvrfTelefono = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblvrfcedula = new javax.swing.JLabel();
        txt_cedula = new javax.swing.JTextField();
        txt_nombres = new javax.swing.JTextField();
        lblvrfapellido = new javax.swing.JLabel();
        txt_apellidos = new javax.swing.JTextField();
        panelabajo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_factura = new javax.swing.JTable();
        btn_imprimir = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_quitar = new javax.swing.JButton();
        btn_agregar = new javax.swing.JButton();
        spinnetcant = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        tituloProductos = new javax.swing.JLabel();
        txt_idproducto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_total = new javax.swing.JTextField();
        txt_iva = new javax.swing.JTextField();
        txt_subtotal = new javax.swing.JTextField();

        jLabel11.setText("Buscar");

        btnActualizar1.setText("Actualizar");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBuscarPersoD, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnActualizar1)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarPersoD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(btnActualizar1))
                .addContainerGap())
        );

        tblPersonas2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Persona", "Nombres", "Apellidos", "Telefono", "Sexo", "Foto"
            }
        ));
        jScrollPane3.setViewportView(tblPersonas2);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setText("Seleccione un cliente");

        blEstado1.setText("XDXD");

        btnAgregarPersoD.setText("Agregar");

        javax.swing.GroupLayout dlgPersonaLayout = new javax.swing.GroupLayout(dlgPersona.getContentPane());
        dlgPersona.getContentPane().setLayout(dlgPersonaLayout);
        dlgPersonaLayout.setHorizontalGroup(
            dlgPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(blEstado1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(dlgPersonaLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(dlgPersonaLayout.createSequentialGroup()
                .addGroup(dlgPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgPersonaLayout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jLabel15))
                    .addGroup(dlgPersonaLayout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(btnAgregarPersoD)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dlgPersonaLayout.setVerticalGroup(
            dlgPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgPersonaLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btnAgregarPersoD)
                .addGap(5, 5, 5)
                .addComponent(blEstado1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(153, 51, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        xd.setBackground(new java.awt.Color(153, 51, 255));
        xd.setLayout(new java.awt.CardLayout());

        panelfactura.setBackground(new java.awt.Color(153, 51, 255));
        panelfactura.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelarriba.setBackground(new java.awt.Color(255, 102, 51));
        panelarriba.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelarriba.add(lblvrfnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 170, 30));

        lblfechaV.setText(" ");
        panelarriba.add(lblfechaV, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, 200, 30));

        lblfecha.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblfecha.setForeground(new java.awt.Color(0, 0, 0));
        lblfecha.setText("FECHA:");
        panelarriba.add(lblfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 70, 30));

        Titulo_factura.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Titulo_factura.setForeground(new java.awt.Color(0, 0, 0));
        Titulo_factura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo_factura.setText("FACTURACIÓN");
        panelarriba.add(Titulo_factura, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 209, 40));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("DATOS CLIENTE");
        panelarriba.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 140, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("TELÉFONO");
        panelarriba.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 100, 90, -1));
        panelarriba.add(lblvrfTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 160, 170, 30));

        txt_telefono.setBackground(new java.awt.Color(255, 255, 255));
        txt_telefono.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        panelarriba.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 130, 190, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("APELLIDOS");
        panelarriba.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 90, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("NOMBRES");
        panelarriba.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 80, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("CÉDULA");
        panelarriba.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 70, 24));
        panelarriba.add(lblvrfcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 170, 30));

        txt_cedula.setBackground(new java.awt.Color(255, 255, 255));
        txt_cedula.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        panelarriba.add(txt_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 190, -1));

        txt_nombres.setBackground(new java.awt.Color(255, 255, 255));
        txt_nombres.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        panelarriba.add(txt_nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 180, -1));
        panelarriba.add(lblvrfapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, 160, 30));

        txt_apellidos.setBackground(new java.awt.Color(255, 255, 255));
        txt_apellidos.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        txt_apellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidosActionPerformed(evt);
            }
        });
        panelarriba.add(txt_apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 180, -1));

        panelfactura.add(panelarriba, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 1080, 210));

        panelabajo.setBackground(new java.awt.Color(255, 204, 51));
        panelabajo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_factura.setBackground(new java.awt.Color(255, 255, 255));
        tbl_factura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Cantidad", "Precio"
            }
        ));
        jScrollPane1.setViewportView(tbl_factura);

        panelabajo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 570, 143));

        btn_imprimir.setBackground(new java.awt.Color(255, 255, 255));
        btn_imprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/imprimir.png"))); // NOI18N
        btn_imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imprimirActionPerformed(evt);
            }
        });
        panelabajo.add(btn_imprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 90, -1));

        btn_cancelar.setBackground(new java.awt.Color(255, 255, 255));
        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/cancelar.png"))); // NOI18N
        panelabajo.add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, 80, -1));

        btn_quitar.setBackground(new java.awt.Color(255, 255, 255));
        btn_quitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/signo-menos.png"))); // NOI18N
        btn_quitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_quitarActionPerformed(evt);
            }
        });
        panelabajo.add(btn_quitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, 30, 30));

        btn_agregar.setBackground(new java.awt.Color(255, 255, 255));
        btn_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/mas (3).png"))); // NOI18N
        panelabajo.add(btn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, 40, 40));
        panelabajo.add(spinnetcant, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 70, 60, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("CANTIDAD");
        panelabajo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, 80, 30));

        tituloProductos.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tituloProductos.setForeground(new java.awt.Color(0, 0, 0));
        tituloProductos.setText("PRODUCTOS");
        panelabajo.add(tituloProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 110, 26));

        txt_idproducto.setBackground(new java.awt.Color(255, 255, 255));
        txt_idproducto.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        panelabajo.add(txt_idproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 420, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/search.png"))); // NOI18N
        jLabel2.setText("ID PRODUCTO");
        panelabajo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 140, 40));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("SUB TOTAL");
        panelabajo.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 130, 90, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("IVA 12%");
        panelabajo.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 180, -1, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("TOTAL");
        panelabajo.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 250, 90, -1));

        txt_total.setBackground(new java.awt.Color(255, 255, 255));
        txt_total.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_total.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        txt_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_totalActionPerformed(evt);
            }
        });
        panelabajo.add(txt_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 230, 180, 60));

        txt_iva.setBackground(new java.awt.Color(255, 255, 255));
        txt_iva.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txt_iva.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        panelabajo.add(txt_iva, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 170, 180, 40));

        txt_subtotal.setBackground(new java.awt.Color(255, 255, 255));
        txt_subtotal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_subtotal.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        txt_subtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_subtotalActionPerformed(evt);
            }
        });
        panelabajo.add(txt_subtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 120, 180, 30));

        panelfactura.add(panelabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 1080, 320));

        xd.add(panelfactura, "card4");

        add(xd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1130, 590));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_quitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_quitarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_quitarActionPerformed

    private void btn_imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imprimirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_imprimirActionPerformed

    private void txt_subtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_subtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_subtotalActionPerformed

    private void txt_apellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidosActionPerformed

    private void txt_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_totalActionPerformed

    public JLabel getBlEstado1() {
        return blEstado1;
    }

    public void setBlEstado1(JLabel blEstado1) {
        this.blEstado1 = blEstado1;
    }

    public JButton getBtnActualizar1() {
        return btnActualizar1;
    }

    public void setBtnActualizar1(JButton btnActualizar1) {
        this.btnActualizar1 = btnActualizar1;
    }

    public JButton getBtnAgregarPersoD() {
        return btnAgregarPersoD;
    }

    public void setBtnAgregarPersoD(JButton btnAgregarPersoD) {
        this.btnAgregarPersoD = btnAgregarPersoD;
    }

    public JButton getBtn_agregar() {
        return btn_agregar;
    }

    public void setBtn_agregar(JButton btn_agregar) {
        this.btn_agregar = btn_agregar;
    }

    public JButton getBtn_cancelar() {
        return btn_cancelar;
    }

    public void setBtn_cancelar(JButton btn_cancelar) {
        this.btn_cancelar = btn_cancelar;
    }


    public JButton getBtn_imprimir() {
        return btn_imprimir;
    }

    public void setBtn_imprimir(JButton btn_imprimir) {
        this.btn_imprimir = btn_imprimir;
    }

    public JButton getBtn_quitar() {
        return btn_quitar;
    }

    public void setBtn_quitar(JButton btn_quitar) {
        this.btn_quitar = btn_quitar;
    }

    public JDialog getDlgPersona() {
        return dlgPersona;
    }

    public void setDlgPersona(JDialog dlgPersona) {
        this.dlgPersona = dlgPersona;
    }


    public JLabel getLblfecha() {
        return lblfecha;
    }

    public void setLblfecha(JLabel lblfecha) {
        this.lblfecha = lblfecha;
    }

    public JLabel getLblfechaV() {
        return lblfechaV;
    }

    public void setLblfechaV(JLabel lblfechaV) {
        this.lblfechaV = lblfechaV;
    }

    public JTable getTblPersonas2() {
        return tblPersonas2;
    }

    public void setTblPersonas2(JTable tblPersonas2) {
        this.tblPersonas2 = tblPersonas2;
    }

    public JTable getTbl_factura() {
        return tbl_factura;
    }

    public void setTbl_factura(JTable tbl_factura) {
        this.tbl_factura = tbl_factura;
    }

    public JTextField getTxtBuscarPersoD() {
        return txtBuscarPersoD;
    }

    public void setTxtBuscarPersoD(JTextField txtBuscarPersoD) {
        this.txtBuscarPersoD = txtBuscarPersoD;
    }

    public JTextField getTxt_apellidos() {
        return txt_apellidos;
    }

    public void setTxt_apellidos(JTextField txt_apellidos) {
        this.txt_apellidos = txt_apellidos;
    }

    public JTextField getTxt_buscar() {
        return txt_idproducto;
    }

    public void setTxt_buscar(JTextField txt_buscar) {
        this.txt_idproducto = txt_buscar;
    }

    public JTextField getTxt_cedula() {
        return txt_cedula;
    }

    public void setTxt_cedula(JTextField txt_cedula) {
        this.txt_cedula = txt_cedula;
    }


    public JTextField getTxt_iva() {
        return txt_iva;
    }

    public void setTxt_iva(JTextField txt_iva) {
        this.txt_iva = txt_iva;
    }

    public JTextField getTxt_nombres() {
        return txt_nombres;
    }

    public void setTxt_nombres(JTextField txt_nombres) {
        this.txt_nombres = txt_nombres;
    }

    public JTextField getTxt_subtotal() {
        return txt_subtotal;
    }

    public void setTxt_subtotal(JTextField txt_subtotal) {
        this.txt_subtotal = txt_subtotal;
    }

    public JTextField getTxt_telefono() {
        return txt_telefono;
    }

    public void setTxt_telefono(JTextField txt_telefono) {
        this.txt_telefono = txt_telefono;
    }

    public JTextField getTxt_total() {
        return txt_total;
    }

    public void setTxt_total(JTextField txt_total) {
        this.txt_total = txt_total;
    }

  
    public JSpinner getSpinnetcant() {
        return spinnetcant;
    }

    public void setSpinnetcant(JSpinner spinnetcant) {
        this.spinnetcant = spinnetcant;
    }


    

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo_factura;
    private javax.swing.JLabel blEstado1;
    private javax.swing.JButton btnActualizar1;
    private javax.swing.JButton btnAgregarPersoD;
    public javax.swing.JButton btn_agregar;
    public javax.swing.JButton btn_cancelar;
    public javax.swing.JButton btn_imprimir;
    public javax.swing.JButton btn_quitar;
    private javax.swing.JDialog dlgPersona;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblfecha;
    public javax.swing.JLabel lblfechaV;
    public javax.swing.JLabel lblvrfTelefono;
    public javax.swing.JLabel lblvrfapellido;
    public javax.swing.JLabel lblvrfcedula;
    public javax.swing.JLabel lblvrfnombre;
    private javax.swing.JPanel panelabajo;
    private javax.swing.JPanel panelarriba;
    public javax.swing.JPanel panelfactura;
    public javax.swing.JSpinner spinnetcant;
    private javax.swing.JTable tblPersonas2;
    public javax.swing.JTable tbl_factura;
    private javax.swing.JLabel tituloProductos;
    private javax.swing.JTextField txtBuscarPersoD;
    public javax.swing.JTextField txt_apellidos;
    public javax.swing.JTextField txt_cedula;
    public javax.swing.JTextField txt_idproducto;
    public javax.swing.JTextField txt_iva;
    public javax.swing.JTextField txt_nombres;
    public javax.swing.JTextField txt_subtotal;
    public javax.swing.JTextField txt_telefono;
    public javax.swing.JTextField txt_total;
    public javax.swing.JPanel xd;
    // End of variables declaration//GEN-END:variables
}
