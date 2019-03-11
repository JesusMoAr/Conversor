package Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.Model;
import Vistas.*;
import Controladores.*;
import java.sql.ResultSet;
import Conexion.Conexion;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.table.DefaultTableModel;
import sql.SqlClass;
import sql.Sqlm;

public class Control extends Conexion implements ActionListener {

    private Cambios c = new Cambios();
    private Seleccion s = new Seleccion();
    private Model m = new Model();
    private Resultado r = new Resultado();
    private Controlador co;
    private Historial h = new Historial();
    private SqlClass sqlC = new SqlClass();
    private Sqlm sq = new Sqlm();
    private DefaultListModel mdel = new DefaultListModel();

    public Control(Cambios c, Seleccion s, Controlador co, Model m) {
        this.c = c;
        this.s = s;
        this.co = co;
        this.m = m;
        this.s.Dolar.addActionListener(this);
        this.s.DolarC.addActionListener(this);
        this.s.Euro.addActionListener(this);
        this.s.Libra.addActionListener(this);
        this.s.Yen.addActionListener(this);
        this.s.Historial.addActionListener(this);
    }

    public void Inicio() {
        s.setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == s.Dolar) {
            r.dispose();
            c.Cambio.setText("Dolar");
            Controlador cs = new Controlador(c, s, m, r);
            cs.Inicio();
        } else if (ae.getSource() == s.Euro) {
            r.dispose();
            c.Cambio.setText("Euro");
            Controlador cs = new Controlador(c, s, m, r);
            cs.Inicio();
        } else if (ae.getSource() == s.Yen) {
            r.dispose();
            c.Cambio.setText("Yen");
            Controlador cs = new Controlador(c, s, m, r);
            cs.Inicio();
        } else if (ae.getSource() == s.Libra) {
            r.dispose();
            c.Cambio.setText("Libra");
            Controlador cs = new Controlador(c, s, m, r);
            cs.Inicio();
        } else if (ae.getSource() == s.DolarC) {
            r.dispose();
            c.Cambio.setText("Dolar Canadience");
            Controlador cs = new Controlador(c, s, m, r);
            cs.Inicio();
        } else if (ae.getSource() == s.Historial) {
            ResultSet rs = sq.bus(sqlC);
            Object[] arr = new Object[4];
            DefaultTableModel model = (DefaultTableModel) h.jTable1.getModel();
            while (model.getRowCount() > 0) {
                model.removeRow(0);
            }
            try {
                while (rs.next()) {

                    arr[0] = rs.getDouble(1);
                    arr[1] = rs.getDouble(2);
                    arr[2] = rs.getDouble(3);
                    arr[3] = rs.getString(4);
                    model.addRow(arr);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
            }

            h.setVisible(true);

        } else {

            System.out.println("Hola");
        }
    }

}
