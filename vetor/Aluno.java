package vetor;

public class Aluno {

    double nota;
    String nome;
    int idade;

    public Aluno(String nome, int idade, double nota){
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}