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
        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 1º número:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 2º número:"));
        int soma = num1 + num2;

        JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + soma);

    }
}
