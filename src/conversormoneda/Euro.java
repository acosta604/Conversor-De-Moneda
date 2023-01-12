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
public class Euro extends Moneda {

    private String tipo = "Euros";
    private double tasa = 5033;

    @Override
    public double getTasa() {
        return this.tasa;
    }

    @Override
    public void setTasa(double tasa) {
        this.tasa = tasa;
    }

    @Override
    public void convertir(double tasa, String tipo) {
        tasa = this.tasa;
        tipo = this.tipo;

    }

    @Override
    public void revertir(double tasa, String tipo) {
        tasa = this.tasa;
        tipo = this.tipo;
    }

}
