package Questao1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Vetor v = new Vetor();
        int[] vetor1 = v.gerarVetorAleatorio1(5);
        int[] vetor2 = v.gerarVetorAleatorio2(8);
        int[] intersecao = v.intersecao();
        
        System.out.println("Vetor 1: " + Arrays.toString(vetor1));
        System.out.println("Vetor 2: " + Arrays.toString(vetor2));
        System.out.println("Interseção: " + Arrays.toString(intersecao));
        
    }
}
