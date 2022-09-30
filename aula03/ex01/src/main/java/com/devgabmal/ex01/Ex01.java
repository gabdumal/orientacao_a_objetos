/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.devgabmal.ex01;

import java.util.Scanner;

/**
 *
 * @author ice
 */
public class Ex01 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int i = 1;
        double c1x = 0, c1y = 0, c2x = 0, c2y = 0, c3x = 0, c3y = 0, entrada = 0;
        double a1 = 0, a2 = 0, a3 = 0;

        do {

            double x, y = 0;

            System.out.println("Digite a coordenada " + i + ":");
            System.out.print("X: ");
            x = teclado.nextDouble();

            System.out.print("Y: ");
            y = teclado.nextDouble();

            System.out.println("");

            switch (i) {
                case 1:
                    c1x = x;
                    c1y = y;
                    break;
                case 2:
                    c2x = x;
                    c2y = y;
                    break;
                default:
                    c3x = x;
                    c3y = y;
                    break;
            }
        } while (i++ < 3);

        i = 1;

        a1 = Math.sqrt(Math.pow(c2x - c1x, 2) + Math.pow(c2y - c1y, 2));
        a2 = Math.sqrt(Math.pow(c3x - c2x, 2) + Math.pow(c3y - c2y, 2));
        a3 = Math.sqrt(Math.pow(c3x - c1x, 2) + Math.pow(c3y - c1y, 2));

        if ((Math.abs(a2 - a1) < a3 && a2 + a1 > a3)
                || (Math.abs(a3 - a2) < a1 && a3 + a2 > a1)
                || (Math.abs(a1 - a3) < a2 && a1 + a3 > a2)) {

            if (a1 == a2 && a2 == a3) {
                System.out.println("Os lados formam um triângulo equilátero.");
            } else if (a1 == a2 || a2 == a3 || a3 == a1) {
                System.out.println("Os lados formam um triângulo isósceles.");
            } else {
                System.out.println("Os lados formam um triângulo escaleno.");
            }
        } else {
            System.out.println("Os lados não formam um triângulo.");
        }

    }
}
