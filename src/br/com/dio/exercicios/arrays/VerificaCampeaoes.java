package br.com.dio.exercicios.arrays;

import java.util.Scanner;

public class VerificaCampeaoes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] pontos = new int[20];

        // Leitura
        for(int cont = 0; cont < pontos.length; cont++) {
            System.out.printf("Pontuacao do time %d: ", cont+1);
            pontos[cont] = in.nextInt();
        }

        // Processamento
        int maior = pontos[0];
        for(int cont = 1; cont < pontos.length; cont++) {
            if(maior < pontos[cont])
                maior = pontos[cont];
        }

        int campeoes = 0;
        for(int cont = 0; cont < pontos.length; cont++) {
            if(pontos[cont] == maior)
                campeoes++;
        }

        // Saida
        System.out.printf("\nNUMERO DE CAMPEOES = %d\n", campeoes);
    }
}
