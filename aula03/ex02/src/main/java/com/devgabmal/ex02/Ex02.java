/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.devgabmal.ex02;

import java.util.Scanner;

/**
 *
 * @author ice
 */
public class Ex02 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int valor = 0;
        String divisores = "", cmd = "Y";

        do {

            System.out.print("Digite um numero inteiro: ");
            valor = teclado.nextInt();
            teclado.nextLine();

            for (int i = 2; i <= valor / 2; i++) {
                if (valor % i == 0) {
                    divisores += i + ", ";
                }
            }

            if (divisores.isEmpty()) {
                System.out.println("O numero " + valor + " eh primo.");
            } else {
                System.out.println("O numero " + valor + " tem os seguintes divisores:");
                System.out.println("1, " + divisores + valor);
            }

            do {
                System.out.print("Deseja analisar outro numero? [Y/n] ");
                cmd = teclado.nextLine();
            } while (cmd != "Y" && cmd != "y" && cmd != "N" && cmd != "n");

        } while (cmd == "Y" && cmd == "y");
    }
}
