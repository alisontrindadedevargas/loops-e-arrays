package br.com.dio.exercicios.loops;

import java.util.Scanner;

// ESSE PROGRAMA RECEBE 10 NUMEROS E SOMA OS PARES
public class exercicioFor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int soma = 0;
        int numero;

        for(int cont = 1; cont <= 10; cont++)  {
            System.out.println("Informe o numero: " + cont);
            numero = in.nextInt();

            if(numero % 2 == 0)
                soma += numero;

            }

            System.out.println("A Soma é : " + soma);

        }

    }