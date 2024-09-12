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
public class EstimuloAcademico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese el promedio del alumno: ");
        double promedio = scanner.nextDouble();

        System.out.print("Ingrese el número de materias reprobadas: ");
        int materiasReprobadas = scanner.nextInt();

        System.out.print("Ingrese el tipo de alumno (T para tecnología, P para profesional): ");
        char tipoAlumno = scanner.next().charAt(0);

        // Variables
        int creditos = 0;
        double descuento = 0;
        double valorPorCincoCreditos = 0;
        
        // Determinación del número de créditos y descuento para alumnos de tecnología
        if (tipoAlumno == 'T') {
            valorPorCincoCreditos = 18000; // Costo por 5 créditos para tecnología
            if (promedio >= 9.5) {
                creditos = 55;
                descuento = 0.25;
            } else if (promedio >= 9 && promedio < 9.5) {
                creditos = 50;
                descuento = 0.10;
            } else if (promedio > 7 && promedio < 9) {
                creditos = 50;
                descuento = 0;
            } else if (promedio <= 7 && materiasReprobadas <= 3) {
                creditos = 45;
                descuento = 0;
            } else if (promedio <= 7 && materiasReprobadas >= 4) {
                creditos = 40;
                descuento = 0;
            }
        }
        
        // Determinación del número de créditos y descuento para alumnos profesionales
        else if (tipoAlumno == 'P') {
            valorPorCincoCreditos = 30000; // Costo por 5 créditos para profesional
            if (promedio >= 9.5) {
                creditos = 55;
                descuento = 0.20;
            } else {
                creditos = 55;
                descuento = 0;
            }
        } else {
            System.out.println("Tipo de alumno no válido.");
            scanner.close();
            return;
        }

        // Cálculo del total a pagar
        double totalCreditos = (creditos / 5.0) * valorPorCincoCreditos;
        double totalConDescuento = totalCreditos * (1 - descuento);

        // Resultados
        System.out.println("El alumno cursará " + creditos + " créditos.");
        System.out.println("El descuento aplicado es del " + (descuento * 100) + "%.");
        System.out.println("El total a pagar es: $" + totalConDescuento);

        scanner.close();
    }
}
