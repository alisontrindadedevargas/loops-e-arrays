package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class calculadoraImc {
    public static void main(String[] args) {
        int peso;
        float altura, imc;

        System.out.println("\nEste programa realiza o cálculo do seu IMC.\n");

        System.out.print("Para calcular o IMC, digite seu peso: ");
        Scanner teclado = new Scanner(System.in);
        peso = teclado.nextInt();

        System.out.print("Para calcular o IMC, digite sua altura: ");
        altura = teclado.nextFloat();

        imc = (peso / (altura * altura));

        System.out.printf("Resultado do calculo IMC : " + imc + "\n");

        if (imc < 18.5)
            System.out.println("Abaixo do peso ideal, vamos melhorar!");
        else if ((imc > 18.5) && (imc < 24.9))
            System.out.println("Voce esta no peso ideal, parabens!");
        else if ((imc > 25.0) && (imc < 29.9))
            System.out.println("Voce está com excesso de peso, vamos melhorar!");
        else if ((imc > 30.0) && (imc < 34.9))
            System.out.println("Obesidade Classe I, cuidado!");
        else if ((imc > 35.0) && (imc < 39.9))
            System.out.println("Obesidade Classe II, ainda temos como mudar isso!");
        else if (imc >= 40)
            System.out.println("Obesidade Classe III, procure ajuda, nada está perdido!");
    }

}

