package Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.Model;
import Vistas.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import jdk.nashorn.internal.ir.BreakNode;
import sql.*;

public class Controlador implements ActionListener {

    private Cambios c;
    private Seleccion s;
    private Model m;
    private Resultado r;
    private Date date = new Date();
    private SqlClass sc;
    private Sqlm sq;
    DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");

    public Controlador(Cambios c, Seleccion s, Model m, Resultado r) {
        this.c = c;
        this.s = s;
        this.m = m;
        this.r = r;

        sq = new Sqlm();
        sc = new SqlClass();

        this.c.Cambio.addActionListener(this);
    }

    public void Inicio() {
        c.setTitle("Cambio");
        c.dispose();
        c.setLocationRelativeTo(null);
        c.show();

    }

    public void actionPerformed(ActionEvent ae) {
        if (c.Cambio.getText() == "Dolar") {
            c.Cambio.setText("Cacular");
            r.show();
            m.setMoneda(Double.parseDouble(c.Moneda.getText()));
            m.Dolar();
            String a = hourdateFormat.format(date).toString();
            sc.setFecha(a);
            sc.setMoneda1(m.getMoneda());
            sc.setMoneda2(m.getMoneda2());
            r.Res.setText(String.valueOf(m.getCambio()));
            sc.setRes(m.getCambio());
            sq.reg(sc);
            

        }
        if (c.Cambio.getText() == "Euro") {
            c.Cambio.setText("Cacular");
            m.setMoneda(Double.parseDouble(c.Moneda.getText()));
            r.dispose();
            m.Euro();
            r.setLocationRelativeTo(null);
            r.show();
            String a = hourdateFormat.format(date).toString();
            sc.setFecha(a);
            sc.setMoneda1(m.getMoneda());
            sc.setMoneda2(m.getMoneda2());
            r.Res.setText(String.valueOf(m.getCambio()));
            sc.setRes(m.getCambio());
            sq.reg(sc);
            r.Res.setText(String.valueOf(m.getCambio()));

        }
        if (c.Cambio.getText() == "Yen") {
            c.Cambio.setText("Cacular");
            m.setMoneda(Double.parseDouble(c.Moneda.getText()));
            r.dispose();
            m.Yen();
            r.setLocationRelativeTo(null);
            r.show();
            String a = hourdateFormat.format(date).toString();
            sc.setFecha(a);
            sc.setMoneda1(m.getMoneda());
            sc.setMoneda2(m.getMoneda2());
            r.Res.setText(String.valueOf(m.getCambio()));
            sc.setRes(m.getCambio());
            sq.reg(sc);

        }
        if (c.Cambio.getText() == "Libra") {
            c.Cambio.setText("Cacular");
            m.setMoneda(Double.parseDouble(c.Moneda.getText()));
            r.dispose();
            m.Libra();
            r.setLocationRelativeTo(null);
            r.show();
            String a = hourdateFormat.format(date).toString();
            sc.setFecha(a);
            sc.setMoneda1(m.getMoneda());
            sc.setMoneda2(m.getMoneda2());
            r.Res.setText(String.valueOf(m.getCambio()));
            sc.setRes(m.getCambio());
            sq.reg(sc);

        }
        if (c.Cambio.getText() == "Dolar Canadience") {
            c.Cambio.setText("Cacular");
            m.setMoneda(Double.parseDouble(c.Moneda.getText()));
            r.dispose();
            m.DolarCanadience();
            r.show();
            String a = hourdateFormat.format(date).toString();
            sc.setFecha(a);
            sc.setMoneda1(m.getMoneda());
            sc.setMoneda2(m.getMoneda2());
            r.Res.setText(String.valueOf(m.getCambio()));
            sc.setRes(m.getCambio());
            sq.reg(sc);

        }

    }

}
