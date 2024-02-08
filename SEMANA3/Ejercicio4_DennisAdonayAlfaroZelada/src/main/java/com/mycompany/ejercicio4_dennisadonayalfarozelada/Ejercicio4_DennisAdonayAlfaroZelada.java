/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4_dennisadonayalfarozelada;

/**
 *
 * @author MINEDUCYT
 */

import java.util.Scanner;

public class Ejercicio4_DennisAdonayAlfaroZelada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor del lado L: ");
        double ladoL = scanner.nextDouble();

        System.out.print("Ingrese el valor del lado W: ");
        double ladoW = scanner.nextDouble();

        double perimetro = 2 * ladoL + 2 * ladoW;
        double area = ladoL * ladoW;

        System.out.println("El perímetro del rectángulo es: " + perimetro);
        System.out.println("El área del rectángulo es: " + area);

        scanner.close();
    }
}
