package controlador;

import connection.ModeloEmpleado;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import vista.login;

public class LoginCtrl implements ActionListener {

    login lo = new login();

    public LoginCtrl() {
        lo.setLocationRelativeTo(null);
        lo.btnIngresar.addActionListener(this);
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

}

//class test {
//
//    public static void main(String[] args) {
//        LoginCtrl cl = new LoginCtrl();
//    }
//}

