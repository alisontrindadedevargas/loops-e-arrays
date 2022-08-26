package br.com.dio.exercicios.loops;
// ESSE PROGRAMA PRECISA MOSTRAR NÚMEROS PARES DE 1 A 14, PULANDO O 12

import java.io.IOException;
import java.util.Scanner;


public class exercicioWhile {
    public static void main(String[] args) {

        int i = 1;

        while (i < 15) {
            i++;
            if (i == 12) {
                continue;
            }
            if (i % 2 == 0) {
                System.out.println("O valor de i é " + i);
            }
        }

    }
}