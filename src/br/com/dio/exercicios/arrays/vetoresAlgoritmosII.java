package br.com.dio.exercicios.arrays;

import java.util.Scanner;

public class vetoresAlgoritmosII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe a quantidade de números que deseja armazenar na lista: ");
        int n = in.nextInt();
        int[] vetor = new int[n];
        int numeros;

        for (int i = 0; i < n; i++) {
            System.out.print("Informe o "+(i+1)+"° número: " );
            numeros = in.nextInt();
            vetor[i] = numeros;
        }
        System.out.println("\nDiferença: " + DiferencaElemento(vetor, n));
        System.out.println();

        if (Crescente(vetor, n) == 1) {
            System.out.println("Verdadeiro!");
        } else
            System.out.println("Falso!");
    }
    static int DiferencaElemento(int[] vetor, int n) {
        int diferenca = 0;
        int maior = vetor[0];
        for (int i = 0; i < n; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        int menor = vetor[0];
        for (int i = 0; i < n; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        return diferenca = maior - menor;
    }
    static int Crescente(int[] vetor, int n) {
        for (int i = 1; i < n; i++) {
            if (vetor[i - 1] > vetor[i]) {
                return 0;
            }
        }
        return 1;
    }
}
