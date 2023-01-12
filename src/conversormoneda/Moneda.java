/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversormoneda;

/**
 *
 * @author PAULA ACOSTA
 */
public abstract class Moneda {

    private String tipo;
    private double tasa;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getTasa() {
        return tasa;
    }

    public void setTasa(double tasa) {
        this.tasa = tasa;
    }

    public abstract void convertir(double tasa, String tipo);

    public abstract void revertir(double tasa, String tipo);

}
