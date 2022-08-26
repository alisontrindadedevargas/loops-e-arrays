package br.com.dio.exercicios.ifelse;
//PROGRAMA QUE VERIFICA QUAL NUMERO MAIOR
import java.util.Scanner;

public class maiorDeDoisNumeros {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n1, n2;

        System.out.print("Digite o primeiro número: ");

        n1 = in.nextDouble();

        System.out.print("Digite o segundo número: ");

        n2 = in.nextDouble();

        if (n1 > n2)

            System.out.printf("Maior número: " + n1);

else if (n2 > n1)

            System.out.printf("Maior número: " + n2);

else

        System.out.println("Os números são iguais.");
    }

}
