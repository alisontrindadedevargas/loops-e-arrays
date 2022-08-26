package br.com.dio.exercicios.arrays;
/* Complete o programa abaixo de forma que leia um vetor de 20 números inteiros e gere um segundo vetor cujas posições pares são o dobro do vetor original e as ímpares o triplo.*/

import java.util.Scanner;

public class ModificaVetor {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int[] vetor = new int[20];

        // Leitura
        for (int cont = 0; cont < vetor.length; cont++) {
            System.out.printf("vetor[%d]: ", cont);
            vetor[cont] = in.nextInt();
        }

        // Processamento
        for (int cont = 0; cont < vetor.length; cont++) {
            if (vetor[cont] % 2 != 0)
                vetor[cont] *= 2;
            else
                vetor[cont] *= 3;
        }

        // Saida
        System.out.println("\n----------------- NOVO VETOR -----------------");
        for (int cont = 0; cont < vetor.length; cont++) {
            System.out.printf("vetor[%d] = %d\n", cont, vetor[cont]);
        }
    }

}

