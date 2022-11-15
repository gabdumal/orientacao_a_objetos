/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.devgabmal.lista02;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;

/**
 *
 * @author devgabmal
 * @time 21 minutos e 43 segundos
 */
public class Lista02 {

    private static void auxImprimeSequencia(int num1, int num2, int limite) {
        if (limite == 0) {
            return;
        }
        int num3 = num2 + 2 * num1;
        System.out.print(" " + num3);
        Lista02.auxImprimeSequencia(num2, num3, limite - 1);
    }

    private static void imprimeSequencia(int num1, int num2) {
        System.out.print(num1 + " " + num2);
        Lista02.auxImprimeSequencia(num1, num2, 8);
    }

    public static void main(String[] args) {
        JSpinner campoNumero1 = new JSpinner();
        JSpinner campoNumero2 = new JSpinner();

        JPanel painel = new JPanel();
        painel.add(campoNumero1);
        painel.add(campoNumero2);

        int resposta = JOptionPane.showConfirmDialog(null,
                painel, "Digite os dois primeiros números",
                JOptionPane.OK_CANCEL_OPTION);

        if (resposta == 0) {
            int num1 = (int) campoNumero1.getValue();
            int num2 = (int) campoNumero2.getValue();
            Lista02.imprimeSequencia(num1, num2);
        }
    }
}
