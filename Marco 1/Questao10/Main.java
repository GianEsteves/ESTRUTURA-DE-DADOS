package Questao10;

public class Main {
    public static void main(String[] args) {
        int[] vetor = {3, 7, 1, 4, 9, 2};

        System.out.println("Vetor original: ");
        exibirVetor(vetor);

        // Bubble Sort
        bubbleSort(vetor.clone());

        // Selection Sort
        selectionSort(vetor.clone());

        // Insertion Sort
        insertionSort(vetor.clone());
    }

    public static void bubbleSort(int[] vetor) {
        System.out.println("\nBubble Sort:");
        exibirVetor(vetor);

        int n = vetor.length;
        boolean trocou;

        for (int i = 0; i < n - 1; i++) {
            trocou = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    troca(vetor, j, j + 1);
                    trocou = true;
                    exibirVetor(vetor);
                }
            }

            if (!trocou) {
                break;
            }
        }
    }

    public static void selectionSort(int[] vetor) {
        System.out.println("\nSelection Sort:");
        exibirVetor(vetor);

        int n = vetor.length;

        for (int i = 0; i < n - 1; i++) {
            int indiceMenor = i;

            for (int j = i + 1; j < n; j++) {
                if (vetor[j] < vetor[indiceMenor]) {
                    indiceMenor = j;
                }
            }

            if (indiceMenor != i) {
                troca(vetor, i, indiceMenor);
                exibirVetor(vetor);
            }
        }
    }

    public static void insertionSort(int[] vetor) {
        System.out.println("\nInsertion Sort:");
        exibirVetor(vetor);

        int n = vetor.length;

        for (int i = 1; i < n; i++) {
            int chave = vetor[i];
            int j = i - 1;

            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j--;
            }

            vetor[j + 1] = chave;
            exibirVetor(vetor);
        }
    }

    public static void troca(int[] vetor, int i, int j) {
        int temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
    }

    public static void exibirVetor(int[] vetor) {
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
