package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class jogoDeAdivinhacao {
     static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int numero_sorteado, palpite;
        //sortear número com o uso do math.random
        numero_sorteado = (int) (Math.random() * 1000 + 1);

        do {

            System.out.print("Palpite: ");

            palpite = in.nextInt();


            if (palpite > numero_sorteado)

                System.out.println("Muito alto");

            else if (palpite < numero_sorteado)

                System.out.println("Muito baixo");

            else

                System.out.println("Você acertou !");

        } while (palpite != numero_sorteado);

    }

}

