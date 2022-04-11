package modelo;

import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IProveedorDAO implements DDL<Proveedor> {

    @Override
    public boolean insert(Proveedor objeto) {
        return false;
    }

    @Override
    public void delete(String column) {}

    @Override
    public void update(Proveedor objeto) {}

    @Override
    public ArrayList<Proveedor> registros() {
        String stm = "Select * from proveedores";
        Conexion con = new Conexion();
        ResultSet res = con.selectConsulta(stm);
        ArrayList<Proveedor> registros = new ArrayList();
        try {
            while(res.next()) {
                Proveedor pvdr = new Proveedor(res.getString(1), res.getString(2),
                        res.getString(3), res.getString(4));
                registros.add(pvdr);
            }
        } catch (SQLException ex) {
            Logger.getLogger(IProveedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return registros;
    }

    @Override
    public ResultSet pk(String id) {
        return null;
        
    }
    
}