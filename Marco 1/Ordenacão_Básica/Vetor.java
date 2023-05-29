package Ordenacão_Básica;

import java.util.Random;

public class Vetor {
    private int[] vetor;
    int totalElementos =1000;

    public int[] gerarvetororAleatorio() {
        vetor = new int[totalElementos];
        Random random = new Random();

        for (int i = 0; i < totalElementos; i++) {
            vetor[i] = random.nextInt(10000);
        }

        return vetor;
    }

    public void exibirvetororAleatorio() {
        // Verifique se o vetor não é nulo antes de acessá-lo
        if (vetor != null) {
            for (int i = 0; i < vetor.length; i++) {
                System.out.print(vetor[i] + " ");
            }
            System.out.println();
        }
    }
    public void bubble_sort(){
        gerarvetororAleatorio();
        for (int i = 0; i < this.totalElementos; i++)
        for (int j = 0; j < this.totalElementos-1; j++)
        if (this.vetor[j] > this.vetor[j+1]) {
            int aux = this.vetor[j];
            this.vetor[j] = this.vetor[j+1];
            this.vetor[j+1] = aux;
        }
        //exibirvetororAleatorio();
    }

    public void selection_sort(){
        gerarvetororAleatorio();
        for (int i = 0; i < this.totalElementos; i++) {
            int menor = i;
            for (int j = i+1; j < this.totalElementos; j++)
            if (this.vetor[j] < this.vetor[menor])
            menor = j;
            int aux = vetor[i];
            this.vetor[i] = this.vetor[menor];
            this.vetor[menor] = aux;
        }
        //exibirvetororAleatorio();
    }

    public void insertion_sort() {
        gerarvetororAleatorio();
        for (int i = 1; i < this.totalElementos; i++) {
            int chave = this.vetor[i];
            int j = i - 1;
            while (j >= 0 && chave < this.vetor[j]) {
                this.vetor[j + 1] = this.vetor[j];
                j--;
            }
                this.vetor[j + 1] = chave;
            }
            //exibirvetororAleatorio();
    }
    

}
