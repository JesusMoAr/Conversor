
package Modelo;

import Vistas.*;


public class Model {
    private double Moneda, Moneda2, Cambio;
  
    
    public double Dolar(){
         setMoneda2(19.10);
        return this.Cambio = Moneda * Moneda2 / 1;
    
    }
    public double Euro(){
        setMoneda2(21.76);
        return this.Cambio = Moneda * Moneda2 / 1;
    
    }
    public double Yen(){
        setMoneda2(5.81);
        return this.Cambio = Moneda * Moneda2 / 1;
    
    }
    public double Libra(){
        setMoneda2(0.0400650);
        return this.Cambio = Moneda * Moneda2 / 1;
    
    }
    public double DolarCanadience(){
        setMoneda2(0.06905);
        return this.Cambio = Moneda * Moneda2 / 1;
    
    }
    
    public double getMoneda() {
        return Moneda;
    }

    public void setMoneda(double Moneda) {
        this.Moneda = Moneda;
    }

    public double getMoneda2() {
        return Moneda2;
    }

    public void setMoneda2(double Moneda2) {
        this.Moneda2 = Moneda2;
    }

    public double getCambio() {
        return Cambio;
    }

    public void setCambio(double Cambio) {
        this.Cambio = Cambio;
    }
    
    
    
}
