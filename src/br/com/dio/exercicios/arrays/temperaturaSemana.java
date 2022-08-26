package br.com.dio.exercicios.arrays;
//PROGRAMA QUE RECEBE TEMPERATURA DE 7 DIAS DA SEMANA, CÁLCULA A MÉDIA E TEMPERATURA SUPERIOR.
import java.util.Scanner;

public class temperaturaSemana {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float temp [] = new float[7];
        float soma = 0;
            for(int i=0; i< temp.length;i++){
                System.out.println("Temperatura (Dia "+(i+1)+"): ");
                temp [i] = in.nextFloat();
                soma = soma + temp[i];
            }
            float media = soma/ temp.length;
        System.out.println("Média: " + media);

        for(int i = 0; i < temp.length; i++){
            if(temp[i] > media){
                System.out.println("Temperatura superior a média no dia " + (i+1) + " sendo " + temp[i]+ " graus.");
            }
        }

    }
}
