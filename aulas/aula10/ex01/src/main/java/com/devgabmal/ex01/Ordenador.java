/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.devgabmal.ex01;

import java.util.List;

/**
 *
 * @author devgabmal
 */
public abstract class Ordenador {

    public abstract void ordena(List<Pessoa> listaPessoas);

    private void troca(Pessoa pessoa1, Pessoa pessoa2) {

    }

    protected abstract int compara(Pessoa pessoa1, Pessoa pessoa2);
}
