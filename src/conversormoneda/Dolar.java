/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversormoneda;

public class Dolar extends Moneda {

    private String tipo = "Dolares";

    private double tasa = 4787;

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
