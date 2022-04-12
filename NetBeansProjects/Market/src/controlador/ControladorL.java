

package controlador;

import connection.ModeloEmpleado;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import vista.MenuPricpal;
import vista.login;

/**
 *
 * @author User
 */
public class ControladorL implements ActionListener {
    login  lo= new login ();

    public ControladorL() {
    lo.btn_ingresar.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            ModeloEmpleado me= new ModeloEmpleado();
            ResultSet r= me.login(lo.txt_usuario.getText(), lo.txt_contraseña.getText());
            if(r.next()){
                MenuPricpal mp= new MenuPricpal();
                ControladorM cm= new ControladorM(mp,r.getString(7));
            }  } catch (SQLException ex) {
            Logger.getLogger(ControladorL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
class test {
    public static void main(String[] args) {
        ControladorL cl= new ControladorL();
    }
}