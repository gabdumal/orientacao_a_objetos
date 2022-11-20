/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufjf.dcc.dcc025.prova1questao1;

import java.util.List;

/**
 *
 * @author devgabmal
 */
public class Mapa {

    private List<Ponto> listaPontos;
    private int xMax, xMin;
    private int yMax, yMin;

    public Mapa(List<Ponto> listaPontos) {
        this.listaPontos = listaPontos;

        this.xMax = this.xMin = yMax = yMin = 0;
        this.defineTamanho();
    }

    private void defineTamanho() {
        for (Ponto ponto : listaPontos) {
            int xPonto = ponto.getX();
            int yPonto = ponto.getY();

            if (xPonto > this.xMax) {
                this.xMax = xPonto;
            } else if (xPonto < this.xMin) {
                this.xMin = xPonto;
            }
            if (yPonto > this.yMax) {
                this.yMax = yPonto;
            } else if (yPonto < this.yMin) {
                this.yMin = yPonto;
            }
        }
    }

    public void imprime() {
        for (int i = yMax; i >= yMin; i--) {
            for (int j = xMin; j <= xMax; j++) {
                if (i == 0 && j == 0) {
                    System.out.print("HO ");
                } else {
                    boolean encontrouPonto = false;
                    for (int k = 0; k < this.listaPontos.size() && !encontrouPonto; k++) {
                        if (this.listaPontos.get(k).getX() == j
                                && this.listaPontos.get(k).getY() == i) {
                            System.out.print("P" + k + " ");
                            encontrouPonto = true;
                        }
                    }
                    if (!encontrouPonto) {
                        System.out.print("** ");
                    }
                }
            }
            System.out.println();
        }
    }

}
