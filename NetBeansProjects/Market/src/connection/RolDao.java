package connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Rol;

/**
 *
 * @author 59399
 */
public class RolDao {

    Conexion con = new Conexion();

    public List<Rol> Aa() {

        String nombre = "select rol_id, etiqueta from roles;";
        List<Rol> roles = new ArrayList();

        ResultSet st = con.selectConsulta(nombre);

        try {
            while (st.next()) {
                Rol rols = new Rol(st.getInt(1), st.getString(2));
                roles.add(rols);
            }
            return roles;

        } catch (SQLException ex) {
            Logger.getLogger(RolDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return roles;

    }

    public int Ff(String rol) {
        try {
            String sql = "select rol_id from roles where etiqueta='" + rol + "';";
            ResultSet st = con.selectConsulta(sql);
            while(st.next()){
                return st.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(RolDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

}