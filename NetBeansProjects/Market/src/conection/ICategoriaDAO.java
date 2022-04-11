package conection;

import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Categoria;

public class ICategoriaDAO implements DDL<Categoria>{

    @Override
    public boolean insert(Categoria objeto) {
        return false;
    }

    @Override
    public ArrayList<Categoria> registros() {
        String stm = "Select * from categorias";
        Conexion con = new Conexion();
        ResultSet res = con.selectConsulta(stm);
        ArrayList<Categoria> reg = new ArrayList();
        try {
            while(res.next()) {
                Categoria ctg = new Categoria(res.getString(1), res.getString(2));
                reg.add(ctg);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ICategoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return reg;
    } 

    @Override
    public boolean delete(String column) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(Categoria objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean existeID(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ResultSet pk(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}