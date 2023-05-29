package Questao12;

public class Recursividade {
    public int somatorio(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + somatorio(n - 1);
        }
    }
    
    public void exibirSomatorio(int n) {
        int resultado = somatorio(n);
        System.out.println("O somatório dos números de 1 até " + n + " é: " + resultado);
    }


}
