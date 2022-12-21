/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.devgabmal.prova;

/**
 *
 * @author devgabmal
 */
public abstract class Investimento implements Rendimento {

    private String titulo;
    private double valor;
    private Data dataContratacao;

    public Investimento(String titulo, double valor, Data dataContratacao) {
        this.titulo = titulo;
        this.valor = valor;
        this.dataContratacao = dataContratacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getValor() {
        return valor;
    }

    public Data getDataContratacao() {
        return dataContratacao;
    }

}
