/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufjf.dcc.dcc025.prova1questao1;

/**
 *
 * @author devgabmal
 */
public class Ponto {

    private final int x, y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void imprimePonto() {
        System.out.print("(" + this.x + ", " + this.y + ")");
    }

}
