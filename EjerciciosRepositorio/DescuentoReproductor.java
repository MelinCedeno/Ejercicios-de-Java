/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosRepositorio;

/**
 *
 * @author Melin Angelica Cedeño Monteto
 */
import java.util.Scanner;
public class DescuentoReproductor {
    public static void main(String[] args) {
        double iva = 0.19;
        double descuentoPorPrecio = 0.10;
        double descuentoPorMarca = 0.05;
        double precioBase, precioConDescuento, totalAPagar;
        String marca;
        try (
                Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el precio del aparato: U$");
            precioBase = scanner.nextDouble();
            System.out.print("Ingrese la marca del aparato: ");
            marca = scanner.next();
            if (precioBase >= 500) {
                precioBase -= precioBase * descuentoPorPrecio;
            }
            if (marca.equalsIgnoreCase("NOSY")) {
                precioBase -= precioBase * descuentoPorMarca;
            }
            precioConDescuento = precioBase;
            totalAPagar = precioConDescuento + (precioConDescuento * iva);
            System.out.println("Precio con descuentos aplicados: U$" + precioConDescuento);
            System.out.println("Total a pagar (incluyendo IVA): U$" + totalAPagar);
        }
    }
}

