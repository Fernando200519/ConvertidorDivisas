package main;

import convertidor.convertidorDivisas;
import modelo.Divisa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char opcion;
        int opcionOrigen, opcionDestino;
        double cantidad;

        convertidorDivisas convertidor = new convertidorDivisas();

        do {
            // Menú de divisas
            System.out.println("1. USD");
            System.out.println("2. MXN");
            System.out.println("3. EUR");
            System.out.println("4. JPY");
            System.out.println("5. GBP");

            System.out.print("Seleccione la divisa origen: ");
            opcionOrigen = entrada.nextInt();

            System.out.print("Seleccione la divisa destino: ");
            opcionDestino = entrada.nextInt();

            System.out.print("Seleccione la cantidad a convertir: ");
            cantidad = entrada.nextDouble();

            // Obtener las divisas seleccionadas
            Divisa divisaOrigen = Divisa.values()[opcionOrigen - 1];
            Divisa divisaDestino = Divisa.values()[opcionDestino - 1];

            // Convertir la cantidad a USD
            double cantidadEnUSD = convertidor.convertirADolar(cantidad, divisaOrigen);

            // Convertir de USD a la divisa destino
            double resultado = convertidor.convertirDeDolar(cantidadEnUSD, divisaDestino);

            // Mostrar el resultado
            System.out.printf("%.2f %s son %.2f %s\n", cantidad, convertidor.obtenerNombreDivisa(divisaOrigen), resultado, convertidor.obtenerNombreDivisa(divisaDestino));

            System.out.print("¿Desea realizar otra conversión (s/n)? ");
            opcion = entrada.next().charAt(0);

        } while (opcion != 'n' && opcion != 'N');

        entrada.close();
    }
}

