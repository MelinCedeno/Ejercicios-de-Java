/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 *//**
 *
 * @author Melin Angelica Cedeño Montero, codigo: u20241219474
 */

package EjerciciosRepositorio;
import java.util.Scanner;
public class CentroAbastos{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int cantCamiones;
        double tipoServicio;
        System.out.print("Ingrese la cantidad de camiones: ");
        cantCamiones=sc.nextInt();
        double [][] datosCamiones = new double[cantCamiones][6];
        for(int c=0;c<cantCamiones;c++){
            System.out.print("Ingrese el tipo de servicio: (1 - Carga 2 - Descarga): ");
            tipoServicio=sc.nextDouble();
            datosCamiones[c][0]=tipoServicio;
            //Validar que la variable sea 1 o 2
            switch((int)tipoServicio){
                case 2:
                System.out.println("Ingrese el tipo de producto: 1-Per 2 -No Per:  ");
                datosCamiones[c][1]=sc.nextDouble();
                System.out.println("Ingrese el peso trasportado en toneladas:  ");
                datosCamiones[c][2]=sc.nextDouble();
                if(datosCamiones[c][1]==1){
                    if(datosCamiones[c][2]<8){
                        datosCamiones[c][5]=datosCamiones[c][2]*15000;                        
                    }
                    else{
                        datosCamiones[c][5]=datosCamiones[c][2]*9000;
                    }
                }else {
                    if(datosCamiones[c][2]<8){
                        datosCamiones[c][5]=60000;                        
                    }
                    else{
                        datosCamiones[c][5]=60000+(datosCamiones[c][2]-10)*7000;

                    }
                }
                case 1:
                System.out.println("Ingrese el tiempo de permanencia: ");
                datosCamiones[c][3]=sc.nextDouble();
                System.out.println("Ingrese el largo del camión:  ");
                datosCamiones[c][4]=sc.nextDouble();
            }

        }
        System.out.println("TipoS   TipoP   Peso    Tiempo  Largo   valor");
        for(int c=0;c<cantCamiones;c++){
            System.out.println("");
            for(int d=0;d<6;d++){
                System.out.print(datosCamiones[c][d]+"  ");
    }
}
    } 
    public class CentroAbastos{
    // Definimos el número máximo de vehículos que puede manejar el sistema
    static final int MAX_VEHICULOS = 100;
    // Matriz que almacena los datos de cada vehículo (tipo de servicio, producto, peso, etc.)
    static double[][] vehiculos = new double[MAX_VEHICULOS][6];
    // Contador para el número total de vehículos registrados
    static int totalVehiculos = 0;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean continuar = true;
            
            // Bucle para capturar datos de varios vehículos
            while (continuar && totalVehiculos < MAX_VEHICULOS) {
                // Llamada al método para capturar los datos del vehículo
                capturarDatos(scanner);
                
                // Pregunta si el usuario desea ingresar otro vehículo o no
                System.out.print("¿Desea ingresar otro vehículo? (s/n): ");
                continuar = scanner.next().equalsIgnoreCase("s");
            }
            
            // Una vez que se termina de ingresar vehículos, generamos el informe
            generarInforme();
        }
    }

    // Método que captura los datos de un vehículo
    public static void capturarDatos(Scanner scanner) {
        // Solicita el tipo de servicio: 1 para Cargue, 2 para Descargue
        System.out.println("Ingrese el tipo de servicio (1. Cargue, 2. Descargue): ");
        int tipoServicio = scanner.nextInt();
        
        // Solicita el tipo de producto: 1 para Perecedero, 2 para No Perecedero
        System.out.println("Ingrese el tipo de producto (1. Perecedero, 2. No perecedero): ");
        int tipoProducto = scanner.nextInt();
        
        // Solicita el peso transportado en toneladas
        System.out.println("Ingrese el peso transportado en toneladas: ");
        double pesoTransportado = scanner.nextDouble();
        
        // Solicita el tiempo de permanencia en el parqueadero en horas
        System.out.println("Ingrese el tiempo de permanencia en horas: ");
        double tiempoPermanencia = scanner.nextDouble();
        
        // Solicita el largo del camión en metros
        System.out.println("Ingrese el largo del camión en metros: ");
        double largoCamion = scanner.nextDouble();

        // Calcula el costo del parqueadero basándose en los datos ingresados
        double costoParqueadero = calcularCosto(tipoServicio, tipoProducto, pesoTransportado, tiempoPermanencia, largoCamion);

        // Almacena los datos capturados en la matriz
        vehiculos[totalVehiculos][0] = tipoServicio;
        vehiculos[totalVehiculos][1] = tipoProducto;
        vehiculos[totalVehiculos][2] = pesoTransportado;
        vehiculos[totalVehiculos][3] = tiempoPermanencia;
        vehiculos[totalVehiculos][4] = largoCamion;
        vehiculos[totalVehiculos][5] = costoParqueadero;

        // Incrementa el contador de vehículos
        totalVehiculos++;
    }

    // Método que calcula el costo del parqueadero según las reglas del ejercicio
    public static double calcularCosto(int tipoServicio, int tipoProducto, double peso, double tiempo, double largo) {
        double costo = 0;

        // Si el servicio es Descargue
        if (tipoServicio == 2) {
            // Si el producto es Perecedero
            if (tipoProducto == 1) {
                // Menos de 8 toneladas: $15,000 por tonelada, más de 8 toneladas: $9,000 por tonelada
                if (peso < 8) {
                    costo = peso * 15000;
                } else {
                    costo = peso * 9000;
                }
            } else {  // Producto no Perecedero
                // Si el peso es menor o igual a 10 toneladas: $60,000, más de 10 toneladas: $7,000 adicionales por cada tonelada extra
                if (peso <= 10) {
                    costo = 60000;
                } else {
                    costo = 60000 + (peso - 10) * 7000;
                }
            }
        }
        // Si el servicio es Cargue
        else if (tipoServicio == 1) {
            // Las primeras 2 horas son gratis, luego se cobra $4,000 por cada hora adicional
            if (tiempo > 2) {
                costo = (tiempo - 2) * 4000;
                // Si el camión mide más de 4 metros, se aplica un incremento del 25%
                if (largo > 4) {
                    costo += costo * 0.25;
                }
            }
        }

        return costo;
    }

    // Método que genera un informe con las estadísticas de todos los vehículos registrados
    public static void generarInforme() {
        double totalCargue = 0, totalDescargue = 0;
        int countCargue = 0, countDescargue = 0;
        int menosDeDosHoras = 0;

        // Recorre la matriz de vehículos para sumar los costos y contar los tipos de vehículos
        for (int i = 0; i < totalVehiculos; i++) {
            int tipoServicio = (int) vehiculos[i][0];
            double costo = vehiculos[i][5];
            double tiempoPermanencia = vehiculos[i][3];

            // Suma el costo y cuenta los vehículos según el tipo de servicio (Cargue o Descargue)
            if (tipoServicio == 1) {
                totalCargue += costo;
                countCargue++;
            } else {
                totalDescargue += costo;
                countDescargue++;
            }

            // Cuenta cuántos vehículos permanecieron menos de 2 horas
            if (tiempoPermanencia < 2) {
                menosDeDosHoras++;
            }
        }

        // Imprime el informe con los datos promedio y las estadísticas
        System.out.println("Informe del día:");
        System.out.println("Promedio costo Cargue: " + (countCargue > 0 ? totalCargue / countCargue : 0));
        System.out.println("Promedio costo Descargue: " + (countDescargue > 0 ? totalDescargue / countDescargue : 0));
        System.out.println("Vehículos que duraron menos de dos horas: " + menosDeDosHoras);
    }
    }}
