/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufjf.dcc.dcc025.provaeventos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author devgabmal
 */
public abstract class Evento {

    private double valor;
    private Data data;
    private String nome;
    private int capacidade;
    private List<Pessoa> participantes;

    public Evento(double valor, Data data, String nome, int capacidade) {
        this.valor = valor;
        this.data = data;
        this.nome = nome;
        this.capacidade = capacidade;
        this.participantes = new ArrayList<Pessoa>();
    }

    public double getValor() {
        return valor;
    }

    public Data getData() {
        return data;
    }

    public String getNome() {
        return nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public List<Pessoa> getParticipantes() {
        return participantes;
    }

    public boolean temVaga() {
        return this.participantes.size() < capacidade;
    }

    public abstract boolean pessoaPodeParticipar(Pessoa pessoa);

    public void adicionaPessoa(Pessoa pessoa) {
        if (this.pessoaPodeParticipar(pessoa)) {
            this.participantes.add(pessoa);
        }
    }
}
