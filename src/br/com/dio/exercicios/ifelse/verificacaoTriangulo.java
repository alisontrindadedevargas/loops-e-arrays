package br.com.dio.exercicios.ifelse;

import java.util.Scanner;

public class verificacaoTriangulo {

//PROGRAMA QUE VERIFICA QUAL TIPO DE TRIÂNGULO REPRESENTA

           public static void main(String[]args){
            Scanner in = new Scanner(System.in);

            double A,B,C;

            System.out.print("Medida A: ");
            A = in.nextDouble();
            System.out.print("Medida B: ");
            B = in.nextDouble();
            System.out.print("Medida C: ");
            C = in.nextDouble();

            if(A + B > C && A + C > B && B + C > A) {

                if(A == B && B == C)

                    System.out.println("As medidas formam um triângulo EQUILÁTERO");

                else if(A != B && A != C && B != C)

                    System.out.println("As medidas formam um triângulo ESCALENO");

                else

                    System.out.println("As medidas formam um triângulo ISÓSCELES");

            } else {

                System.out.println("As medidas informadas NÃO formam um triângulo");

            }
        }

    }

