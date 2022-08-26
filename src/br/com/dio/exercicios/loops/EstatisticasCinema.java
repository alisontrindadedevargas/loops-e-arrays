package br.com.dio.exercicios.loops;
/*Precisamos de um programa que, lendo esses dados, nos mostre:
a quantidade de respostas Ótimo;
a média de idade das pessoas que responderam Ruim;
a porcentagem de respostas Péssimo e a maior idade que utilizou essa opção.*/


import java.util.Scanner;

public class EstatisticasCinema {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int idade, somaIdades = 0, maiorIdade = -1;
        int resOtimo = 0, resRuim = 0, resPessimo = 0;
        char nota;
        double mediaIdades;

        for (int cont = 1; cont <= 5; cont++) {

            System.out.printf("--- ESPECTADOR ---" + cont);

            System.out.printf(" Idade: ");

            idade = in.nextInt();
            System.out.printf(" Nota: ");
            nota = in.next().charAt(0);

            if (nota == 'A')
                resOtimo++;

            else if (nota == 'D') {

                resRuim++;

                somaIdades += idade;

            } else if (nota == 'E') {

                resPessimo++;

                if (idade > maiorIdade)

                    maiorIdade = idade;

            }

        }

        mediaIdades = somaIdades / resRuim;


        System.out.printf("Notas Ótimo = " + resOtimo);

        System.out.printf("Média Idades = " + mediaIdades);

        System.out.printf("Percentual notas “Péssimo” = " + resPessimo);

        System.out.printf("Maior idade a responder “Péssimo” = " + maiorIdade);

    }

    }
