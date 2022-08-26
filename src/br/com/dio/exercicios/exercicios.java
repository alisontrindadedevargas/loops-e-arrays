package br.com.dio.exercicios;
/* EXERCÍO DE DO...WHILE: PROGRAMA QUE RECEBE UMA QUANTIDADE DE NOTAS E
IMPRIME A MÉDIA FINAL COM RESULTADO DE APROVADO OU REPROVADO
 */
import java.util.Scanner;

public class exercicios {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota, quantidadeNotas, media;
        int soma = 0;
        int count = 0;

        System.out.println("Digite a quantidade de notas a serem inseridas: ");
        quantidadeNotas = scan.nextInt();

        do {
            System.out.println("Digite uma nota: ");
            nota = scan.nextInt();
            soma = soma + nota;
            count++;
        } while (count < quantidadeNotas);

        media = soma / quantidadeNotas;

        if (media >= 6) {
            System.out.println("Aprovado com média: " + media);
        } else {
            System.out.println("Reprovado");
        }

    }
}