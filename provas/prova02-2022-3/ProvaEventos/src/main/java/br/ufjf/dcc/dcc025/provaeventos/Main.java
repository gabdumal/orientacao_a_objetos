/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package br.ufjf.dcc.dcc025.provaeventos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author devgabmal
 */
public class Main {

    public static void main(String[] args) {

        List<Evento> eventos = new ArrayList<>();
        List<Pessoa> pessoas = new ArrayList<>();

        try {
            Pessoa pessoa = new Pessoa(Data.parser("00/03/1987"), "Gleiph");
        } catch (DataException ex) {
            System.out.println("Pessoa com data de nascimento inválida");
        }

        try {
            Evento evento = new Natal(100, Data.parser("25/12/12356"), "Festa de Natal", 2);
        } catch (DataException ex) {
            System.out.println("Evento com data inválida");
        }

        try {
            pessoas.add(new Pessoa(Data.parser("03/03/1987"), "Gleiph"));
            pessoas.add(new Pessoa(Data.parser("08/12/1922"), "Elvira"));
            pessoas.add(new Pessoa(Data.parser("1/01/2022"), "Maria"));
            pessoas.add(new Pessoa(Data.parser("01/03/2016"), "Joao"));
            pessoas.add(new Pessoa(Data.parser("07/7/2000"), "Gabriel"));
            pessoas.add(new Pessoa(Data.parser("07/10/2000"), "Pedro"));
            pessoas.add(new Pessoa(Data.parser("10/12/2010"), "Mariana"));
            pessoas.add(new Pessoa(Data.parser("10/12/2005"), "Mariane"));
            pessoas.add(new Pessoa(Data.parser("08/12/2005"), "Mario"));

            eventos.add(new Natal(100, Data.parser("25/12/2022"), "Natal DCC", 3));
            eventos.add(new Natal(100, Data.parser("25/12/2022"), "Natal ICE", 4));
            eventos.add(new Carnaval(200, Data.parser("25/02/2023"), "Unidos da OO", 6));

            for (Evento evento : eventos) {
                for (Pessoa pessoa : pessoas) {
                    if (evento.pessoaPodeParticipar(pessoa) && pessoa.podeParticiparEvento(evento)) {
                        pessoa.agendarEvento(evento);
                        evento.adicionaPessoa(pessoa);
                    }
                }
            }

            for (Evento evento : eventos) {
                System.out.println("Evento: " + evento.getNome());

                System.out.println("Perticipantes: ");
                for (Pessoa participante : evento.getParticipantes()) {
                    System.out.println("\t" + participante.getNome());
                }
                System.out.println("Lucro: " + (evento.getValor() * evento.getParticipantes().size()));

            }

        } catch (DataException e) {
            System.out.println("Alguma data está invalida!");
        }
    }
}
