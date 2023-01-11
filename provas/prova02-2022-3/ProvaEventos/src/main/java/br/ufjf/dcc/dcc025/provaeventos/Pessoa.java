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
public class Pessoa {

    private Data dataNascimento;
    private String nome;
    private List<Evento> eventos;

    public Pessoa(Data dataNascimento, String nome) {
        this.dataNascimento = dataNascimento;
        this.nome = nome;
        this.eventos = new ArrayList<Evento>();
    }

    public Data getDataNascimento() {
        return dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        Data hoje = new Data();
        int idadeDias = this.dataNascimento.diferenca(hoje);
        return idadeDias / 360;
    }

    public boolean podeParticiparEvento(Evento evento) {
        for (Evento ev : eventos) {
            if (ev.getData().diferenca(evento.getData()) == 0) {
                return false;
            }
        }
        return true;
    }

    public void agendarEvento(Evento evento) {
        if (this.podeParticiparEvento(evento)) {
            this.eventos.add(evento);
        }
    }
}
