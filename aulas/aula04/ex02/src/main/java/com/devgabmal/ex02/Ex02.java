/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.devgabmal.ex02;

import java.util.Scanner;

/**
 *
 * @author cgmal
 */
public class Ex02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double memoria = 0;
        int cmd = 0;

        do {
            System.out.println("Estado da memória: " + memoria);
            exibeOpcoes();
            cmd = Integer.parseInt(teclado.nextLine());

            if (cmd == 5) {
                memoria = 0;
            } else if (cmd != 6) {
                System.out.print("Digite um valor: ");
                double valor = Double.parseDouble(teclado.nextLine());
                memoria = calcula(cmd, memoria, valor);
            }
            System.out.println("=====");
        } while (cmd != 6);
    }

    public static void exibeOpcoes() {
        System.out.println("Opções:\n");
        System.out.println("(1) Somar");
        System.out.println("(2) Subtrair");
        System.out.println("(3) Multiplicar");
        System.out.println("(4) Dividir");
        System.out.println("(5) Limpar memória");
        System.out.println("(6) Sair do programa");
        System.out.println("\nQual opção você deseja?");
    }

    public static double calcula(int cmd, double memoria, double valor) {
        switch (cmd) {
            case 1:
                return memoria + valor;
            case 2:
                return memoria - valor;
            case 3:
                return memoria * valor;
            case 4:
                return memoria / (double) valor;
            default:
                return 0;
        }
    }
}
