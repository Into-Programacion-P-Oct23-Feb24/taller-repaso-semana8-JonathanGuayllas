/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int n;
        int contador;

        System.out.println("Ingrese un valor positivo y par");
        n = entrada.nextInt();

        if ((n > 0) && (n % 2 == 0)) {
            contador = n;
            n = 0;
        while (n < contador) {
        n = n + 1;
        System.out.println(n);
        }
        } else {
            System.out.println("El número ingresado es incorrecto");
            }
        } 
    }

