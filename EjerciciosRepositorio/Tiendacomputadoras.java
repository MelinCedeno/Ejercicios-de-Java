/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosRepositorio;

import java.util.Scanner;

/**
 *
 * @author Melin Angelica Cedeño Montero
 */
public class Tiendacomputadoras {
    public static void main(String[] args) {
        double precioPorComputadora = 500.0;
        double descuento = 0.0;
        try ( 
                Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el número de computadoras a comprar: ");
            int cantidadComputadoras = scanner.nextInt();
            if (cantidadComputadoras < 5) {
                descuento = 0.10;
            } else if (cantidadComputadoras >= 5 && cantidadComputadoras < 10) {
                descuento = 0.20;
            } else if (cantidadComputadoras >= 10) {
                descuento = 0.40;
            }
            double totalSinDescuento = cantidadComputadoras * precioPorComputadora;
            double montoDescuento = totalSinDescuento * descuento;
            double totalAPagar = totalSinDescuento - montoDescuento;
            System.out.println("Total sin descuento: U$" + totalSinDescuento);
            System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
            System.out.println("Monto del descuento: U$" + montoDescuento);
            System.out.println("Total a pagar: U$" + totalAPagar);
        }
    }
}

