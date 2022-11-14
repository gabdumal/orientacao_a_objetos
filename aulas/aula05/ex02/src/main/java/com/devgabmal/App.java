package com.devgabmal;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        final int tam = 5;
        Pessoa[] listaPessoas = new Pessoa[tam];
        Scanner teclado = new Scanner(System.in);

        System.out.println("== REGISTRO DE PESSOAS ==");

        for (int i = 0; i < tam; i++) {
            Pessoa pessoa = new Pessoa();
            System.out.print("Nome: ");
            pessoa.setNome(teclado.nextLine());
            System.out.print("Idade: ");
            pessoa.setIdade(Integer.parseInt(teclado.nextLine()));
            listaPessoas[i] = pessoa;
        }

        mergeSort(tam, listaPessoas, true);
        System.out.println("\nOrdem alfabética");
        for (int i = 0; i < listaPessoas.length; i++) {
            System.out.println(listaPessoas[i].getNome() + ": "
                    + listaPessoas[i].getIdade());
        }

        mergeSort(tam, listaPessoas, false);
        System.out.println("\nOrdem crescente de idade");
        for (int i = 0; i < listaPessoas.length; i++) {
            System.out.println(listaPessoas[i].getNome() + ": "
                    + listaPessoas[i].getIdade());
        }
    }

    private static void mergeSort(int tamanho, Pessoa[] vetor, boolean alfabetica) {
        /*
         * Variavel utilizada para percorrer o vetor.
         * Inicializa com 1 para indicar que o vetor tenha pelo menos 1 elemento.
         */
        int elementos = 1;
        /* Variaveis utilizadas para marcar o inicio, meio e fim do vetor. */
        int inicio, meio, fim;

        /* Percorre os elementos do vetor até chegar no fim do vetor. */
        while (elementos < tamanho) {
            /* Aponta o inicio do vetor. */
            inicio = 0;

            /*
             * Percorre o vetor do inicio + quantidade de elementos ja percorrido,
             * até o tamanho do vetor.
             */
            while (inicio + elementos < tamanho) {
                /* Guarda a posição do meio do vetor que será ordenado. */
                meio = inicio + elementos;
                /* Guarda a posição final do vetor que será ordenado. */
                fim = inicio + 2 * elementos;

                /*
                 * Caso o fim fique com um tamanho maior, que o tamanho do vetor,
                 * então faz o fim ter o mesmo tamanho que o tamanho do vetor.
                 */
                if (fim > tamanho) {
                    fim = tamanho;
                }

                /*
                 * Chama o método que faz a intercalação dos valores
                 * ordenados do vetor.
                 */
                if (alfabetica)
                    intercalaString(vetor, inicio, meio, fim);
                else
                    intercalaInt(vetor, inicio, meio, fim);

                /* Faz o inicio do vetor ser igual ao fim. */
                inicio = fim;
            }

            /* Percorre o vetor dobrando a quantidade de itens ja ordenados. */
            elementos = elementos * 2;
        }
    }

    private static void intercalaInt(Pessoa[] vetor, int inicio, int meio, int fim) {
        /* Vetor utilizado para guardar os valors ordenados. */
        Pessoa novoVetor[] = new Pessoa[fim - inicio];

        /* Variavel utilizada para guardar a posicao do inicio do vetor. */
        int i = inicio;
        /* Variavel utilizada para guardar a posição do meio do vetor. */
        int m = meio;
        /*
         * Variavel utilizada para guarda a posição onde os
         * valores serão inseridos no novo vetor.
         */
        int pos = 0;

        /*
         * Enquanto o inicio não chegar até o meio do vetor, ou o meio do vetor
         * não chegar até seu fim, compara os valores entre o inicio e o meio,
         * verificando em qual ordem vai guarda-los ordenado.
         */
        while (i < meio && m < fim) {
            /*
             * Se o vetor[i] for menor que o vetor[m], então guarda o valor do
             * vetor[i] pois este é menor.
             */
            if (vetor[i].getIdade() <= vetor[m].getIdade()) {
                novoVetor[pos] = vetor[i];

                pos = pos + 1;
                i = i + 1;
                // Senão guarda o valor do vetor[m] pois este é o menor.
            } else {
                novoVetor[pos] = vetor[m];
                pos = pos + 1;
                m = m + 1;
            }
        }

        // Adicionar no vetor os elementos que estão entre o inicio e meio,
        // que ainda não foram adicionados no vetor.
        while (i < meio) {
            novoVetor[pos] = vetor[i];
            pos = pos + 1;
            i = i + 1;
        }

        // Adicionar no vetor os elementos que estão entre o meio e o fim,
        // que ainda não foram adicionados no vetor.
        while (m < fim) {
            novoVetor[pos] = vetor[m];
            pos = pos + 1;
            m = m + 1;
        }

        // Coloca no vetor os valores já ordenados.
        for (pos = 0, i = inicio; i < fim; i++, pos++) {
            vetor[i] = novoVetor[pos];
        }
    }

    private static void intercalaString(Pessoa[] vetor, int inicio, int meio, int fim) {
        /* Vetor utilizado para guardar os valors ordenados. */
        Pessoa novoVetor[] = new Pessoa[fim - inicio];

        /* Variavel utilizada para guardar a posicao do inicio do vetor. */
        int i = inicio;
        /* Variavel utilizada para guardar a posição do meio do vetor. */
        int m = meio;
        /*
         * Variavel utilizada para guarda a posição onde os
         * valores serão inseridos no novo vetor.
         */
        int pos = 0;

        /*
         * Enquanto o inicio não chegar até o meio do vetor, ou o meio do vetor
         * não chegar até seu fim, compara os valores entre o inicio e o meio,
         * verificando em qual ordem vai guarda-los ordenado.
         */
        while (i < meio && m < fim) {
            /*
             * Se o vetor[i] for menor que o vetor[m], então guarda o valor do
             * vetor[i] pois este é menor.
             */
            if (vetor[i].getNome().compareToIgnoreCase(vetor[m].getNome()) <= 0) {
                novoVetor[pos] = vetor[i];

                pos = pos + 1;
                i = i + 1;
                // Senão guarda o valor do vetor[m] pois este é o menor.
            } else {
                novoVetor[pos] = vetor[m];
                pos = pos + 1;
                m = m + 1;
            }
        }

        // Adicionar no vetor os elementos que estão entre o inicio e meio,
        // que ainda não foram adicionados no vetor.
        while (i < meio) {
            novoVetor[pos] = vetor[i];
            pos = pos + 1;
            i = i + 1;
        }

        // Adicionar no vetor os elementos que estão entre o meio e o fim,
        // que ainda não foram adicionados no vetor.
        while (m < fim) {
            novoVetor[pos] = vetor[m];
            pos = pos + 1;
            m = m + 1;
        }

        // Coloca no vetor os valores já ordenados.
        for (pos = 0, i = inicio; i < fim; i++, pos++) {
            vetor[i] = novoVetor[pos];
        }
    }
}
