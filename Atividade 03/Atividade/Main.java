
public class Main {
    public static void main(String[] args){
        Vetor vetAlunos = new Vetor(5);

        Aluno aluno1 = new Aluno("joao", 16, 5.2);
        Aluno aluno2 = new Aluno("maria", 17, 9.9);

        vetAlunos.adiciona(aluno1);
        vetAlunos.adiciona(aluno2);

        System.out.println(vetAlunos.tamanho());
        System.out.println(vetAlunos.contem(aluno1));
        System.out.println(vetAlunos.contem(aluno2));
    }
}