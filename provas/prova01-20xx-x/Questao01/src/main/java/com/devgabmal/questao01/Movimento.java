/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.devgabmal.questao01;

/**
 *
 * @author devgabmal
 */
public class Movimento {

    private char direcao;
    private int deslocamento;

    public Movimento(char direcao, int deslocamento) {
        this.direcao = direcao;
        this.deslocamento = deslocamento;
    }

    public char getDirecao() {
        return direcao;
    }

    public int getDeslocamento() {
        return deslocamento;
    }

}
