package sql;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Sqlm extends Conexion {

    public boolean reg(SqlClass sql1) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "INSERT INTO historial (Moneda1,Moneda2,Total,Fecha) VALUES (?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setDouble(1, sql1.getMoneda1());
            ps.setDouble(2, sql1.getMoneda2());
            ps.setDouble(3, sql1.getRes());
            ps.setString(4, sql1.getFecha());
            ps.execute();
            System.out.println("Guardado Exitoso");
            return true;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return false;
        } finally {
            try {
                con.close();
            } catch (Exception e) {
            }
        }
    }

    public ResultSet bus(SqlClass sql1) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT * FROM historial";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
                
            
            return rs;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
        }
        
    }
}
