/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package br.ufjf.dcc.dcc025.prova1questao1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author devgabmal
 */
public class Prova1Questao1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String rotaEntrada;

        System.out.println("Digite uma rota para a ambulancia");
        rotaEntrada = teclado.nextLine().toUpperCase();

        Rota rota = new Rota(rotaEntrada);
        if (rota.ehValida()) {
            List<Ponto> listaPontos = rota.extraiPontos();

            System.out.println("Pontos da rota:");

            for (int i = 0; i < listaPontos.size(); i++) {
                System.out.print("P" + i + " - ");
                listaPontos.get(i).imprimePonto();
                System.out.println();
            }

            Mapa mapa = new Mapa(listaPontos);
            mapa.imprime();

            System.out.print("Rota original:\t");
            System.out.print(rota.getCoordenadas());
            System.out.println(" - Deslocamento: " + rota.deslocamentoTotal());

            rota.rotaOtimizada();
            System.out.print("Rota otimizada:\t");
            System.out.print(rota.getCoordenadas());
            System.out.println(" - Deslocamento: " + rota.deslocamentoTotal());

        } else {
            System.out.println("Rota invalida!");
        }
    }
}
