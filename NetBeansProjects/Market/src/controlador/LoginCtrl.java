package controlador;

import connection.ModeloEmpleado;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import vista.login;

public class LoginCtrl implements ActionListener, MouseListener, KeyListener {

    login lo = new login();

    public LoginCtrl() {
        lo.setLocationRelativeTo(null);
        lo.btnIngresar.addActionListener(this);
        lo.btnSalir.addActionListener(l -> System.exit(0));
        lo.txtUsuario.addMouseListener(this);
        lo.txtUsuario.addKeyListener(this);
        lo.pfCntraseña.addMouseListener(this);
        lo.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            ModeloEmpleado me = new ModeloEmpleado();
            ResultSet r = me.login(lo.txtUsuario.getText(), lo.pfCntraseña.getText());
            if (r.next()) {
                ControladorM cm = new ControladorM(r.getString(7));
                lo.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Datos incorrectos");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Datos incorrectos");
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == lo.txtUsuario) {
            if (lo.txtUsuario.getText().equals("Ingresar usuario")) {
                lo.txtUsuario.setText("");
                lo.txtUsuario.setForeground(Color.black);
            }
            if (String.valueOf(lo.pfCntraseña.getPassword()).isEmpty()) {
                lo.pfCntraseña.setText("******");
                lo.pfCntraseña.setForeground(Color.gray);
            }
        } else if (e.getSource() == lo.pfCntraseña) {
            if (String.valueOf(lo.pfCntraseña.getPassword()).equals("******")) {
                lo.pfCntraseña.setText("");
                lo.pfCntraseña.setForeground(Color.black);
            }
            if (lo.txtUsuario.getText().isEmpty()) {
                lo.txtUsuario.setText("Ingresar usuario");
                lo.txtUsuario.setForeground(Color.gray);
            }
        }

    }

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getSource() == lo.txtUsuario) {
            char c = e.getKeyChar();
            if (!Character.isDigit(c) && e.getKeyChar() != KeyEvent.VK_BACK_SPACE) {
                e.consume();
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}

}