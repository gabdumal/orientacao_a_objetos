/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.devgabmal.lista01;

import java.util.Scanner;

/**
 *
 * @author devgabmal
 * @time 11 minutos e 31 segundos
 */
public class Lista01 {

    private static double capturaTamanho(String mensagem) {
        Scanner teclado = new Scanner(System.in);
        String entrada = "";
        System.out.print(mensagem + " (cm): ");
        entrada = teclado.nextLine();
        return Double.parseDouble(entrada) / 100;
    }

    public static void main(String[] args) {
        double perimetro = 0;

        perimetro += Lista01.capturaTamanho("Altura") * 2;
        perimetro += Lista01.capturaTamanho("Largura") * 2;

        System.out.println("O perimetro e " + perimetro + "m");
    }
}
