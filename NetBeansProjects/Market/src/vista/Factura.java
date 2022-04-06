package vista;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
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
        Titulo_fac = new javax.swing.JPanel();
        Titulo_factura = new javax.swing.JLabel();
        lblnumfac = new javax.swing.JLabel();
        lblfecha = new javax.swing.JLabel();
        lblnumfacV = new javax.swing.JLabel();
        lblfechaV = new javax.swing.JLabel();
        Datos_productos = new javax.swing.JPanel();
        tituloProductos = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();
        txt_idproducto = new javax.swing.JTextField();
        txt_producto = new javax.swing.JTextField();
        txt_precio = new javax.swing.JTextField();
        spinnetcant = new javax.swing.JSpinner();
        btn_agregar = new javax.swing.JButton();
        btn_quitar = new javax.swing.JButton();
        panelproductos = new javax.swing.JPanel();
        pro1 = new javax.swing.JButton();
        pro2 = new javax.swing.JButton();
        pro3 = new javax.swing.JButton();
        pro4 = new javax.swing.JButton();
        pro5 = new javax.swing.JButton();
        pro6 = new javax.swing.JButton();
        pro7 = new javax.swing.JButton();
        pro8 = new javax.swing.JButton();
        CantidadProductos = new javax.swing.JLabel();
        Datos_cliente = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lbl_foto = new javax.swing.JLabel();
        txt_cedula = new javax.swing.JTextField();
        txt_nombres = new javax.swing.JTextField();
        txt_apellidos = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_subtotal = new javax.swing.JTextField();
        txt_total = new javax.swing.JTextField();
        txt_iva = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_imprimir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_factura = new javax.swing.JTable();
        btnConsumidorF = new javax.swing.JButton();

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

        Titulo_factura.setText("FACTURA");

        lblnumfac.setText("N° FACT:");

        lblfecha.setText("FECHA:");

        lblfechaV.setText(" ");

        javax.swing.GroupLayout Titulo_facLayout = new javax.swing.GroupLayout(Titulo_fac);
        Titulo_fac.setLayout(Titulo_facLayout);
        Titulo_facLayout.setHorizontalGroup(
            Titulo_facLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Titulo_facLayout.createSequentialGroup()
                .addGroup(Titulo_facLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Titulo_facLayout.createSequentialGroup()
                        .addGap(378, 378, 378)
                        .addComponent(Titulo_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblnumfac, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Titulo_facLayout.createSequentialGroup()
                        .addGap(560, 560, 560)
                        .addComponent(lblfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Titulo_facLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblfechaV, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblnumfacV, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(256, Short.MAX_VALUE))
        );
        Titulo_facLayout.setVerticalGroup(
            Titulo_facLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Titulo_facLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Titulo_facLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Titulo_facLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblnumfacV, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Titulo_facLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Titulo_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblnumfac, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(Titulo_facLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblfechaV, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Datos_productos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloProductos.setText("Productos");
        Datos_productos.add(tituloProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 69, 26));

        jLabel2.setText("Buscar:");
        Datos_productos.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 62, 25));

        jLabel3.setText("ID_Producto:");
        Datos_productos.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, 30));

        jLabel4.setText("Producto:");
        Datos_productos.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 71, 24));

        jLabel5.setText("Cantidad:");
        Datos_productos.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));
        Datos_productos.add(txt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 97, -1));
        Datos_productos.add(txt_idproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 89, -1));
        Datos_productos.add(txt_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 124, -1));
        Datos_productos.add(txt_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 55, -1));
        Datos_productos.add(spinnetcant, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, -1, -1));

        btn_agregar.setText("Agregar");
        Datos_productos.add(btn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 90, 30));

        btn_quitar.setText("Cancelar");
        btn_quitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_quitarActionPerformed(evt);
            }
        });
        Datos_productos.add(btn_quitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 90, 30));

        panelproductos.setBackground(new java.awt.Color(235, 235, 246));

        pro1.setBorder(null);
        pro1.setContentAreaFilled(false);

        pro2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pro2.setContentAreaFilled(false);

        pro3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pro3.setContentAreaFilled(false);

        pro4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pro4.setContentAreaFilled(false);

        pro5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pro5.setContentAreaFilled(false);

        pro6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pro6.setContentAreaFilled(false);

        pro7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pro7.setContentAreaFilled(false);

        pro8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pro8.setContentAreaFilled(false);

        javax.swing.GroupLayout panelproductosLayout = new javax.swing.GroupLayout(panelproductos);
        panelproductos.setLayout(panelproductosLayout);
        panelproductosLayout.setHorizontalGroup(
            panelproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelproductosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelproductosLayout.createSequentialGroup()
                        .addComponent(pro1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pro2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pro3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pro4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelproductosLayout.createSequentialGroup()
                        .addComponent(pro5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pro6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pro7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pro8, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelproductosLayout.setVerticalGroup(
            panelproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelproductosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pro1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pro2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pro3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pro4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pro5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pro6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pro7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pro8, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Datos_productos.add(panelproductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));
        Datos_productos.add(CantidadProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 90, 30));

        Datos_cliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("Datos Cliente");
        Datos_cliente.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 6, -1, -1));

        jLabel7.setText("Cedula:");
        Datos_cliente.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 53, 24));

        jLabel8.setText("Nombres:");
        Datos_cliente.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel9.setText("Apellidos:");
        Datos_cliente.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel10.setText("Telefono:");
        Datos_cliente.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel12.setText("Sub Total:");
        Datos_cliente.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 377, -1, -1));

        jLabel13.setText("IVA 12%:");
        Datos_cliente.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 407, -1, -1));

        jLabel14.setText("TOTAL:");
        Datos_cliente.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 431, -1, -1));
        Datos_cliente.add(lbl_foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 111, 117));
        Datos_cliente.add(txt_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 124, -1));
        Datos_cliente.add(txt_nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 123, -1));

        txt_apellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidosActionPerformed(evt);
            }
        });
        Datos_cliente.add(txt_apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 123, -1));
        Datos_cliente.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 120, -1));

        txt_subtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_subtotalActionPerformed(evt);
            }
        });
        Datos_cliente.add(txt_subtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 373, 122, -1));
        Datos_cliente.add(txt_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 427, 122, -1));
        Datos_cliente.add(txt_iva, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 403, 122, -1));

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        Datos_cliente.add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 38, -1, -1));

        btn_guardar.setText("Guardar");
        Datos_cliente.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 373, 80, -1));

        btn_cancelar.setText("Cancelar");
        Datos_cliente.add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 403, -1, -1));

        btn_imprimir.setText("Imprimir");
        btn_imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imprimirActionPerformed(evt);
            }
        });
        Datos_cliente.add(btn_imprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 80, -1));

        tbl_factura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Cantidad", "Precio"
            }
        ));
        jScrollPane1.setViewportView(tbl_factura);

        Datos_cliente.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 381, 143));

        btnConsumidorF.setText("Consumidor Final");
        Datos_cliente.add(btnConsumidorF, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(Datos_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Datos_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo_fac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo_fac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Datos_productos, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                    .addComponent(Datos_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_quitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_quitarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_quitarActionPerformed

    private void txt_apellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidosActionPerformed

    private void txt_subtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_subtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_subtotalActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imprimirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_imprimirActionPerformed

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

    public JButton getBtn_buscar() {
        return btn_buscar;
    }

    public void setBtn_buscar(JButton btn_buscar) {
        this.btn_buscar = btn_buscar;
    }

    public JButton getBtn_cancelar() {
        return btn_cancelar;
    }

    public void setBtn_cancelar(JButton btn_cancelar) {
        this.btn_cancelar = btn_cancelar;
    }

    public JButton getBtn_guardar() {
        return btn_guardar;
    }

    public void setBtn_guardar(JButton btn_guardar) {
        this.btn_guardar = btn_guardar;
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

    public JLabel getLbl_foto() {
        return lbl_foto;
    }

    public void setLbl_foto(JLabel lbl_foto) {
        this.lbl_foto = lbl_foto;
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

    public JButton getPro1() {
        return pro1;
    }

    public void setPro1(JButton pro1) {
        this.pro1 = pro1;
    }

    public JButton getPro2() {
        return pro2;
    }

    public void setPro2(JButton pro2) {
        this.pro2 = pro2;
    }

    public JButton getPro3() {
        return pro3;
    }

    public void setPro3(JButton pro3) {
        this.pro3 = pro3;
    }

    public JButton getPro4() {
        return pro4;
    }

    public void setPro4(JButton pro4) {
        this.pro4 = pro4;
    }

    public JButton getPro5() {
        return pro5;
    }

    public void setPro5(JButton pro5) {
        this.pro5 = pro5;
    }

    public JButton getPro6() {
        return pro6;
    }

    public void setPro6(JButton pro6) {
        this.pro6 = pro6;
    }

    public JButton getPro7() {
        return pro7;
    }

    public void setPro7(JButton pro7) {
        this.pro7 = pro7;
    }

    public JButton getPro8() {
        return pro8;
    }

    public void setPro8(JButton pro8) {
        this.pro8 = pro8;
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
        return txt_buscar;
    }

    public void setTxt_buscar(JTextField txt_buscar) {
        this.txt_buscar = txt_buscar;
    }

    public JTextField getTxt_cedula() {
        return txt_cedula;
    }

    public void setTxt_cedula(JTextField txt_cedula) {
        this.txt_cedula = txt_cedula;
    }

    public JTextField getTxt_idproducto() {
        return txt_idproducto;
    }

    public void setTxt_idproducto(JTextField txt_idproducto) {
        this.txt_idproducto = txt_idproducto;
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

    public JTextField getTxt_precio() {
        return txt_precio;
    }

    public void setTxt_precio(JTextField txt_precio) {
        this.txt_precio = txt_precio;
    }

    public JTextField getTxt_producto() {
        return txt_producto;
    }

    public void setTxt_producto(JTextField txt_producto) {
        this.txt_producto = txt_producto;
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

    public JLabel getCantidadProductos() {
        return CantidadProductos;
    }

    public void setCantidadProductos(JLabel CantidadProductos) {
        this.CantidadProductos = CantidadProductos;
    }

    

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CantidadProductos;
    private javax.swing.JPanel Datos_cliente;
    private javax.swing.JPanel Datos_productos;
    private javax.swing.JPanel Titulo_fac;
    private javax.swing.JLabel Titulo_factura;
    private javax.swing.JLabel blEstado1;
    private javax.swing.JButton btnActualizar1;
    private javax.swing.JButton btnAgregarPersoD;
    private javax.swing.JButton btnConsumidorF;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_imprimir;
    private javax.swing.JButton btn_quitar;
    private javax.swing.JDialog dlgPersona;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbl_foto;
    private javax.swing.JLabel lblfecha;
    private javax.swing.JLabel lblfechaV;
    private javax.swing.JLabel lblnumfac;
    private javax.swing.JLabel lblnumfacV;
    private javax.swing.JPanel panelproductos;
    private javax.swing.JButton pro1;
    private javax.swing.JButton pro2;
    private javax.swing.JButton pro3;
    private javax.swing.JButton pro4;
    private javax.swing.JButton pro5;
    private javax.swing.JButton pro6;
    private javax.swing.JButton pro7;
    private javax.swing.JButton pro8;
    private javax.swing.JSpinner spinnetcant;
    private javax.swing.JTable tblPersonas2;
    private javax.swing.JTable tbl_factura;
    private javax.swing.JLabel tituloProductos;
    private javax.swing.JTextField txtBuscarPersoD;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_idproducto;
    private javax.swing.JTextField txt_iva;
    private javax.swing.JTextField txt_nombres;
    private javax.swing.JTextField txt_precio;
    private javax.swing.JTextField txt_producto;
    private javax.swing.JTextField txt_subtotal;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables
}
