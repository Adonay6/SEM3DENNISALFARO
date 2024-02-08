/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1_dennisadonayalfarozelada;

/**
 *
 * @author MINEDUCYT
 */
    import java.util.Scanner;

public class Ejercicio1_DennisAdonayAlfaroZelada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.next();

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        for (int i = 0; i < numero; i++) {
            System.out.println(palabra);
        }

        scanner.close();
    }
}

