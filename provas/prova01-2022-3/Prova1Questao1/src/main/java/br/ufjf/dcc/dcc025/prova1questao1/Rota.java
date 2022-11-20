/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufjf.dcc.dcc025.prova1questao1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author devgabmal
 */
public class Rota {

    private String coordenadas;

    public Rota(String coordenadas) {
        this.coordenadas = coordenadas;
    }

    public String getCoordenadas() {
        return coordenadas;
    }

    public boolean ehValida() {
        if (this.coordenadas.isBlank()) {
            return false;
        }

        String[] deslocamentos = this.coordenadas.split("");
        String deslocamentoAnterior = "";

        for (String deslocamento : deslocamentos) {
            if (!(deslocamento.equals("N") || deslocamento.equals("S")
                    || deslocamento.equals("L") || deslocamento.equals("O")
                    || deslocamento.equals("P"))) {
                return false;
            }
            if (deslocamento.equals("P") && deslocamentoAnterior.equals("P")) {
                return false;
            }
            deslocamentoAnterior = deslocamento;
        }
        return true;
    }

    public Rota rotaOtimizada() {
        if (this.ehValida()) {

            String novaRota = "";

            String[] subRotas = this.coordenadas.split("P");

            for (String subRota : subRotas) {
                int[] posicaoGeografica = Rota.calculaPosicaoGeografica(subRota, 0, 0);

                int eixoX = posicaoGeografica[0];
                int eixoY = posicaoGeografica[1];

                String novaSubRota = "";
                String direcaoY = eixoY > 0 ? "N" : "S";
                novaSubRota += Rota.criaDeslocamentoContinuo(Math.abs(eixoY), direcaoY);
                String direcaoX = eixoX > 0 ? "L" : "O";
                novaSubRota += Rota.criaDeslocamentoContinuo(Math.abs(eixoX), direcaoX);
                novaSubRota += "P";

                novaRota += novaSubRota;
            }

            this.coordenadas = novaRota;
        } else {
            this.coordenadas = "";
        }

        return this;
    }

    private static int[] calculaPosicaoGeografica(String subRota, int eixoX, int eixoY) {

        String[] deslocamentos = subRota.split("");

        for (String deslocamento : deslocamentos) {
            switch (deslocamento) {
                case "N":
                    eixoY++;
                    break;
                case "S":
                    eixoY--;
                    break;
                case "L":
                    eixoX++;
                    break;
                case "O":
                    eixoX--;
                    break;
            }
        }

        int[] posicaoGeografica = {eixoX, eixoY};
        return posicaoGeografica;

    }

    private static String criaDeslocamentoContinuo(int distancia, String direcao) {
        String deslocamento = "";
        for (int i = 0; i < distancia; i++) {
            deslocamento += direcao;
        }
        return deslocamento;
    }

    public int deslocamentoTotal() {
        String deslocamentos = this.coordenadas.replaceAll("P", "");
        return deslocamentos.length();
    }

    public List<Ponto> extraiPontos() {
        int xAtual = 0;
        int yAtual = 0;

        String[] subRotas = this.coordenadas.split("P");

        List<Ponto> listaPontos = new ArrayList<Ponto>();

        for (String subRota : subRotas) {
            int[] posicaoGeografica = Rota.calculaPosicaoGeografica(subRota, xAtual, yAtual);

            xAtual = posicaoGeografica[0];
            yAtual = posicaoGeografica[1];

            Ponto pontoAtual = new Ponto(xAtual, yAtual);
            listaPontos.add(pontoAtual);
        }

        return listaPontos;
    }

}
