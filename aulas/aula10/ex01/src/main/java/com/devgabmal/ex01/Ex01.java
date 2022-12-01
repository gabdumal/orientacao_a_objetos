/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.devgabmal.ex01;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author devgabmal
 */
public class Ex01 {

    public static void main(String[] args) {
        List<Pessoa> listaPessoas = new ArrayList<Pessoa>();

        listaPessoas.add(new Pessoa("Maria", 28));
        listaPessoas.add(new Pessoa("João", 15));
        listaPessoas.add(new Pessoa("Maria", 15));
        listaPessoas.add(new Pessoa("Pedro", 87));

//      OrdenadorNome ordenadorNome = new OrdenadorNome();
//      ordenadorNome.ordena(listaPessoas);
        OrdenadorIdade ordenadorIdade = new OrdenadorIdade();
        ordenadorIdade.ordena(listaPessoas);

        for (Pessoa pessoa : listaPessoas) {
            System.out.println(pessoa);
        }
    }
}
