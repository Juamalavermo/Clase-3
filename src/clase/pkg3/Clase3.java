/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg3;

import java.util.Scanner;


/**
 *
 * @author Julián Malaver
 */
public class Clase3 {

    public static double pagoSalario(int horas, double valor) {

        double pago = 0;
        if (horas > 48 && horas < 49) {
            pago = 40 * valor + 2 * (horas - 40) * valor;
        }
        if (horas > 48) {
            pago = 40 * valor + 16 * valor + 3 * (horas - 48) * valor;
        } else {
            pago = horas * valor;
        }
        return pago;

    }

    public static void main(String[] args) {

        Scanner flujoEntrada = new Scanner(System.in);
        String nombre = null;
        int numeroHoras = 0;
        double valorHora = 0;
        double totalSalario = 0;
        

        System.out.println("Nombre");
        nombre = flujoEntrada.next();

        System.out.println("Horas");
        numeroHoras = flujoEntrada.nextInt();

        System.out.println("Valor");
        valorHora = flujoEntrada.nextDouble();
        
        totalSalario = pagoSalario(numeroHoras, valorHora);
        System.out.println("Nombre: " + nombre + "  "  + "Salario = " + totalSalario);
    }

}
