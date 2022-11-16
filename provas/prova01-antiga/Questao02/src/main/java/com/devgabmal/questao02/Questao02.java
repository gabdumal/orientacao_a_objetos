/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.devgabmal.questao02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author devgabmal
 * @time 14 minutos e 32 segundos
 */
public class Questao02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String abreviacao, termoCompleto, frase;
        boolean finalizar = false;

        Map<String, String> dicionarioTraducao = new HashMap<String, String>();

        do {
            System.out.println("Digite a abreviacao ou Fim para sair");
            abreviacao = teclado.nextLine();

            if (abreviacao.compareTo("Fim") == 0) {
                finalizar = true;
            } else {
                System.out.println("Digite o valor de " + abreviacao + ":");
                termoCompleto = teclado.nextLine();

                dicionarioTraducao.put(abreviacao, termoCompleto);
            }
        } while (!finalizar);

        System.out.println("Digite uma frase para ser traduzida:");
        frase = teclado.nextLine();

        System.out.println("Frase traduzida:");

        String[] palavras = frase.split(" ");

        for (String palavra : palavras) {
            System.out.print(
                    dicionarioTraducao.getOrDefault(
                            palavra, palavra) + " ");
        }

    }
}
