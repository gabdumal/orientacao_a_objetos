/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.devgabmal.desafio;

import javax.swing.JFrame;

/**
 *
 * @author cgmal
 */
public class Desafio {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        DrawPanelImproved panel = new DrawPanelImproved();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.add(panel);
        frame.setVisible(true);
    }
}
