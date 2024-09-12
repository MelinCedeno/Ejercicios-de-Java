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
public class ClasificacionJubilacion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese la edad de la persona: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese la antigüedad en el empleo (en años): ");
        int antiguedad = scanner.nextInt();

        // Condicionales para clasificar el tipo de jubilación
        if (edad >= 60 && antiguedad < 25) {
            System.out.println("La persona se jubilará por edad.");
        } else if (edad < 60 && antiguedad >= 25) {
            System.out.println("La persona se jubilará por antigüedad joven.");
        } else if (edad >= 60 && antiguedad >= 25) {
            System.out.println("La persona se jubilará por antigüedad adulta.");
        } else {
            System.out.println("La persona no cumple con los requisitos para jubilarse.");
        }

        scanner.close();
    }
}
