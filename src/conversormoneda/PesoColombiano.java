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
public class PesoColombiano extends Moneda {

    @Override
    public double getTasa() {
        return tasa;
    }

    @Override
    public void setTasa(double tasa) {
        this.tasa = tasa;
    }

    private String tipo = "Pesos colombianos";
    private double tasa = 4728;

    @Override
    public String getTipo() {
        return this.tipo;
    }

    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
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
