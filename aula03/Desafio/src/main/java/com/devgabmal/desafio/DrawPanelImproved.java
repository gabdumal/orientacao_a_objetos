/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.devgabmal.desafio;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author cgmal
 */
public class DrawPanelImproved extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();

        double slices = 15;
        int x1, x2, y1, y2;
        double sliceWidth = width / slices;
        double sliceHeight = height / slices;

        for (int i = 0; i < slices; i++) {
            x1 = 0;
            y1 = (int) (i * sliceHeight);
            x2 = (int) (i * sliceWidth);
            y2 = (int) (height);
            g.drawLine(x1, y1, x2, y2);
        }
        for (int i = 0; i < slices; i++) {
            x1 = (int) (width);
            y1 = (int) (i * sliceHeight);
            x2 = (int) (i * sliceWidth);
            y2 = 0;
            g.drawLine(x1, y1, x2, y2);
        }
        for (int i = 0; i < slices; i++) {
            x1 = 0;
            y1 = (int) (height - (i * sliceHeight));
            x2 = (int) (i * sliceWidth);
            y2 = 0;
            g.drawLine(x1, y1, x2, y2);
        }
        for (int i = 0; i < slices; i++) {
            x1 = (int) width;
            y1 = (int) (height - (i * sliceHeight));
            x2 = (int) (i * sliceWidth);
            y2 = (int) height;
            g.drawLine(x1, y1, x2, y2);
        }
    }
}
