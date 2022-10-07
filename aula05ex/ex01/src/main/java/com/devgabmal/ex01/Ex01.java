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
        double x1, y1, x2, y2, distancia;

        x1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor de X do 1º ponto: "));
        y1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor de Y do 1º ponto: "));
        x2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor de X do 2º ponto: "));
        y2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor de Y do 2º ponto: "));

        distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        JOptionPane.showMessageDialog(null, "A distância entre os pontos ("
                + x1 + ", " + y1 + ") e (" + x2 + ", " + y2 + ") é " + distancia);

    }
}
