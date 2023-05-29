package Questao1;

import java.util.*;

public class Vetor {
    private int[] vetor;
    private int[] vetor2;


    public int[] gerarVetorAleatorio1(int totalElementos1) {
        vetor = new int[totalElementos1];
        Random random = new Random();

        for (int i = 0; i < totalElementos1; i++) {
            vetor[i] = random.nextInt(50);
        }

        return vetor;
    }

    public int[] gerarVetorAleatorio2(int totalElementos2) {
        vetor2 = new int[totalElementos2];
        Random random = new Random();

        for (int i = 0; i < totalElementos2; i++) {
            vetor2[i] = random.nextInt(50);
        }

        return vetor2;
    }

    public int[] intersecao() {
        Set<Integer> set = new HashSet<>();
        List<Integer> intersectList = new ArrayList<>();

        for (int i = 0; i < vetor.length; i++) {
            set.add(vetor[i]);
        }

        for (int i = 0; i < vetor2.length; i++) {
            if (set.contains(vetor2[i])) {
                intersectList.add(vetor2[i]);
            }
        }

        int[] intersectArray = new int[intersectList.size()];
        for (int i = 0; i < intersectList.size(); i++) {
            intersectArray[i] = intersectList.get(i);
        }

        return intersectArray;
    }

}
