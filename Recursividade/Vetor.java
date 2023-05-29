package Recursividade;

import java.util.Random;

public class Vetor {
    private int[] array = new int[0];
    private int totalNumros = 0;
    private int mid;

    public Vetor(){
        this.array = new int[1000];
    }

    public void add(int number){
        if (totalNumros == array.length){
            return;
        }

        this.array[this.totalNumros] = number;
        this.totalNumros++;
    }   

    public int size(){
        return this.totalNumros;
    }

    public int maxRec(int array[], int begin, int end){
        if (begin == end){
            return array[begin];
        }
        else {
            mid = (begin + end) / 2;
            int max1 = maxRec(array, begin, mid);
            int max2 = maxRec(array, mid+1, end);
            if (max1 > max2) {
                return max1;
            }
            else {
                return max2;
            }
        }
    }
    
    public int maxIt(int number){
        int maior = 0; 

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maior) {
                maior = array[i];
            }
        }
    
        return maior;
    }

    public int[] gerarVetorAleatorio() {
        int[] vetor = new int[1000];
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            vetor[i] = random.nextInt(999999);
        }

        return vetor;
    }
}