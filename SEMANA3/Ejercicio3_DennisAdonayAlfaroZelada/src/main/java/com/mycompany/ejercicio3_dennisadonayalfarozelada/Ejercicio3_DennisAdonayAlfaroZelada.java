/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3_dennisadonayalfarozelada;

/**
 *
 * @author MINEDUCYT
 */

import java.util.Scanner;

public class Ejercicio3_DennisAdonayAlfaroZelada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Ingrese el tercer número: ");
        double numero3 = scanner.nextDouble();

        double mayor = numero1;

        if (numero2 > mayor) {
            mayor = numero2;
        }

        if (numero3 > mayor) {
            mayor = numero3;
        }

        System.out.println("El mayor número es: " + mayor);

        scanner.close();
    }
}
