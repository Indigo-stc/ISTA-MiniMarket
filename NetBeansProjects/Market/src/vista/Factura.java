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
        jPanel1 = new javax.swing.JPanel();
        Titulo_factura = new javax.swing.JLabel();
        lblfechaV = new javax.swing.JLabel();
        lblfecha = new javax.swing.JLabel();
        lblnumfac = new javax.swing.JLabel();
        lblnumfacV = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnConsumidorF = new javax.swing.JButton();
        txt_telefono = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_apellidos = new javax.swing.JTextField();
        txt_nombres = new javax.swing.JTextField();
        txt_cedula = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblvrfTelefono = new javax.swing.JLabel();
        lblvrfcedula = new javax.swing.JLabel();
        lblvrfnombre = new javax.swing.JLabel();
        lblvrfapellido = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        tituloProductos = new javax.swing.JLabel();
        txt_idproducto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        spinnetcant = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_factura = new javax.swing.JTable();
        btn_imprimir = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_subtotal = new javax.swing.JTextField();
        txt_iva = new javax.swing.JTextField();
        txt_total = new javax.swing.JTextField();
        btn_quitar = new javax.swing.JButton();
        btn_agregar = new javax.swing.JButton();

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

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo_factura.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Titulo_factura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo_factura.setText("JACKS");

        lblfechaV.setText(" ");

        lblfecha.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblfecha.setText("FECHA:");

        lblnumfac.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblnumfac.setText("N° FACT:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lblnumfac, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblnumfacV, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(Titulo_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblfechaV, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Titulo_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblnumfacV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblfechaV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblnumfac, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 970, 80));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnConsumidorF.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnConsumidorF.setText("Consumidor Final");
        btnConsumidorF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsumidorFActionPerformed(evt);
            }
        });
        jPanel2.add(btnConsumidorF, new org.netbeans.lib.awtextra.AbsoluteConstraints(794, 63, 167, 40));
        jPanel2.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 79, 190, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setText("Telefono:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(646, 49, -1, -1));

        txt_apellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidosActionPerformed(evt);
            }
        });
        jPanel2.add(txt_apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 79, 180, -1));
        jPanel2.add(txt_nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 79, 180, -1));
        jPanel2.add(txt_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 79, 190, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("Cedula:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 49, 53, 24));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText("Nombres:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 49, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setText("Apellidos:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 49, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Datos Cliente");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 18, 140, -1));
        jPanel2.add(lblvrfTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 170, 30));
        jPanel2.add(lblvrfcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 170, 30));
        jPanel2.add(lblvrfnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 170, 30));
        jPanel2.add(lblvrfapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 160, 30));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 980, 150));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloProductos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tituloProductos.setText("Productos");
        jPanel3.add(tituloProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 0, 110, 26));
        jPanel3.add(txt_idproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 52, 360, -1));

        jLabel2.setText("ID Producto");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 52, 70, 25));

        jLabel5.setText("Cantidad:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 52, 70, 30));
        jPanel3.add(spinnetcant, new org.netbeans.lib.awtextra.AbsoluteConstraints(695, 52, 60, 30));

        tbl_factura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Cantidad", "Precio"
            }
        ));
        jScrollPane1.setViewportView(tbl_factura);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 100, 570, 143));

        btn_imprimir.setText("Imprimir");
        btn_imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imprimirActionPerformed(evt);
            }
        });
        jPanel3.add(btn_imprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 275, 110, 40));

        btn_cancelar.setText("Cancelar");
        jPanel3.add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 275, 110, 40));

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel14.setText("TOTAL:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(709, 203, -1, -1));

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel13.setText("IVA 12%:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(709, 143, -1, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel12.setText("Sub Total:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(709, 93, 90, -1));

        txt_subtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_subtotalActionPerformed(evt);
            }
        });
        jPanel3.add(txt_subtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(799, 93, 180, -1));
        jPanel3.add(txt_iva, new org.netbeans.lib.awtextra.AbsoluteConstraints(799, 133, 180, 40));

        txt_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_totalActionPerformed(evt);
            }
        });
        jPanel3.add(txt_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(799, 193, 180, 50));

        btn_quitar.setText("-");
        btn_quitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_quitarActionPerformed(evt);
            }
        });
        jPanel3.add(btn_quitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, 90, 40));

        btn_agregar.setText("+");
        jPanel3.add(btn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 127, 90, 40));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 1000, 340));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_quitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_quitarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_quitarActionPerformed

    private void btnConsumidorFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsumidorFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsumidorFActionPerformed

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

    public JLabel getLblnumfac() {
        return lblnumfac;
    }

    public void setLblnumfac(JLabel lblnumfac) {
        this.lblnumfac = lblnumfac;
    }

    public JLabel getLblnumfacV() {
        return lblnumfacV;
    }

    public void setLblnumfacV(JLabel lblnumfacV) {
        this.lblnumfacV = lblnumfacV;
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

    public JButton getBtnConsumidorF() {
        return btnConsumidorF;
    }

    public void setBtnConsumidorF(JButton btnConsumidorF) {
        this.btnConsumidorF = btnConsumidorF;
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
    public javax.swing.JButton btnConsumidorF;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblfecha;
    public javax.swing.JLabel lblfechaV;
    private javax.swing.JLabel lblnumfac;
    public javax.swing.JLabel lblnumfacV;
    public javax.swing.JLabel lblvrfTelefono;
    public javax.swing.JLabel lblvrfapellido;
    public javax.swing.JLabel lblvrfcedula;
    public javax.swing.JLabel lblvrfnombre;
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
    // End of variables declaration//GEN-END:variables
}
