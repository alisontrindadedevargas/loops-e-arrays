package br.com.dio.exercicios.loops;
//EXERCÍCIO DE WHILE: PROGRAMA RECEBE NOTAS E FAZ A MÉDIA

import java.util.Scanner;

public class mediaTurma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double nota, soma = 0, media;
        int cont = 1;
        System.out.println("Quantidade de notas que serão inseridas: ");
        int quantNotas = scan.nextInt();

        while (cont <= quantNotas) {
            System.out.println("Insira a " + cont + "° nota: ");
            nota = scan.nextDouble();
            soma = soma + nota;
            cont++;
        }
        media = soma / quantNotas;
        if (media >= 6) {
            System.out.println("Média final: " + media + " APROVADO!");
        } else {
            System.out.println("REPROVADO  com média " + media);
        }
    }
}
