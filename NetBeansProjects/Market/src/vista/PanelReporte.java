/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author Usuario
 */
public class PanelReporte extends javax.swing.JPanel {

    /**
     * Creates new form PanelReporte
     */
    public PanelReporte() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnImprimirCLI = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblreportcli = new javax.swing.JLabel();
        XD = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnimprimirEMP = new javax.swing.JButton();
        LBLEMPREPORT = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1090, 730));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1090, 730));

        jPanel2.setBackground(new java.awt.Color(211, 193, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnImprimirCLI.setBackground(new java.awt.Color(255, 255, 255));
        btnImprimirCLI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/imprimir.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(32, 44, 255));
        jLabel1.setText("CLIENTES");

        lblreportcli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/cliente.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnImprimirCLI, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(lblreportcli, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblreportcli, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnImprimirCLI, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        XD.setBackground(new java.awt.Color(126, 197, 149));
        XD.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        XD.setForeground(new java.awt.Color(245, 161, 62));

        jLabel2.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(32, 44, 255));
        jLabel2.setText("PRODUCTOS");

        btnimprimirEMP.setBackground(new java.awt.Color(255, 255, 255));
        btnimprimirEMP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/imprimir.png"))); // NOI18N

        LBLEMPREPORT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/caja (1).png"))); // NOI18N

        javax.swing.GroupLayout XDLayout = new javax.swing.GroupLayout(XD);
        XD.setLayout(XDLayout);
        XDLayout.setHorizontalGroup(
            XDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(XDLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(XDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnimprimirEMP, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(XDLayout.createSequentialGroup()
                        .addComponent(LBLEMPREPORT)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        XDLayout.setVerticalGroup(
            XDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(XDLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(XDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBLEMPREPORT, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(XDLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(btnimprimirEMP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 32, 134));
        jLabel3.setText("REPORTES");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/reporte.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(XD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(508, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(XD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(401, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LBLEMPREPORT;
    private javax.swing.JPanel XD;
    public javax.swing.JButton btnImprimirCLI;
    public javax.swing.JButton btnimprimirEMP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblreportcli;
    // End of variables declaration//GEN-END:variables
}
