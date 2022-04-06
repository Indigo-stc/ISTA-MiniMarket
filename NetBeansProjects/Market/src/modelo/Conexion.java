/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 59399
 */
public class Conexion {

    private Connection con;
    private java.sql.Statement st;
    private ResultSet rs;

    private String cadenaConexion = "jdbc:postgresql://ec2-18-215-96-22.compute-1.amazonaws.com:5432/dbovoaa0p6055l";
    private String usuarioPG = "ygorrnpmhavwkp";
    private String contrasenia = "e1362121236c8dadbcb5ef14e229d71e3dbe9aa62753e18688dd4bf25cd3bb8c";

    public void Conexion() {

        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("se cargo el driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            con = (Connection) DriverManager.getConnection(cadenaConexion, usuarioPG, contrasenia);
            System.out.println("Se conecto BDD.");
        } catch (SQLException ex) {
            System.out.println("No se conceto a la BDD.");
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public ResultSet selectConsulta(String sql) {
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            return rs;
        } catch (SQLException e) {
            System.out.println("EXE");
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }

    public boolean insertUpdateDelete(String sqla) {
        try {
            st = con.createStatement();
            boolean rb = st.execute(sqla);
            st.close();
            return true;
        } catch (SQLException ex) {
            System.out.println("EXEPCION");
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

}
