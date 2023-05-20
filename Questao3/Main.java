package Questao3;

public class Main {
    public static void main(String[] args) {
        int n = 12; // Defina o número do termo que deseja calcular
        
        FibonacciCalculator fb = new FibonacciCalculator();
        int termo = fb.calcularFibonacci(n);
        
        System.out.println("O " + n + "º termo da série de Fibonacci é: " + termo);
    }
}
