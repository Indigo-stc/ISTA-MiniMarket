/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 59399
 */
public class RolDao {

    Conexion con = new Conexion();

    public List<Roles> Aa() {

        String nombre = "select rol_id, etiqueta from roles;";
        List<Roles> roles = new ArrayList();

        ResultSet st = con.selectConsulta(nombre);

        try {
            while (st.next()) {
                Roles rols = new Roles(st.getInt(1), st.getString(2));
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
