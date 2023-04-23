package Trabalho01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LCategoria {
    private NohCategoria primeiro;
    private NohCategoria ultimo;
    public LCategoria() {
        this.primeiro = null;
        this.ultimo = null;
    }
    
    public void adicionarNohCategoria(NohCategoria novoNoh) {
        if (this.primeiro == null) {
            this.primeiro = novoNoh;
            this.ultimo = novoNoh;
        } else {
            this.ultimo.setProx(novoNoh);
            this.ultimo = novoNoh;
        }
    }

    public void imprimirNohCategoria() {
        NohCategoria atual = this.primeiro;
        while (atual != null) {
            System.out.println("codCategoria: " + atual.codCategoria);
            System.out.println("categoria: " + atual.categoria +" \n");
            atual = atual.getProx();
            
        }
    }
    public void lerCsv(){
        
        String caminho = "C:\\Users\\giann\\OneDrive\\Área de Trabalho\\unipampa\\_Codigos\\Vscode\\ESTRUTURA-DE-DADOS\\Trabalho01\\Categorias.csv";
        try {
            FileReader arquivo = new FileReader(caminho);
            BufferedReader lerArquivo = new BufferedReader(arquivo);
            String linha = lerArquivo.readLine(); // lê a primeira linha do arquivo (cabeçalho)
            linha = lerArquivo.readLine(); // lê a próxima linha
            LCategoria lista = new LCategoria();
            while (linha != null) {
                String[] atributos = linha.split(";");
                int codCategoria = Integer.parseInt(atributos[0]);
                String categoria = atributos[1];
                NohCategoria novoNoh = new NohCategoria(codCategoria, categoria);
                lista.adicionarNohCategoria(novoNoh);
                linha = lerArquivo.readLine(); // lê a próxima linha
            }
            arquivo.close();
            lista.imprimirNohCategoria();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
