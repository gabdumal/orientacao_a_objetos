/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package br.ufjf.dcc.dcc025.prova1questao2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 *  * @author devgabmal
 */
public class Prova1Questao2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String frase;

        System.out.println("Digite um texto de apenas uma linha:");
        frase = teclado.nextLine();

        Map<String, Integer> quantidadesLetras = new HashMap<String, Integer>();

        String[] caracteres = frase.split("");

        for (String caractere : caracteres) {
            int quantidade = quantidadesLetras.getOrDefault(caractere, 0);
            quantidadesLetras.put(caractere, quantidade + 1);
        }

        for (Map.Entry<String, Integer> registro : quantidadesLetras.entrySet()) {
            String caractere = registro.getKey();
            int quantidade = registro.getValue();

            System.out.println(caractere + " ===> " + quantidade);
        }

    }
}
