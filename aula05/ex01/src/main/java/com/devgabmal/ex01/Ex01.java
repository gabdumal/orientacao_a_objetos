/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.devgabmal.ex01;

import javax.swing.JOptionPane;

/**
 *
 * @author ice
 */
public class Ex01 {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Digite o seu nome:");
        JOptionPane.showMessageDialog(null, "Olá, " + nome + "!");
    }
}
