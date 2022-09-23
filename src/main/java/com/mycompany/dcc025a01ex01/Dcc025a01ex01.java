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
        System.out.println(valorTotal);
    }
}
