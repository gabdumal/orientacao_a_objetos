/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.devgabmal.questao01;

/**
 *
 * @author devgabmal
 */
public class Tabuleiro {

    private final int ordem;
    private int x, y;

    public Tabuleiro(int ordem) {
        this.ordem = ordem;
        this.x = this.y = 0;
    }

    public boolean movimentar(Movimento movimento) {
        switch (movimento.getDirecao()) {
            case 'd':
                this.x += movimento.getDeslocamento();
                break;
            case 'e':
                this.x -= movimento.getDeslocamento();
                break;
            case 'b':
                this.y += movimento.getDeslocamento();
                break;
            case 'c':
                this.y -= movimento.getDeslocamento();
                break;
        }

        return (this.verificaIndice(this.x) && this.verificaIndice(this.y));
    }

    public double deslocamentoRelativo() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    public void imprime() {
        for (int i = 0; i < this.ordem; i++) {
            for (int j = 0; j < this.ordem; j++) {
                if (i == this.y && j == this.x) {
                    System.out.print("J ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public void imprimePosicao() {
        System.out.print("(" + this.x + ", " + this.y + ")");
    }

    private boolean verificaIndice(int indice) {
        return (indice >= 0 && indice < this.ordem);
    }

}
