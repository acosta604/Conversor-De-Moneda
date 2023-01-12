/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversormoneda;

import java.util.Scanner;

/**
 *
 * @author PAULA ACOSTA
 */
public class Cambio {

    private double valorCambio;
    public double cambio;

    public void convertir(double tasa, String tipo) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("ingrese la cantidad de %s: ", tipo);

        valorCambio = sc.nextDouble();

        cambio = (double) Math.round(valorCambio * (1 / tasa));

        if (tasa == 4787) {
            System.out.println("Tienes  $" + cambio + " Dolares \n");

        } else if (tasa == 5033) {
            System.out.println("Tienes €" + cambio + " Euros \n");

        } else if (tasa == 5857) {
            System.out.println("Tienes £" + cambio + " Libras \n");

        } else if (tasa == 35.41) {
            System.out.println("Tienes ¥" + cambio + " Yenes \n");

        } else if (tasa == 3.68) {
            System.out.println("Tienes ₩" + cambio + " wones \n");

        }

    }

    public void revertir(double tasa, String tipo) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("ingrese la cantidad de %s: ", tipo);

        valorCambio = sc.nextDouble();

        cambio = (double) Math.round(valorCambio * (tasa / 1));

        System.out.println("Tienes  $" + cambio + " Pesos Colombianos \n");

    }

}
