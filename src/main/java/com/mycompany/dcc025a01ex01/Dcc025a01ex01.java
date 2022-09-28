/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.dcc025a01ex01;

import java.util.Scanner;

/**
 *
 * @author ice
 */
public class Dcc025a01ex01 {

    public static void main(String[] args) {
        System.out.println("Digite um valor em centavos: ");
        Scanner teclado = new Scanner(System.in);
        int valorTotal = teclado.nextInt();

        System.out.println("O valor digitado pode ser dividido em:");

        int divisao = valorTotal / 100;
        System.out.println(divisao + " moedas de 1 real");

        valorTotal = valorTotal % 100;
        divisao = valorTotal / 50;
        System.out.println(divisao + " moedas de 50 centavos");

        valorTotal = valorTotal % 50;
        divisao = valorTotal / 25;
        System.out.println(divisao + " moedas de 25 centavos");

        valorTotal = valorTotal % 25;
        divisao = valorTotal / 10;
        System.out.println(divisao + " moedas de 10 centavos");

        valorTotal = valorTotal % 10;
        divisao = valorTotal / 5;
        System.out.println(divisao + " moedas de 5 centavos");

        divisao = valorTotal % 5;
        System.out.println(divisao + " moedas de 1 centavo");

    }
}
