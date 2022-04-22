package vista;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;

public class PanelEmpleado extends javax.swing.JPanel {

    public PanelEmpleado() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelEmpleado = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        DateFecha = new com.toedter.calendar.JDateChooser();
        Combo_Rol = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        vfyCedula = new javax.swing.JLabel();
        vfyNombre = new javax.swing.JLabel();
        vfyApellido = new javax.swing.JLabel();
        vfyBirth = new javax.swing.JLabel();
        vfyContra = new javax.swing.JLabel();
        vfyCorreo = new javax.swing.JLabel();
        vfyCelu = new javax.swing.JLabel();
        vfyDir = new javax.swing.JLabel();
        vfyRol = new javax.swing.JLabel();
        vfySalario = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaEmpleado = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1090, 730));

        PanelEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        PanelEmpleado.setPreferredSize(new java.awt.Dimension(1090, 730));

        jPanel2.setBackground(new java.awt.Color(246, 246, 246));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setFont(new java.awt.Font("Roboto Light", 1, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Cédula");

        jLabel3.setFont(new java.awt.Font("Roboto Light", 1, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Correo");

        jLabel4.setFont(new java.awt.Font("Roboto Light", 1, 17)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("F. Nacimiento");

        jLabel5.setFont(new java.awt.Font("Roboto Light", 1, 17)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Apellido");

        jLabel6.setFont(new java.awt.Font("Roboto Light", 1, 17)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Nombre");

        jLabel7.setFont(new java.awt.Font("Roboto Light", 1, 17)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Dirección");

        jLabel8.setFont(new java.awt.Font("Roboto Light", 1, 17)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Rol");

        txtCedula.setBackground(new java.awt.Color(255, 255, 255));
        txtCedula.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtCedula.setForeground(new java.awt.Color(0, 0, 0));
        txtCedula.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));

        txtApellido.setBackground(new java.awt.Color(255, 255, 255));
        txtApellido.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(0, 0, 0));

        txtCorreo.setBackground(new java.awt.Color(255, 255, 255));
        txtCorreo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(0, 0, 0));
        txtCorreo.setMinimumSize(new java.awt.Dimension(70, 22));

        txtDireccion.setBackground(new java.awt.Color(255, 255, 255));
        txtDireccion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDireccion.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        DateFecha.setToolTipText("");

        Combo_Rol.setBackground(new java.awt.Color(255, 255, 255));
        Combo_Rol.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        Combo_Rol.setForeground(new java.awt.Color(0, 0, 0));
        Combo_Rol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));

        jLabel9.setFont(new java.awt.Font("Roboto Light", 1, 17)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Celular");

        txtPhone.setBackground(new java.awt.Color(255, 255, 255));
        txtPhone.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtPhone.setMinimumSize(new java.awt.Dimension(70, 22));

        jLabel10.setFont(new java.awt.Font("Roboto Light", 1, 17)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Contraseña");

        jLabel12.setFont(new java.awt.Font("Roboto Light", 1, 17)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Salario");

        txtSalario.setBackground(new java.awt.Color(255, 255, 255));
        txtSalario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtSalario.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtSalario.setMinimumSize(new java.awt.Dimension(70, 22));

        txtPassword.setBackground(new java.awt.Color(255, 255, 255));
        txtPassword.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtPassword.setToolTipText("");

        vfyCedula.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        vfyCedula.setForeground(new java.awt.Color(255, 0, 0));
        vfyCedula.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        vfyNombre.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        vfyNombre.setForeground(new java.awt.Color(255, 0, 0));
        vfyNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        vfyNombre.setPreferredSize(new java.awt.Dimension(8, 16));

        vfyApellido.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        vfyApellido.setForeground(new java.awt.Color(255, 0, 0));
        vfyApellido.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        vfyBirth.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        vfyBirth.setForeground(new java.awt.Color(255, 0, 0));
        vfyBirth.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        vfyContra.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        vfyContra.setForeground(new java.awt.Color(255, 0, 0));
        vfyContra.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        vfyCorreo.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        vfyCorreo.setForeground(new java.awt.Color(255, 0, 0));
        vfyCorreo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        vfyCelu.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        vfyCelu.setForeground(new java.awt.Color(255, 0, 0));
        vfyCelu.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        vfyDir.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        vfyDir.setForeground(new java.awt.Color(255, 0, 0));
        vfyDir.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        vfyRol.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        vfyRol.setForeground(new java.awt.Color(255, 0, 0));
        vfyRol.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        vfySalario.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        vfySalario.setForeground(new java.awt.Color(255, 0, 0));
        vfySalario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(vfyDir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(vfyCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(DateFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(vfyBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(119, 119, 119)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(vfyContra, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(vfyRol, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Combo_Rol, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(vfySalario, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(50, 50, 50)
                        .addComponent(vfyCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(vfyNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(vfyCelu, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(vfyApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel7)
                        .addComponent(jLabel12))
                    .addComponent(vfyCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vfyDir, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vfySalario, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(vfyNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)))
                    .addComponent(vfyCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vfyRol, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Combo_Rol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel4)
                        .addComponent(jLabel10)
                        .addComponent(vfyApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(vfyContra, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vfyBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(vfyCelu, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        btnModificar.setBackground(new java.awt.Color(152, 182, 144));
        btnModificar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/modi.png"))); // NOI18N
        btnModificar.setText("Modificar");

        btnEliminar.setBackground(new java.awt.Color(193, 163, 176));
        btnEliminar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/basu.png"))); // NOI18N
        btnEliminar.setText("Eliminar");

        btnLimpiar.setBackground(new java.awt.Color(174, 197, 195));
        btnLimpiar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/pagina-web.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");

        btnAceptar.setBackground(new java.awt.Color(152, 158, 179));
        btnAceptar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/agregar-usuario.png"))); // NOI18N
        btnAceptar.setText("Agregar");
        btnAceptar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel13.setFont(new java.awt.Font("Roboto Black", 0, 30)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(202, 64, 223));
        jLabel13.setText("EMPLEADO");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/cajero (1).png"))); // NOI18N

        TablaEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        TablaEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cedula", "Codigo", "Nombre", "Apellido", "FechaN", "Phone", "Correo", "Rol", "Rol_ID", "Salario", "Direccion", "Password"
            }
        ));
        TablaEmpleado.setRowHeight(30);
        TablaEmpleado.setSelectionBackground(new java.awt.Color(255, 198, 132));
        jScrollPane1.setViewportView(TablaEmpleado);

        txtBuscar.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscar.setToolTipText("Puede realizar su busquedad introduciendo la cedula.?");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/buscar.png"))); // NOI18N

        javax.swing.GroupLayout PanelEmpleadoLayout = new javax.swing.GroupLayout(PanelEmpleado);
        PanelEmpleado.setLayout(PanelEmpleadoLayout);
        PanelEmpleadoLayout.setHorizontalGroup(
            PanelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEmpleadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelEmpleadoLayout.createSequentialGroup()
                .addGroup(PanelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEmpleadoLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2))
                    .addGroup(PanelEmpleadoLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(PanelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelEmpleadoLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13))
                            .addGroup(PanelEmpleadoLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PanelEmpleadoLayout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(btnAceptar)
                        .addGap(28, 28, 28)
                        .addComponent(btnEliminar)
                        .addGap(20, 20, 20)
                        .addComponent(btnLimpiar)
                        .addGap(20, 20, 20)
                        .addComponent(btnModificar))
                    .addGroup(PanelEmpleadoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1077, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        PanelEmpleadoLayout.setVerticalGroup(
            PanelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEmpleadoLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnLimpiar)
                    .addComponent(btnAceptar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1090, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(PanelEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    public JComboBox<String> getCombo_Rol() {
        return Combo_Rol;
    }

    public void setCombo_Rol(JComboBox<String> Combo_Rol) {
        this.Combo_Rol = Combo_Rol;
    }

    public JDateChooser getDateFecha() {
        return DateFecha;
    }

    public void setDateFecha(JDateChooser DateFecha) {
        this.DateFecha = DateFecha;
    }

    public JPanel getPanelEmpleado() {
        return PanelEmpleado;
    }

    public void setPanelEmpleado(JPanel PanelEmpleado) {
        this.PanelEmpleado = PanelEmpleado;
    }

    public JTable getTablaEmpleado() {
        return TablaEmpleado;
    }

    public void setTablaEmpleado(JTable TablaEmpleado) {
        this.TablaEmpleado = TablaEmpleado;
    }

    public JButton getBtnAceptar() {
        return btnAceptar;
    }

    public void setBtnAceptar(JButton btnAceptar) {
        this.btnAceptar = btnAceptar;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public JButton getBtnLimpiar() {
        return btnLimpiar;
    }

    public void setBtnLimpiar(JButton btnLimpiar) {
        this.btnLimpiar = btnLimpiar;
    }

    public JButton getBtnModificar() {
        return btnModificar;
    }

    public void setBtnModificar(JButton btnModificar) {
        this.btnModificar = btnModificar;
    }

    public JTextField getTxtApellido() {
        return txtApellido;
    }

    public void setTxtApellido(JTextField txtApellido) {
        this.txtApellido = txtApellido;
    }

    public JTextField getTxtBuscar() {
        return txtBuscar;
    }

    public void setTxtBuscar(JTextField txtBuscar) {
        this.txtBuscar = txtBuscar;
    }

    public JTextField getTxtCedula() {
        return txtCedula;
    }

    public void setTxtCedula(JTextField txtCedula) {
        this.txtCedula = txtCedula;
    }

    public JTextField getTxtCorreo() {
        return txtCorreo;
    }

    public void setTxtCorreo(JTextField txtCorreo) {
        this.txtCorreo = txtCorreo;
    }

    public JTextField getTxtDireccion() {
        return txtDireccion;
    }

    public void setTxtDireccion(JTextField txtDireccion) {
        this.txtDireccion = txtDireccion;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JPasswordField getTxtPassword() {
        return txtPassword;
    }

    public void setTxtPassword(JPasswordField txtPassword) {
        this.txtPassword = txtPassword;
    }

    public JTextField getTxtPhone() {
        return txtPhone;
    }

    public void setTxtPhone(JTextField txtPhone) {
        this.txtPhone = txtPhone;
    }

    public JTextField getTxtSalario() {
        return txtSalario;
    }

    public void setTxtSalario(JTextField txtSalario) {
        this.txtSalario = txtSalario;
    }

    public JLabel getVfyApellido() {
        return vfyApellido;
    }

    public void setVfyApellido(JLabel vfyApellido) {
        this.vfyApellido = vfyApellido;
    }

    public JLabel getVfyBirth() {
        return vfyBirth;
    }

    public void setVfyBirth(JLabel vfyBirth) {
        this.vfyBirth = vfyBirth;
    }

    public JLabel getVfyCedula() {
        return vfyCedula;
    }

    public void setVfyCedula(JLabel vfyCedula) {
        this.vfyCedula = vfyCedula;
    }

    public JLabel getVfyCelu() {
        return vfyCelu;
    }

    public void setVfyCelu(JLabel vfyCelu) {
        this.vfyCelu = vfyCelu;
    }

    public JLabel getVfyContra() {
        return vfyContra;
    }

    public void setVfyContra(JLabel vfyContra) {
        this.vfyContra = vfyContra;
    }

    public JLabel getVfyCorreo() {
        return vfyCorreo;
    }

    public void setVfyCorreo(JLabel vfyCorreo) {
        this.vfyCorreo = vfyCorreo;
    }

    public JLabel getVfyDir() {
        return vfyDir;
    }

    public void setVfyDir(JLabel vfyDir) {
        this.vfyDir = vfyDir;
    }

    public JLabel getVfyNombre() {
        return vfyNombre;
    }

    public void setVfyNombre(JLabel vfyNombre) {
        this.vfyNombre = vfyNombre;
    }

    public JLabel getVfyRol() {
        return vfyRol;
    }

    public void setVfyRol(JLabel vfyRol) {
        this.vfyRol = vfyRol;
    }

    public JLabel getVfySalario() {
        return vfySalario;
    }

    public void setVfySalario(JLabel vfySalario) {
        this.vfySalario = vfySalario;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Combo_Rol;
    private com.toedter.calendar.JDateChooser DateFecha;
    private javax.swing.JPanel PanelEmpleado;
    private javax.swing.JTable TablaEmpleado;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JLabel vfyApellido;
    private javax.swing.JLabel vfyBirth;
    private javax.swing.JLabel vfyCedula;
    private javax.swing.JLabel vfyCelu;
    private javax.swing.JLabel vfyContra;
    private javax.swing.JLabel vfyCorreo;
    private javax.swing.JLabel vfyDir;
    private javax.swing.JLabel vfyNombre;
    private javax.swing.JLabel vfyRol;
    private javax.swing.JLabel vfySalario;
    // End of variables declaration//GEN-END:variables
}
