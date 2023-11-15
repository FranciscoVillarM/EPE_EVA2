package epe2_francisco_villar;

import java.util.Scanner;
// Esta es el main donde se podran ingresar los datos por consola mediante Scanner
public class EPE2_Francisco_Villar {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        // Escribir la información del usuario
        System.out.println("Ingrese los datos del cliente:");
        System.out.print("Nombre: ");
        String nombreCliente = scanner.nextLine();

        System.out.print("Apellidos: ");
        String apellidosCliente = scanner.nextLine();

        System.out.print("Edad: ");
        int edadCliente = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        System.out.print("RUT: ");
        String rutCliente = scanner.nextLine();

        System.out.println("\nIngrese los datos de la empresa:");
        System.out.print("Nombre de la empresa: ");
        String nombreEmpresa = scanner.nextLine();

        System.out.print("RUT de la empresa: ");
        String rutEmpresa = scanner.nextLine();

        System.out.print("Giro de la empresa: ");
        String giroEmpresa = scanner.nextLine();

        System.out.println("\nIngrese los datos de ventas:");
        System.out.print("Total de ventas: ");
        int totalVentas = scanner.nextInt();

        System.out.print("Monto en dinero de las ventas: ");
        double montoVentas = scanner.nextDouble();

        // Esto crea instancias de las clases y pasa la información
        DatosFactura datosFactura = new DatosFactura(nombreCliente, apellidosCliente, edadCliente, rutCliente,
                nombreEmpresa, rutEmpresa, giroEmpresa, totalVentas, montoVentas);
        Ventas ventas = new Ventas(totalVentas, montoVentas);

        // Realizar operaciones necesarias
        datosFactura.calcularIVA();
        datosFactura.calcularUtilidades();
    }
}




