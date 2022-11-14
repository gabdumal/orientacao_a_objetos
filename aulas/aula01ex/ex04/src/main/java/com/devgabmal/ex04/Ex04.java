/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.devgabmal.ex04;

import javax.swing.JOptionPane;

/**
 *
 * @author ice
 */
public class Ex04 {

    private static String auxFibonacci(int iteracao, int penultimo, int ultimo) {
        if (iteracao == 0) {
            return (ultimo + penultimo) + ", ";
        } else {
            return (ultimo + penultimo) + ", " + auxFibonacci(iteracao - 1, ultimo, ultimo + penultimo);
        }
    }

    private static String fibonacci(int limite) {
        String sequencia = "1, 1, ";
        sequencia += auxFibonacci(limite - 3, 1, 1);
        return sequencia.substring(0, sequencia.length() - 2);
    }

    public static void main(String[] args) {
        int limite = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite quantos itens da sequência de Fibonacci deseja calcular:"));
        JOptionPane.showMessageDialog(null, fibonacci(limite));

    }
}
