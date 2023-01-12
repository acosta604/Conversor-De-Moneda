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
public class Main {

    public static void main(String[] args) {

        Moneda pesoColombiano = new PesoColombiano();
        Moneda libra = new LibraEsterlina();
        Moneda euro = new Euro();
        Moneda dolar = new Dolar();
        Moneda yen = new YenJapones();
        Moneda won = new WonSurcoreano();

        Cambio conversion = new Cambio();
        Cambio reversion = new Cambio();

        externa:
        while (true) {
            System.out.println("CONVERSOR DE MONEDAS");
            System.out.println("1- Pesos colombianos a dolares \n"
                    + "2- Pesos colombianos a euros\n"
                    + "3- Pesos colombianos a libras\n"
                    + "4- Pesos colombianos a yen\n"
                    + "5- Pesos colombianos a won\n"
                    + "6- Dolares a Pesos colombianos \n"
                    + "7- Euros a Pesos colombianos \n"
                    + "8- Libras a Pesos colombianos \n"
                    + "9- Yenes a Pesos colombianos \n"
                    + "10- Wones a Pesos colombianos \n"
                    + "0- Salir");
            System.out.print("INGRESE UNA OPCION: ");

            Scanner sc = new Scanner(System.in);
            int opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    conversion.convertir(dolar.getTasa(), pesoColombiano.getTipo());
                    break;
                case 2:
                    conversion.convertir(euro.getTasa(), pesoColombiano.getTipo());
                    break;
                case 3:
                    conversion.convertir(libra.getTasa(), pesoColombiano.getTipo());
                    break;

                case 4:
                    conversion.convertir(yen.getTasa(), pesoColombiano.getTipo());
                    break;
                case 5:
                    conversion.convertir(won.getTasa(), pesoColombiano.getTipo());
                    break;

                case 6:
                    reversion.revertir(dolar.getTasa(), dolar.getTipo());
                    break;
                case 7:
                    reversion.revertir(euro.getTasa(), euro.getTipo());
                    break;
                case 8:
                    reversion.revertir(libra.getTasa(), libra.getTipo());
                    break;

                case 9:
                    reversion.revertir(yen.getTasa(), yen.getTipo());
                    break;

                case 10:
                    reversion.revertir(won.getTasa(), won.getTipo());
                    break;

                case 0:
                    System.out.println("Cerrando programa...");
                    break externa;

                default:
                    System.out.println("OPCION INCORRECTA");
                    break;
            }
        }

    }

}
