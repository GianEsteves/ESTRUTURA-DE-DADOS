package Mapa_Vetor;

public class Main {
    public static void main(String[] args) {

        MapaHashLSE mapa = new MapaHashLSE();

        Aluno a1 = new Aluno(1, "Ana", 8.0, 18);
        Aluno a2 = new Aluno(2, "Maria", 7.0, 20);
        Aluno a3 = new Aluno(3, "Gabriela", 9.0, 25);

        mapa.put(a1.getMatricula(), a1);
        mapa.put(a2.getMatricula(), a2);
        mapa.put(a3.getMatricula(), a3);

        System.out.println(mapa.get(1));
        System.out.println(mapa.get(2));
        System.out.println(mapa.get(3));

        mapa.put(1, new Aluno(1, "Tamirez", 2.0, 62));
        System.out.println(mapa.get(1));
        
    }

}