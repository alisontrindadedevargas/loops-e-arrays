package br.com.dio.exercicios.arrays;

import java.util.Scanner;

public class listaDeConvidadosEmVetor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Define e preenche o vetor para a lista de convidados
        String [] c = new String[5];
        for(int i=0;i<c.length;i++){
            System.out.println("Informe o nome do convidado: ");
            c[i] = in.nextLine();
        }
        System.out.println("\nDê o nome para pesquisar: ");
        String nome = in.nextLine();
        boolean eConvidado = false;
        for(int i = 0; i<c.length;i++){
            if(nome.equals(c[i])){
                eConvidado = true;
                break;
            }
        }
        if (eConvidado){
            System.out.println(nome + " está na lista de convidados");
        } else{
            System.out.println(nome + " não está na lista");
        }
    }
}
