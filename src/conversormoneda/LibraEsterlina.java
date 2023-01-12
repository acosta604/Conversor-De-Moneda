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
public class LibraEsterlina extends Moneda {

    private String tipo = "Libras";

    private double tasa = 5857;

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

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
