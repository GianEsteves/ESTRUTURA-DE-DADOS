package Mapa_Vetor;

public class Main {
    public static void main(String[] args) {
        MapaVetor mapa = new MapaVetor();

        // Criando alguns alunos
        Aluno aluno1 = new Aluno("João", 20, "123");
        Aluno aluno2 = new Aluno("Maria", 22, "456");
        Aluno aluno3 = new Aluno("Pedro", 19, "789");

        // Inserindo alunos no mapa
        mapa.put(aluno1);
        mapa.put(aluno2);
        mapa.put(aluno3);

        // Obtendo um aluno pelo número de matrícula
        Aluno alunoEncontrado = mapa.get("456");
        if (alunoEncontrado != null) {
            System.out.println("Aluno encontrado: " + alunoEncontrado.getNome());
        } else {
            System.out.println("Aluno não encontrado.");
        }

        // Removendo um aluno pelo número de matrícula
        mapa.remove("123");

        // Imprimindo todos os alunos do mapa
        mapa.imprime();
    }
}
