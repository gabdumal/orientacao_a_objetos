/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufjf.dcc.dcc025.provaeventos;

import java.time.LocalDateTime;

/**
 *
 * @author devgabmal
 */
public class Data {

    private int dia;
    private int mes;
    private int ano;

    public Data() {
        // Data de hoje
        LocalDateTime hoje = LocalDateTime.now();
        this.dia = hoje.getDayOfMonth();
        this.mes = hoje.getMonthValue();
        this.ano = hoje.getYear();
    }

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public int diferenca(Data dataFinal) {
        int diffDias = (dataFinal.ano - this.ano) * 360;
        diffDias += (dataFinal.mes - this.mes) * 30;
        diffDias += (dataFinal.dia - this.dia);
        return diffDias;
    }

    public static Data parser(String dataString) throws DataException {
        try {
            String[] componentes = dataString.split("/");
            if (componentes.length == 3) {

                int diaConvertido = Integer.parseInt(componentes[0]);
                int mesConvertido = Integer.parseInt(componentes[1]);
                int anoConvertido = Integer.parseInt(componentes[2]);

                if (diaConvertido >= 1 && diaConvertido <= 30
                        && mesConvertido >= 1 && mesConvertido <= 12
                        && anoConvertido >= 1 && anoConvertido <= 9999) {
                    Data dataConvertida = new Data(diaConvertido, mesConvertido, anoConvertido);
                    return dataConvertida;
                } else {
                    throw new DataException("Valores de data invalidos");
                }
            } else {
                throw new DataException("Numero invalido de argumentos para data");
            }
        } catch (NumberFormatException ex) {
            throw new DataException("Formato de data invalido");
        }
    }
}
