/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosRepositorio;

/**
 *
 * @author Melin Angelica Cedeño Montero
 */
import java.util.Scanner;

public class FruteriaManzanas {
    public static void main(String[] args) {
        double precioPorKilo = 3.0;
        double kilosComprados, descuento = 0.0, totalSinDescuento, totalConDescuento;
        try (
                Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese la cantidad de kilos de manzanas que desea comprar: ");
            kilosComprados = scanner.nextDouble();
            if (kilosComprados >= 0 && kilosComprados <= 2) {
                descuento = 0.0; 
            } else if (kilosComprados > 2 && kilosComprados <= 5) {
                descuento = 0.10; 
            } else if (kilosComprados > 5 && kilosComprados <= 10) {
                descuento = 0.15; 
            } else if (kilosComprados > 10) {
                descuento = 0.20;
            }
            totalSinDescuento = kilosComprados * precioPorKilo;
            totalConDescuento = totalSinDescuento - (totalSinDescuento * descuento);
            System.out.println("Total sin descuento: U$" + totalSinDescuento);
            System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
            System.out.println("Total a pagar: U$" + totalConDescuento);
        }
    }
}
