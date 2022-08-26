package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class MaiorMenorDe20Notas {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double nota,maior,menor;

        System.out.print("Informe a nota 1: ");

        nota = in.nextDouble();
        maior = nota;
        menor = nota;

        for(int cont = 2; cont <= 20; cont++) {

            System.out.printf("Informe a nota " + cont + ": ");

            nota = in.nextDouble();

            if(nota > maior)
                maior = nota;
            if(nota < menor)
                menor = nota;

        }

        System.out.println("Maior nota = \n" + maior);

        System.out.println("Menor nota = \n" + menor);

    }
}
