/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5_dennisadonayalfarozelada;

/**
 *
 * @author MINEDUCYT
 */

import java.util.Scanner;

public class Ejercicio5_DennisAdonayAlfaroZelada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio de la circunferencia: ");
        double radio = scanner.nextDouble();

        double pi = 3.141592653;
        double area = pi * radio * radio;
        double volumen = (4.0 / 3.0) * pi * Math.pow(radio, 3);

        System.out.println("El área de la circunferencia es: " + area);
        System.out.println("El volumen de la circunferencia es: " + volumen);

        scanner.close();
    }
}

