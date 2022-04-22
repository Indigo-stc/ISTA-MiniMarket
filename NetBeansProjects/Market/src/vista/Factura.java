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
        xD = new javax.swing.JPanel();
        Panel = new javax.swing.JPanel();
        panelarriba = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblvrfcedula = new javax.swing.JLabel();
        txt_cedula = new javax.swing.JTextField();
        txt_nombres = new javax.swing.JTextField();
        btn_imprimir = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        panelabajo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_factura = new javax.swing.JTable();
        btn_quitar = new javax.swing.JButton();
        btn_agregar = new javax.swing.JButton();
        spinnetcant = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        tituloProductos = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_total = new javax.swing.JTextField();
        txt_iva = new javax.swing.JTextField();
        txt_subtotal = new javax.swing.JTextField();
        txt_idproducto = new javax.swing.JTextField();
        Titulo_factura = new javax.swing.JLabel();
        lblfechaV = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

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
        setPreferredSize(new java.awt.Dimension(1090, 730));

        xD.setLayout(new java.awt.CardLayout());

        Panel.setBackground(new java.awt.Color(255, 255, 255));
        Panel.setPreferredSize(new java.awt.Dimension(1090, 730));

        panelarriba.setBackground(new java.awt.Color(246, 246, 246));

        jLabel6.setFont(new java.awt.Font("Roboto Light", 1, 17)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("DATOS DE CLIENTE");

        jLabel10.setFont(new java.awt.Font("Roboto Light", 1, 17)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Teléfono");

        txt_telefono.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Roboto Light", 1, 17)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Nombres");

        jLabel7.setFont(new java.awt.Font("Roboto Light", 1, 17)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Cédula");

        txt_cedula.setBackground(new java.awt.Color(255, 255, 255));

        txt_nombres.setBackground(new java.awt.Color(255, 255, 255));

        btn_imprimir.setBackground(new java.awt.Color(255, 255, 255));
        btn_imprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/imprimir.png"))); // NOI18N

        btn_cancelar.setBackground(new java.awt.Color(255, 255, 255));
        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/cancelar.png"))); // NOI18N

        javax.swing.GroupLayout panelarribaLayout = new javax.swing.GroupLayout(panelarriba);
        panelarriba.setLayout(panelarribaLayout);
        panelarribaLayout.setHorizontalGroup(
            panelarribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelarribaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelarribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_nombres)
                    .addGroup(panelarribaLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblvrfcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87)
                .addGroup(panelarribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(panelarribaLayout.createSequentialGroup()
                        .addGroup(panelarribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(175, 175, 175)
                        .addGroup(panelarribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_imprimir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(169, 169, 169))
        );
        panelarribaLayout.setVerticalGroup(
            panelarribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelarribaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(panelarribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelarribaLayout.createSequentialGroup()
                        .addGroup(panelarribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblvrfcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelarribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelarribaLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(btn_imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelarribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelarribaLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(12, 12, 12)
                        .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        panelabajo.setBackground(new java.awt.Color(246, 246, 246));

        tbl_factura.setBackground(new java.awt.Color(255, 255, 255));
        tbl_factura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Cantidad", "Precio"
            }
        ));
        jScrollPane1.setViewportView(tbl_factura);

        btn_quitar.setBackground(new java.awt.Color(255, 255, 255));
        btn_quitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/signo-menos.png"))); // NOI18N

        btn_agregar.setBackground(new java.awt.Color(255, 255, 255));
        btn_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/mas (3).png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Roboto Light", 1, 17)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Cantidad");

        tituloProductos.setFont(new java.awt.Font("Roboto Light", 1, 17)); // NOI18N
        tituloProductos.setForeground(new java.awt.Color(0, 0, 0));
        tituloProductos.setText("PRODUCTOS");

        jLabel2.setFont(new java.awt.Font("Roboto Light", 1, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/search.png"))); // NOI18N
        jLabel2.setText("ID Producto");

        jLabel12.setFont(new java.awt.Font("Roboto Light", 1, 17)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Sub total");

        jLabel13.setFont(new java.awt.Font("Roboto Light", 1, 17)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("IVA 12%");

        jLabel14.setFont(new java.awt.Font("Roboto Light", 1, 17)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Total");

        txt_total.setBackground(new java.awt.Color(255, 255, 255));
        txt_total.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        txt_iva.setBackground(new java.awt.Color(255, 255, 255));
        txt_iva.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        txt_subtotal.setBackground(new java.awt.Color(255, 255, 255));
        txt_subtotal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        txt_idproducto.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelabajoLayout = new javax.swing.GroupLayout(panelabajo);
        panelabajo.setLayout(panelabajoLayout);
        panelabajoLayout.setHorizontalGroup(
            panelabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelabajoLayout.createSequentialGroup()
                .addGap(500, 500, 500)
                .addComponent(tituloProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelabajoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(panelabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelabajoLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_idproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(spinnetcant, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelabajoLayout.createSequentialGroup()
                        .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelabajoLayout.createSequentialGroup()
                        .addComponent(btn_quitar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                        .addGroup(panelabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelabajoLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(44, 44, 44)
                                .addComponent(txt_iva, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelabajoLayout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelabajoLayout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(47, 47, 47))))
        );
        panelabajoLayout.setVerticalGroup(
            panelabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelabajoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelabajoLayout.createSequentialGroup()
                            .addGap(49, 49, 49)
                            .addGroup(panelabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel13)
                                .addComponent(txt_iva, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(25, 25, 25)
                            .addGroup(panelabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel14)
                                .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panelabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txt_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelabajoLayout.createSequentialGroup()
                        .addComponent(tituloProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addGroup(panelabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelabajoLayout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_quitar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelabajoLayout.createSequentialGroup()
                                .addGroup(panelabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_idproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spinnetcant, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        Titulo_factura.setFont(new java.awt.Font("Roboto", 0, 30)); // NOI18N
        Titulo_factura.setForeground(new java.awt.Color(202, 64, 223));
        Titulo_factura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo_factura.setText("FACTURACIÓN");

        lblfechaV.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        lblfechaV.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblfechaV.setText(" ");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/carrito.png"))); // NOI18N

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Titulo_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(479, 479, 479)
                        .addComponent(lblfechaV, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(panelarriba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelabajo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(Titulo_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblfechaV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGap(18, 18, 18)
                .addComponent(panelarriba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        xD.add(Panel, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(xD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(xD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

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
    public javax.swing.JPanel Panel;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JLabel lblfechaV;
    public javax.swing.JLabel lblvrfcedula;
    private javax.swing.JPanel panelabajo;
    private javax.swing.JPanel panelarriba;
    public javax.swing.JSpinner spinnetcant;
    private javax.swing.JTable tblPersonas2;
    public javax.swing.JTable tbl_factura;
    private javax.swing.JLabel tituloProductos;
    private javax.swing.JTextField txtBuscarPersoD;
    public javax.swing.JTextField txt_cedula;
    public javax.swing.JTextField txt_idproducto;
    public javax.swing.JTextField txt_iva;
    public javax.swing.JTextField txt_nombres;
    public javax.swing.JTextField txt_subtotal;
    public javax.swing.JTextField txt_telefono;
    public javax.swing.JTextField txt_total;
    private javax.swing.JPanel xD;
    // End of variables declaration//GEN-END:variables
}
