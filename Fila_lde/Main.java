package Fila_lde;

public class Main {
    public static void main(String[] args) {

        ILFila f = new LFila();
        f.adicionar("Jose");
        f.adicionar("Maria");
        f.adicionar("Pedro");
        f.adicionar("Ana");
        f.adicionar("Leticia");
        f.adicionar("Gabriele");
        f.adicionar("t");
        System.out.println("Imprimindo fila:");
        f.exibir();
        System.out.println("Tamanho da fila: " + f.size());
        System.out.println("----------------------------");
        System.out.println("Removendo elemento da fila:");
        f.excluir();
        f.exibir();
        System.out.println("Tamanho da fila: " + f.size());

    }

}
