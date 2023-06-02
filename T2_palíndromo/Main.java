package T2_palíndromo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a palavra para verificação:");
        String palavra = scanner.next();

        int quantidadeLetras = palavra.length();
        PilhaVet p = new PilhaVet(quantidadeLetras, palavra);

        for (int i = 0; i < quantidadeLetras; i++) {
            char letra = palavra.charAt(i);
            //System.out.println("Letra " + (i+1) + ": " + letra);
            p.push(letra);
        }

        //p.exibirPilha();
        p.comparar();
    }
}
