package Remocao_Arvore;

public class Main {
    public static void main(String args[]) {
        ABB arvore = new ABB();
        arvore.add(15);
        arvore.add(12);
        arvore.add(24);
        arvore.add(45);
        arvore.add(16);
        arvore.add(5);
        arvore.add(2);
        arvore.add(4);
        arvore.add(5);
        arvore.add(9);
        arvore.imprime();
        // arvore.busca(null, 9);
        arvore.encontradoComum(9);
        arvore.encontradoComum(95);
        System.out.println("\n");

        arvore.encontradoIter(9);
        arvore.encontradoIter(95);
        System.out.println("\n");

        arvore.encontradoOrdem(9);
        arvore.encontradoOrdem(95);
        System.out.println("\n");

        arvore.encontradoRec(9);
        arvore.encontradoRec(95);
        System.out.println("\n");

        arvore.encontradoemOrdem(9);
        arvore.encontradoemOrdem(95);
        System.out.println("\n");

        arvore.encontradoemposOrdem(9);
        arvore.encontradoemposOrdem(95);
        System.out.println("\n");

        arvore.remove(null, 9);
        arvore.encontradoComum(9);
    }
}
