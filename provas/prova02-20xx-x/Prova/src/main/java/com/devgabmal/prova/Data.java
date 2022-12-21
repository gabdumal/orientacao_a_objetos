/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.devgabmal.prova;

/**
 *
 * @author devgabmal
 */
public class Data {

    private int mes;
    private int ano;

    public Data(int mes, int ano) {
        this.mes = mes;
        this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public int diferenca(Data dataFinal) throws ExcecaoDataPosterior {
        int resultado;

        resultado = (dataFinal.getAno() - this.ano) * 12;
        resultado += (dataFinal.getMes() - this.mes);

        if (resultado < 0) {
            throw new ExcecaoDataPosterior(this, dataFinal);
        } else {
            return resultado;
        }
    }

    @Override
    public String toString() {
        return this.mes + "/" + this.ano;
    }

}
