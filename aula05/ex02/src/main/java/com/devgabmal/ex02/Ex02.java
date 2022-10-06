/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.devgabmal.ex02;

import javax.swing.JOptionPane;

/**
 *
 * @author ice
 */
public class Ex02 {

    public static void main(String[] args) {
        double valor, memoria = 0;
        int opcao = 4;
        String[] options = {"(+) Soma", "(-) Subtração", "(*) Multiplicação", "(/) Divisão", "(0) Limpar memória", "(X) Sair"};

        do {
            opcao = JOptionPane.showOptionDialog(null, "Memória: " + memoria + "\nSelecione a operação:",
                    "Calculadora",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            if (opcao == 4) {
                memoria = 0;
            } else if (opcao != 5) {
                valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor:"));
                memoria = calcula(opcao, memoria, valor);
            }
        } while (opcao != 5);
    }

    private static double calcula(int opcao, double memoria, double valor) {
        switch (opcao) {
            case 0:
                return memoria + valor;
            case 1:
                return memoria - valor;
            case 2:
                return memoria * valor;
            case 3:
                return memoria / valor;
            default:
                return 0;
        }
    }
}
