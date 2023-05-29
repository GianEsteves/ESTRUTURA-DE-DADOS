package Ordenacão_Básica;

public class Main {
    public static void main(String[] args){
        Vetor v = new Vetor();
        //v.gerarVetorAleatorio();
        v.exibirvetororAleatorio();

        // Bubble Sort
        long startTime = System.nanoTime();
        v.bubble_sort();
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Tempo de execução do Bubble Sort: " + duration + " nanossegundos");

        System.out.println("==============================================");

        // Selection Sort
        startTime = System.nanoTime();
        v.selection_sort();
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Tempo de execução do Selection Sort: " + duration + " nanossegundos");

        System.out.println("==============================================");

        // Insertion Sort
        startTime = System.nanoTime();
        v.insertion_sort();
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Tempo de execução do Insertion Sort: " + duration + " nanossegundos");
    }
}
