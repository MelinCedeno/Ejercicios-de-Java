/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosRepositorio;

import java.util.Scanner;

/**
 *
 * @author Melin
 */
public class PlanificacionFinanciera {

    public static void main(String[] args) {
        // Entrada del capital actual
        try (Scanner scanner = new Scanner(System.in)) {
            // Entrada del capital actual
            System.out.print("Ingrese el capital actual: U$");
            double capitalActual = scanner.nextDouble();
            
            // Inicialización del préstamo y el nuevo saldo
            double prestamo = 0;
            double nuevoSaldo = capitalActual;
            
            // Condicionales para decidir el préstamo
            if (capitalActual < 0) {
                prestamo = 10000 - capitalActual;  // Préstamo para alcanzar U$10.000
                nuevoSaldo = 10000;
            } else if (capitalActual >= 0 && capitalActual < 20000) {
                prestamo = 20000 - capitalActual;  // Préstamo para alcanzar U$20.000
                nuevoSaldo = 20000;
            } else {
                prestamo = 0;  // No se necesita préstamo
                nuevoSaldo = capitalActual;
            }
            
            // Distribución del presupuesto
            double equipoComputo = 5000;
            double mobiliario = 2000;
            double restante = nuevoSaldo - (equipoComputo + mobiliario);
            
            // Verificación si hay saldo suficiente para distribuir el resto
            if (restante < 0) {
                System.out.println("No hay suficiente presupuesto para distribuir después de cubrir equipo de computo y mobiliario.");
            } else {
                double insumos = restante / 2;
                double incentivos = restante / 2;
                
                // Resultados
                if (prestamo > 0) {
                    System.out.println("Se solicitó un préstamo de: U$" + prestamo);
                } else {
                    System.out.println("No se solicitó ningún préstamo.");
                }
                
                System.out.println("Distribución del presupuesto:");
                System.out.println("Equipo de computo: U$" + equipoComputo);
                System.out.println("Mobiliario: U$" + mobiliario);
                System.out.println("Compra de insumos: U$" + insumos);
                System.out.println("Incentivos al personal: U$" + incentivos);
            }
        }
    }
}
