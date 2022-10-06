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
        double notaFinal;
        int numFaltas, numTarefas;

        notaFinal = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota final:"));
        numFaltas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de faltas:"));
        numTarefas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de tarefas:"));

        verificaResultado(notaFinal, numFaltas, numTarefas);

    }

    private static void verificaResultado(double notaFinal, int numFaltas, int numTarefas) {
        if ((60 - numFaltas) / (double) 60 < 0.75 || numTarefas / (double) 45 < 0.75) {
            JOptionPane.showMessageDialog(null, "Aluno reprovado!");
        } else if (notaFinal >= 60) {
            JOptionPane.showMessageDialog(null, "Aluno aprovado!");
        } else {
            JOptionPane.showMessageDialog(null, "O aluno tem direito de fazer a prova substitutiva!");
        }
    }
}
