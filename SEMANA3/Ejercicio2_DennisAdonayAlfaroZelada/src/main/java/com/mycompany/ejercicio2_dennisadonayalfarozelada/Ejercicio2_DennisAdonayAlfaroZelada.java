/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2_dennisadonayalfarozelada;

/**
 *
 * @author MINEDUCYT
 */

import java.util.Scanner;

public class Ejercicio2_DennisAdonayAlfaroZelada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo valor: ");
        double valor2 = scanner.nextDouble();

        double suma = valor1 + valor2;
        double resta = valor1 - valor2;
        double multiplicacion = valor1 * valor2;

        double division = 0;
        if (valor2 != 0) {
            division = valor1 / valor2;
        } else {
            System.out.println("No se puede dividir por cero.");
        }
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);

        scanner.close();
    }
}
