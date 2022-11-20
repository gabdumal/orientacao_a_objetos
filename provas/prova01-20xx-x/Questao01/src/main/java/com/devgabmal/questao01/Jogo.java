/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.devgabmal.questao01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author devgabmal
 * @time 54 minutos e 25 segundos
 */
public class Jogo {

    public static void main(String[] args) {
        Tabuleiro tabuleiro;
        int quantidadeMovimentos;
        List<Movimento> listaMovimentos = new ArrayList<Movimento>();

        Scanner teclado = new Scanner(System.in);
        char entrada;

        System.out.println("Digite a dimensao do tabuleiro:");
        entrada = teclado.next().charAt(0);
        tabuleiro = new Tabuleiro(Character.getNumericValue(entrada));

        System.out.println("Digite a quantidade de movimentos:");
        entrada = teclado.next().charAt(0);
        quantidadeMovimentos = Character.getNumericValue(entrada);

        for (int i = 0; i < quantidadeMovimentos; i++) {
            char direcao;
            int deslocamento;

            System.out.println("Movimento " + (i + 1));
            System.out.println("Digite a direcao do movimento (d, e, c ou b):");
            direcao = teclado.next().charAt(0);

            System.out.println("Digite o deslocamento do movimento:");
            deslocamento = Character.getNumericValue(teclado.next().charAt(0));

            Movimento movimento = new Movimento(direcao, deslocamento);
            listaMovimentos.add(movimento);
        }
        System.out.println("\n== SIMULACAO ==");

        for (Movimento movimento : listaMovimentos) {
            if (tabuleiro.movimentar(movimento)) {

                System.out.println("Movimento (" + movimento.getDirecao()
                        + ", " + movimento.getDeslocamento() + ")");
                tabuleiro.imprime();
                System.out.print("Posicao atual: ");
                tabuleiro.imprimePosicao();
                System.out.println("\nDeslocamento relativo: "
                        + tabuleiro.deslocamentoRelativo());
            } else {
                System.out.print("Posicao atual: ");
                tabuleiro.imprimePosicao();
                System.out.println("\nPersonagem saiu do tabuleiro!\n"
                        + "Fim de jogo!");
                break;
            }
        }
    }
}
