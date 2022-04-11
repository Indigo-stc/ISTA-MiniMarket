package connection;

import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Categoria;

public class ICategoriaDAO implements Crud<Categoria>{

    @Override
    public boolean insert(Categoria objeto) {
        return false;
    }

    @Override
    public void update(Categoria objeto) {}

    @Override
    public ResultSet pk(String id) {
        return null;
    
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
    public List<Categoria> LeerT() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Categoria> Buscar(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}