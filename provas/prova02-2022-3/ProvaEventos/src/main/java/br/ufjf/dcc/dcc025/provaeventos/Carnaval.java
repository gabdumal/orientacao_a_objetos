/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufjf.dcc.dcc025.provaeventos;

/**
 *
 * @author devgabmal
 */
public class Carnaval extends Evento {

    public Carnaval(double valor, Data data, String nome, int capacidade) {
        super(valor, data, nome, capacidade);
    }

    @Override
    public boolean pessoaPodeParticipar(Pessoa pessoa) {
        return this.temVaga() && pessoa.getIdade() >= 18;
    }

}
