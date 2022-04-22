/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author 59399
 */
public class MenuPricpal extends javax.swing.JFrame {
    
    public MenuPricpal() {
        initComponents();
    }
    
    public JButton getBtnFactura() {
        return btnFactura;
    }

    public void setBtnFactura(JButton btnFactura) {
        this.btnFactura = btnFactura;
    }

    public JButton getBtnProducto() {
        return btnProducto;
    }

    public void setBtnProducto(JButton btnProducto) {
        this.btnProducto = btnProducto;
    }

 

    public JButton getBtnReportes() {
        return btnReportes;
    }

    public void setBtnReportes(JButton btnReportes) {
        this.btnReportes = btnReportes;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }

    public void setBtnSalir(JButton btnSalir) {
        this.btnSalir = btnSalir;
    }

    public JButton getBtnCliente() {
        return btnCliente;
    }

    public void setBtnCliente(JButton btnCliente) {
        this.btnCliente = btnCliente;
    }

    public JButton getBtnCambia() {
        return btnCambia;
    }

    public void setBtnCambia(JButton btnCambia) {
        this.btnCambia = btnCambia;
    }

    public JPanel getPANELCAR() {
        return PANELCAR;
    }

    public void setPANELCAR(JPanel PANELCAR) {
        this.PANELCAR = PANELCAR;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PANELCAR = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnCambia = new javax.swing.JButton();
        btnCliente = new javax.swing.JButton();
        btnProducto = new javax.swing.JButton();
        btnFactura = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PANELCAR.setBackground(new java.awt.Color(255, 255, 255));
        PANELCAR.setLayout(new java.awt.CardLayout());

        jPanel2.setBackground(new java.awt.Color(250, 251, 253));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/tienda (1).png"))); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(289, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(279, 279, 279))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        PANELCAR.add(jPanel2, "card2");

        jPanel1.add(PANELCAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 15, 1090, 730));

        btnCambia.setBackground(new java.awt.Color(234, 224, 255));
        btnCambia.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnCambia.setForeground(new java.awt.Color(102, 102, 102));
        btnCambia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/cajero (1).png"))); // NOI18N
        btnCambia.setText("EMPLEADO");
        btnCambia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnCambia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 190, 60));

        btnCliente.setBackground(new java.awt.Color(234, 224, 255));
        btnCliente.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnCliente.setForeground(new java.awt.Color(102, 102, 102));
        btnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/cliente.png"))); // NOI18N
        btnCliente.setText("CLIENTE");
        btnCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 190, 60));

        btnProducto.setBackground(new java.awt.Color(234, 224, 255));
        btnProducto.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnProducto.setForeground(new java.awt.Color(102, 102, 102));
        btnProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/caja (1).png"))); // NOI18N
        btnProducto.setText("PRODUCTO");
        btnProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 190, 60));

        btnFactura.setBackground(new java.awt.Color(234, 224, 255));
        btnFactura.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnFactura.setForeground(new java.awt.Color(102, 102, 102));
        btnFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/factura.png"))); // NOI18N
        btnFactura.setText("FACTURA");
        btnFactura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 190, 60));

        btnReportes.setBackground(new java.awt.Color(234, 224, 255));
        btnReportes.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnReportes.setForeground(new java.awt.Color(102, 102, 102));
        btnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/reporte.png"))); // NOI18N
        btnReportes.setText("REPORTES");
        btnReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 190, 60));

        btnSalir.setBackground(new java.awt.Color(140, 123, 146));
        btnSalir.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(33, 209, 254));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/cerrar-sesion.png"))); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, 190, 60));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(234, 234, 234));
        jLabel1.setText("MK System");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fondo.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 15, 220, 730));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 758, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(LK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(LK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(LK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(LK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new LK().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PANELCAR;
    private javax.swing.JButton btnCambia;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnFactura;
    private javax.swing.JButton btnProducto;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
