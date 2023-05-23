package Questao12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Recursividade r = new Recursividade();
        System.out.print("informe um numeor inteiro");
        int n = scanner.nextInt();

        r.exibirSomatorio(n);

    }
}
