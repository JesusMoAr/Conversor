
package sql;

public class SqlClass {
   private String fecha = "";
   private double moneda1 = 0;
   private double moneda2 = 0;
   private double res = 0;

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getMoneda1() {
        return moneda1;
    }

    public void setMoneda1(double moneda1) {
        this.moneda1 = moneda1;
    }

    public double getMoneda2() {
        return moneda2;
    }

    public void setMoneda2(double moneda2) {
        this.moneda2 = moneda2;
    }

    public double getRes() {
        return res;
    }

    public void setRes(double res) {
        this.res = res;
    }
   
}
