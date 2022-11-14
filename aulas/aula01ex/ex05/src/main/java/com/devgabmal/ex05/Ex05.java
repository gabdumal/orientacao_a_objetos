/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.devgabmal.ex05;

import java.util.Scanner;

/**
 *
 * @author ice
 */
public class Ex05 {

    public static double calculaInvestimento(double investimentoPorMes, double taxaMensal) {
        double resultado = investimentoPorMes;

        for (int mes = 11; mes > 0; mes--) {
            resultado += investimentoPorMes + resultado * taxaMensal;
        }

        return resultado;
    }

    public static void main(String[] args) {
        double investimentoPorMes, taxaMensal;

        Scanner teclado = new Scanner(System.in);

        System.out.println("== Calculadora de Investimento ==");
        System.out.print("  Quanto será investido por mês? ");
        investimentoPorMes = Double.parseDouble(teclado.nextLine());
        System.out.print("  Qual será a taxa de juros mensal? ");
        taxaMensal = Double.parseDouble(teclado.nextLine().replace("%", ""))
                / (double) 100;

        System.out.println(
                "\n  Saldo do investimento após 1 ano: " +
                        calculaInvestimento(investimentoPorMes, taxaMensal));
    }
}
