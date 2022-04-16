package connection;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Proveedor;

public class IProveedorDAO implements Crud<Proveedor> {
    
    @Override
    public boolean insert(Proveedor pvd) {
        Conexion con = new Conexion();
        String stm = "INSERT INTO proveedores VALUES (?, ?, ?, ?);";
        try {
            PreparedStatement ps = con.getCon().prepareStatement(stm);
            ps.setString(1, pvd.getProveedor_id());
            ps.setString(2, pvd.getNombre());
            ps.setString(3, pvd.getTelefono());
            ps.setString(4, pvd.getDireccion());
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(IProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }


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

    @Override
    public List<Proveedor> LeerT() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(String codigo) {
        String stm = "DELETE FROM proveedores "
                + "WHERE proveedor_id = '"+codigo+"';";
        Conexion con = new Conexion();
        return con.insertUpdateDelete(stm) == true;  
    }

    @Override
    public List<Proveedor> Buscar(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(Proveedor obj) {
        String stm = "UPDATE proveedores "
                + "SET nombre = '"+obj.getNombre()+"', telefono = '"+obj.getTelefono()+"', direccion = '"+obj.getDireccion()+"' "
                + "WHERE proveedor_id = '"+obj.getProveedor_id()+"';";
        Conexion con = new Conexion();
        return con.insertUpdateDelete(stm);
    }
    
    public boolean existPvd(Proveedor p) {
        String stm = "SELECT * FROM proveedores "
                + "WHERE UPPER(REPLACE(nombre , ' ', '')) like UPPER(REPLACE('"+p.getNombre()+"' , ' ', '')) "
                + "AND telefono = '"+p.getTelefono()+"' "
                + "AND UPPER(REPLACE(direccion , ' ', '')) like UPPER(REPLACE('"+p.getDireccion()+"' , ' ', ''))";
        Conexion con = new Conexion();
        try {
            return con.selectConsulta(stm).next() == true;
        } catch (SQLException ex) {
            return false;
        }
    }
    
    public ArrayList<Proveedor> buscar(String search) {
        String stm = "";
        if ("".equalsIgnoreCase(search.trim())) {
            stm = "SELECT * FROM proveedores";
        } else {
            stm = "SELECT * FRoM proveedores WHERE "
                + "UPPER(nombre) LIKE UPPER('%"+search+"%') "
                + "OR telefono LIKE ('%"+search+"%') "
                + "OR UPPER(direccion) LIKE UPPER('%"+search+"%') "; 
        }
        ArrayList<Proveedor> regs = new ArrayList<>();
        Conexion con = new Conexion();
        ResultSet rs = con.selectConsulta(stm);
        try {
            while(rs.next()) {
                Proveedor pvd = new Proveedor(rs.getString(1), rs.getString(2),
                        rs.getString(3), rs.getString(4));
                regs.add(pvd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(IProveedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return regs;
    }
    
    public Proveedor idPvd(String nombre) {
        String stm = "SELECT * from proveedores WHERE nombre = '"+nombre+"';";
        Conexion con = new Conexion();
        ResultSet res = con.selectConsulta(stm);
        try {
            if (res.next()) {
                return new Proveedor(res.getString(1), res.getString(2), 
                        res.getString(2), res.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ICategoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}