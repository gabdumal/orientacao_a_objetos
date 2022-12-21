/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.devgabmal.prova;

/**
 *
 * @author devgabmal
 */
public class ExcecaoDataPosterior extends Exception {

    public ExcecaoDataPosterior(Data dataInicial, Data dataFinal) {
        super(dataInicial + "e posterior a " + dataFinal);
    }
}
