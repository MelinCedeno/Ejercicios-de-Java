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
public class AnemiaDetector {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada de los datos
        System.out.print("Ingrese la edad de la persona (en meses o años): ");
        double edad = scanner.nextDouble();
        
        System.out.print("Ingrese el nivel de hemoglobina (g%): ");
        double hemoglobina = scanner.nextDouble();
        
        System.out.print("Ingrese el sexo (M para masculino, F para femenino): ");
        char sexo = scanner.next().charAt(0);
        
        // Variables para los límites de hemoglobina según la tabla
        double minHemoglobina = 0;
        double maxHemoglobina = 0;

        // Condicionales para determinar los rangos según la edad y el sexo
        if (edad <= 1) {
            minHemoglobina = 13;
            maxHemoglobina = 26;
        } else if (edad > 1 && edad <= 6) {
            minHemoglobina = 10;
            maxHemoglobina = 18;
        } else if (edad > 6 && edad <= 12) {
            minHemoglobina = 11;
            maxHemoglobina = 15;
        } else if (edad > 12 && edad <= 60) { // 1 a 5 años
            minHemoglobina = 11.5;
            maxHemoglobina = 15;
        } else if (edad > 60 && edad <= 120) { // 5 a 10 años
            minHemoglobina = 12.6;
            maxHemoglobina = 15.5;
        } else if (edad > 120 && edad <= 180) { // 10 a 15 años
            minHemoglobina = 13;
            maxHemoglobina = 15.5;
        } else if (edad > 180 && sexo == 'F') { // Mujeres > 15 años
            minHemoglobina = 12;
            maxHemoglobina = 16;
        } else if (edad > 180 && sexo == 'M') { // Hombres > 15 años
            minHemoglobina = 14;
            maxHemoglobina = 18;
        } else {
            System.out.println("Edad no válida.");
            scanner.close();
            return;
        }
        
        // Verificación del nivel de hemoglobina
        if (hemoglobina < minHemoglobina) {
            System.out.println("Resultado: Positivo para anemia.");
        } else if (hemoglobina >= minHemoglobina && hemoglobina <= maxHemoglobina) {
            System.out.println("Resultado: Negativo para anemia.");
        } else {
            System.out.println("Resultado: Negativo para anemia (hemoglobina alta).");
        }

        scanner.close();
    }
}
