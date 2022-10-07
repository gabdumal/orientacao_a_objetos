/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.devgabmal.ex03;

import javax.swing.JOptionPane;

/**
 *
 * @author ice
 */
public class Ex03 {

    public static void main(String[] args) {
        final int tam = 3;
        double[] listaNotaFinal = new double[tam];
        int[] listaNumFaltas = new int[tam], listaNumTarefas = new int[tam];

        for (int i = 0;
                i < tam; i++) {
            listaNotaFinal[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota final do " + (i + 1) + "º aluno:"));
            listaNumFaltas[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de faltas do " + (i + 1) + "º aluno:"));
            listaNumTarefas[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de tarefas do " + (i + 1)
                    + "º aluno:"));
        }

        for (int i = 0; i < tam; i++) {
            verificaResultado(listaNotaFinal[i], listaNumFaltas[i], listaNumTarefas[i], i);
        }

    }

    private static void verificaResultado(double notaFinal, int numFaltas, int numTarefas, int numAluno) {
        if ((60 - numFaltas) / (double) 60 < 0.75 || numTarefas / (double) 45 < 0.75) {
            JOptionPane.showMessageDialog(null, "Aluno " + (numAluno + 1) + " reprovado!");
        } else if (notaFinal >= 60) {
            JOptionPane.showMessageDialog(null, "Aluno " + (numAluno + 1) + " aprovado!");
        } else {
            JOptionPane.showMessageDialog(null, "O aluno " + (numAluno + 1) + " tem direito de fazer a prova substitutiva!");
        }
    }
}
