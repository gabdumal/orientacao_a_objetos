/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.devgabmal.prova;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author devgabmal
 * @time 01 hora, 35 minutos e 05 segundos
 */
public class Simulacao {

    private static List<Investimento> listaInvestimentos;

    private static void rendimentoAcumulado(Data dataFinal) {
        double acumulado = 0;
        for (Investimento investimento : Simulacao.listaInvestimentos) {
            try {
                double rendimento = investimento.calcularRendimento(dataFinal);
                acumulado += rendimento;
                System.out.println("Titulo de Investimento: " + investimento.getTitulo());
                System.out.println("    Valor investido: " + investimento.getValor());
                System.out.println("    Data de contratacao: " + investimento.getDataContratacao());
                System.out.println("    Rendimento acumulado: " + rendimento);
            } catch (ExcecaoDataPosterior ex) {
                System.out.println("Investimento " + investimento.getTitulo()
                        + " nao foi iniciado...");
            }
        }
        System.out.println("Total de rendimento = " + acumulado);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Simulacao.listaInvestimentos = new ArrayList<Investimento>();

        for (int i = 0; i < 5; i++) {
            String texto = "Lendo o " + (i + 1) + "o  investimento de renda ";
            texto += (i < 3) ? "fixa" : "variavel";
            texto += ".\nOs seguintes dados:";
            System.out.println(texto);

            System.out.print("Titulo: ");
            String titulo = teclado.next();

            System.out.print("Valor: ");
            double valor = teclado.nextDouble();

            System.out.print("Data: ");
            int mes = teclado.nextInt();
            int ano = teclado.nextInt();
            Data data = new Data(mes, ano);

            Investimento investimento;
            if (i < 3) {
                investimento = new RendaFixa(titulo, valor, data);
            } else {
                investimento = new RendaVariavel(titulo, valor, data);
            }
            Simulacao.listaInvestimentos.add(investimento);
        }

        System.out.print("Digite a data final da simulacao: ");
        int mes = teclado.nextInt();
        int ano = teclado.nextInt();
        Data data = new Data(mes, ano);
        Simulacao.rendimentoAcumulado(data);

    }
}
