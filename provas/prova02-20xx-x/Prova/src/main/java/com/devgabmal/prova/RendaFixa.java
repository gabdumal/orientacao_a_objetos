/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.devgabmal.prova;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author devgabmal
 */
public class RendaFixa extends Investimento {

    public RendaFixa(String titulo, double valor, Data dataContratacao) {
        super(titulo, valor, dataContratacao);
    }

    @Override
    public double calcularRendimento(Data dataFinal) throws ExcecaoDataPosterior {
        int diferencaData = this.getDataContratacao().diferenca(dataFinal);
        return diferencaData * 0.005 * this.getValor();
    }
}
