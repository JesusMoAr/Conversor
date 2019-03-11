
package cambio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.Model;
import Vistas.*;
import Controladores.*;
import Conexion.Conexion;
import java.sql.SQLException;

public class Cambio extends Conexion{


    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Conexion con = new Conexion();
        con.getConexion();
        Model mod = new Model ();
        Cambios view = new Cambios();
        Seleccion sele = new Seleccion();
        Resultado r = new Resultado();
      
        Controlador contr = new Controlador(view, sele,mod,r);
        
        Control a = new Control(view, sele, contr,mod);
        a.Inicio();
    }
    
}
