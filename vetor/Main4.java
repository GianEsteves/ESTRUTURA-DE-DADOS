package vetor;

public class Main4 {

	public static void main(String[] args) {
		// cria o vetor
        Vetor alunos = new Vetor();
		// adiciona os alunos 
		alunos.adiciona(new Aluno("maria",21,9.5));
		alunos.adiciona(new Aluno("wil", 27, 180));
		alunos.adiciona(new Aluno("ana",21,9.5));
		alunos.adiciona(new Aluno("eduarda", 27, 0));
		alunos.adiciona(new Aluno("gabriele",21,5.5));
		alunos.adiciona(new Aluno("lucas", 27, 6.8));
		// print do resultado 
		System.out.println(alunos.tamanho());
		System.out.println(alunos.cheio());
		System.out.println();	
		System.out.println();
		System.out.println();
		// adicionar o resto e implementar o metodo remove	

	}

}
