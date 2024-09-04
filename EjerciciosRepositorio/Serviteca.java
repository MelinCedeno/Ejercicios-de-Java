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
public class Serviteca {
    public static void main(String[] args) {
        double precioPorLlanta = 0.0;
        try (
                Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese la cantidad de llantas que desea comprar: ");
            int cantidadLlantas = scanner.nextInt();
            if (cantidadLlantas < 5) {
                precioPorLlanta = 100.0;
            } else if (cantidadLlantas >= 5 && cantidadLlantas <= 10) {
                precioPorLlanta = 75.0;
            } else if (cantidadLlantas > 10) {
                precioPorLlanta = 50.0;
            }
            double totalAPagar = cantidadLlantas * precioPorLlanta;
            System.out.println("Precio por cada llanta: U$" + precioPorLlanta);
            System.out.println("Total a pagar por la compra: U$" + totalAPagar);
        }
    }
}
