package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Taller de logica
        // Primer punto


        //Informacion del cliente
        System.out.print("Ingrese su nombre:");
        String nombre = scanner.next();

        System.out.print("Ingrese sus apellidos:");
        String apellidos = scanner.next();

        System.out.print("Ingrese su edad:");
        int edad = scanner.nextInt();

        System.out.print("Ingrese el númemros de usos en el ultimo mes:");
        int usosTarjeta = scanner.nextInt();

        System.out.print("Ingrese el monto de compras de productos de aseo comprados con la tarjeta:");
        Double productoAseos = scanner.nextDouble();

        System.out.print("Ingrese el monto de compras de productos alimenticios comprados con la tarjeta:");
        Double productosAlimenticios = scanner.nextDouble();

        System.out.print("Ingrese el monto  de otros productos comprados con la tarjeta:");
        Double otrosProductos = scanner.nextDouble();

        //Calcular el totoal
        Double deudaTotal = productoAseos + productosAlimenticios + otrosProductos;

        //Descuento según el pntaje de credito
        System.out.print("Ingrese su puntaje de Credito (Del 1 - 9):");
        int puntajeCredito = scanner.nextInt();

        Double auxilio = 0.0;
        if (puntajeCredito == 1) {
            auxilio = deudaTotal * 0.25;
        } else if (puntajeCredito == 2) {
            auxilio = deudaTotal * 0.20;
        } else if (puntajeCredito == 3) {
            auxilio = deudaTotal * 0.15;
        } else if (puntajeCredito == 4) {
            auxilio = deudaTotal * 0.10;
        }


        // Calcular monto a pagar
        Double montoAPagar = deudaTotal - auxilio;

        //Presentar infomación al usuario
        System.out.print("Resumen de beneficios:");
        System.out.print("Nombre:" + nombre + apellidos);
        System.out.print("Total deuda: $" + deudaTotal);

        if (auxilio > 0) {
            System.out.print("Auxilio aplicado: $" + auxilio);
            System.out.print("Momto a pagar despues del decuento; $" + montoAPagar);
        } else {
            System.out.print("Su puntaje de credito no es aecuado para el beneficio.");
            System.out.print("Monto a pagar: $" + montoAPagar);
        }


        // Taller de logica
        // SEgundo punto

        System.out.print("Ingrese su cedula ");
        String cedulaComprador = scanner.next();

        System.out.print("Ingrese su nombre completo:");
        String nombreCompelto = scanner.next();

        System.out.print("Ingrese su edad:");
        int edadComprador = scanner.nextInt();

        // verificar Edad => 18
        if (edadComprador < 18) {
            System.out.println("Lo sentimos, el comprador debe ser ayor de 18 años para comprar las boletas");
        }
        System.out.print("Ingrese su ciudad");
        String ciudad = scanner.next();

        System.out.print("Ingrese número de boletas:");
        int numeroBoletas = scanner.nextInt();

        if (numeroBoletas > 4) {
            System.out.println("Lo sentimos, no se puede comprar más de 4 boletas.");
        }

        //Costo total
        int costoIndividual = 45000;
        int costoTotal = numeroBoletas + costoIndividual;

        //Resultado
        System.out.println("Resumen de la compra:");

        System.out.println("Nombre del comprador:" + nombreCompelto);

        System.out.println("Ciudad del comprador:" +ciudad);

        System.out.println("Número de boletas compradas" + numeroBoletas);

        System.out.println("Costo total de la compra: $" + costoTotal);








    }
}