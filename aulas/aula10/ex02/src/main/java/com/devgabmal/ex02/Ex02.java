/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.devgabmal.ex02;

/**
 *
 * @author devgabmal
 */
public class Ex02 {

    public static void main(String[] args) {
        Animal[] listaAnimais = new Animal[10];
        for (int i = 0; i < 10; i++) {
            int tipo = i % 3;
            Animal animal;
            switch (tipo) {
                case 0:
                    animal = new Homem();
                    break;
                case 1:
                    animal = new Cao();
                    break;
                default:
                    animal = new Gato();
                    break;
            }
            listaAnimais[i] = animal;
        }

        for (Animal animal : listaAnimais) {
            System.out.println("O " + animal.getClass().getSimpleName() + " fala:");
            animal.fala();
        }

    }
}
