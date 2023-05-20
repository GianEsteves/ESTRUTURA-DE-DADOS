package Recursividade;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        Vetor v = new Vetor();
        int[] numerosAleatorios = v.gerarVetorAleatorio();

        for (int i = 0; i < numerosAleatorios.length; i++) {
                v.add(numerosAleatorios[i]);
                //System.out.println(numerosAleatorios[i]);
        }       

        long inicialR = System.nanoTime(); // Tempo inicialR da recursão
        long finalR = System.nanoTime(); // Tempo final da recursão
        long duracaoR = finalR - inicialR; // Duração da recursão
        
        long inicialI = System.nanoTime(); // Tempo inicialR da iteração
        long finalI = System.nanoTime(); // Tempo final da iteração
        long duracaoI = finalI - inicialI; // Duração da iteração
        

        if (duracaoR > duracaoI) {
            System.out.println("Iterativo é mais rápido");
            System.out.println("Diferença de tempo: " + (duracaoR - duracaoI) + " nanosegundos");
        }
        else {
            System.out.println("Recursivo é mais rápido");
                System.out.println("Diferença de tempo: " + (duracaoI - duracaoR) + " nanosegundos");
        }

        input.close();

	}
}