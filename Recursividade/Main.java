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

        long startTimeRec = System.nanoTime();
        long endTimeRec = System.nanoTime();
        long durationRec = endTimeRec - startTimeRec;
        long startTimeIt = System.nanoTime();
        long endTimeIt = System.nanoTime();
        long durationIt = endTimeIt - startTimeIt;

        if (durationRec > durationIt) {
            System.out.println("Iterativo é mais rápido");
            System.out.println("Diferença de tempo: " + (durationRec - durationIt) + " nanosegundos");
        }
        else {
            System.out.println("Recursivo é mais rápido");
                System.out.println("Diferença de tempo: " + (durationIt - durationRec) + " nanosegundos");
        }

        input.close();

	}
}