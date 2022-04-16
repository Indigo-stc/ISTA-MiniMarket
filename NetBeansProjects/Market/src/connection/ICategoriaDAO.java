package connection;

import java.sql.PreparedStatement;
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
        String stm = "INSERT INTO categorias VALUES (?, ?);";
        Conexion con = new Conexion();
        try {
            PreparedStatement ps = con.getCon().prepareStatement(stm);
            ps.setString(1, objeto.getCategoria_id());
            ps.setString(2, objeto.getTitulo());
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(IProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

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
        String stm = "DELETE FROM categorias "
                + "WHERE categoria_id = '"+codigo+"';";
        Conexion con = new Conexion();
        return con.insertUpdateDelete(stm) == true;  
    }

    @Override
    public List<Categoria> Buscar(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(Categoria obj) {
        String stm = "UPDATE categorias "
                + "SET titulo = '"+obj.getTitulo()+"' "
                + "WHERE categoria_id = '"+obj.getCategoria_id()+"';";
        Conexion con = new Conexion();
        return con.insertUpdateDelete(stm);
    }
    
    public boolean existCtg(Categoria p) {
        String stm = "SELECT * FROM categorias "
                + "WHERE UPPER(REPLACE(titulo , ' ', '')) like UPPER(REPLACE('"+p.getTitulo()+"' , ' ', ''));";
        Conexion con = new Conexion();
        try {
            return con.selectConsulta(stm).next() == true;
        } catch (SQLException ex) {
            return false;
        }
    }
    
    public ArrayList<Categoria> buscar(String search) {
        String stm = "";
        if ("".equalsIgnoreCase(search.trim())) {
            stm = "SELECT * FROM categorias";
        } else {
            stm = "SELECT * FROM categorias WHERE "
                + "UPPER(titulo) LIKE UPPER('%"+search+"%');"; 
        }
        ArrayList<Categoria> regs = new ArrayList<>();
        Conexion con = new Conexion();
        ResultSet rs = con.selectConsulta(stm);
        try {
            while(rs.next()) {
                Categoria ctg = new Categoria(rs.getString(1), rs.getString(2));
                regs.add(ctg);
            }
        } catch (SQLException ex) {
            Logger.getLogger(IProveedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return regs;
    }
    
    public Categoria idCtg(String titulo) {
        String stm = "SELECT * from categorias WHERE titulo = '"+titulo+"';";
        Conexion con = new Conexion();
        ResultSet res = con.selectConsulta(stm);
        try {
            if (res.next()) {
                return new Categoria(res.getString(1), res.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ICategoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}