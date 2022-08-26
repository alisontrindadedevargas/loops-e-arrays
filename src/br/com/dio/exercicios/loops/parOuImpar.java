package br.com.dio.exercicios.loops;
//PROGRAMA QUE RECEBE UM NÚMERO INTEIRO E CLASSIFICA EM PAR OU IMPAR.
import java.util.Scanner;

public class parOuImpar {
    public static void main(String[] args) {
        System.out.print("Digite um numero inteiro: ");
        Scanner scan = new Scanner(System.in);
        int numero;
        String resposta;

        numero = scan.nextInt();
        resposta = numero % 2 == 0 ? "par" : "impar";
        System.out.println("O numero é " + resposta);

    }

}

