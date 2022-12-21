/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.devgabmal.prova;

/**
 *
 * @author devgabmal
 */
public class RendaVariavel extends Investimento {

    public RendaVariavel(String titulo, double valor, Data dataContratacao) {
        super(titulo, valor, dataContratacao);
    }

    @Override
    public double calcularRendimento(Data dataFinal) throws ExcecaoDataPosterior {
        try {
            int diferencaData = this.getDataContratacao().diferenca(dataFinal);
            double montante = this.getValor();
            for (int i = 1; i <= diferencaData; i++) {
                montante += montante * 0.008;
            }
            return montante - this.getValor();
        } catch (ExcecaoDataPosterior ex) {
            return 0;
        }
    }
}
