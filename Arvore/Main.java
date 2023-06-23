package Arvore;

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
        arvore.encontrado(5);
        arvore.encontrado(95);
    }
}
