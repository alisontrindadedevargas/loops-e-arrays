package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class ExameEstudante {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        double prova1, prova2, prova3, media, exame, mediaFinal;

        System.out.print("Nota na prova 1: ");
        prova1 = in.nextDouble();
        System.out.print("Nota na prova 2: ");
        prova2 = in.nextDouble();
        System.out.print("Nota na prova 3: ");
        prova3 = in.nextDouble();

        media = (prova1 + prova2 + prova3) / 3;
        System.out.printf("\nMEDIA =\n" + media);

        if (media >= 7) {
            System.out.println("O estudante nao ficou em exame.");

        } else {
            System.out.println("O estudante ficou em exame.");
            System.out.print("Informe a nota dele no exame: ");
            exame = in.nextDouble();

            mediaFinal = (media + exame) / 2;
            System.out.printf("MEDIA FINAL = %.1f\n", mediaFinal);

            if (mediaFinal >= 5) {
                System.out.println("O estudante foi aprovado!");
            } else {
                System.out.println("O estudante foi reprovado :(");
            }
        }

    }
}
