package Trabalho01;

public class Categoria {
    private String nome;
    private int indentificador;
    
    public Categoria(String nome, int indentificador) {
        this.nome = nome;
        this.indentificador = indentificador;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIndentificador() {
        return indentificador;
    }
    public void setIndentificador(int indentificador) {
        this.indentificador = indentificador;
    }
    @Override
    public String toString() {
        return "Categoria [nome=" + nome + ", indentificador=" + indentificador + "]";
    }
    
    
}
