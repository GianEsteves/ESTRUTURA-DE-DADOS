package Trabalho01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LDECategoria implements ILDECategoria {
    private NohCategoria primeiro;
    private NohCategoria ultimo;

    public LDECategoria() {
        this.primeiro = null;
        this.ultimo = null;
    }

    @Override
    public void adicionarNohCategoria(NohCategoria novoNoh) {
        if (this.primeiro == null) {
            this.primeiro = novoNoh;
            this.ultimo = novoNoh;
        } else {
            this.ultimo.setProx(novoNoh);
            this.ultimo = novoNoh;
        }
    }

    @Override
    public void adicionarCategoriaInicio(NohCategoria novoNoh) {

        if (this.primeiro == null) {
            this.primeiro = novoNoh;
            this.ultimo = novoNoh;
        } else {
            novoNoh = this.primeiro;
            this.primeiro = novoNoh;
            this.primeiro = novoNoh;
        }
    }

    @Override
    public void adicionarCategoriaFim(NohCategoria novoNoh) {

        if (this.primeiro == null) {
            this.primeiro = novoNoh;
            this.ultimo = novoNoh;
        } else {
            novoNoh = this.ultimo;
            this.ultimo = novoNoh;
            this.ultimo = novoNoh;
        }
    }

    @Override
    public void imprimirNohCategoria() {
        NohCategoria atual = this.primeiro;
        while (atual != null) {
            System.out.println("codCategoria: " + atual.codCategoria);
            System.out.println("categoria: " + atual.categoria + " \n");
            atual = atual.getProx();

        }
    }

    @Override
    public void lerCsv() {

        String caminho = "C:\\Users\\giann\\OneDrive\\Área de Trabalho\\unipampa\\_Codigos\\Vscode\\ESTRUTURA-DE-DADOS\\Trabalho01\\Categorias.csv";
        try {
            FileReader arquivo = new FileReader(caminho);
            BufferedReader lerArquivo = new BufferedReader(arquivo);
            String linha = lerArquivo.readLine();
            linha = lerArquivo.readLine();
            ILDECategoria lista = new LDECategoria();
            while (linha != null) {
                String[] atributos = linha.split(";");
                int codCategoria = Integer.parseInt(atributos[0]);
                String categoria = atributos[1];
                NohCategoria novoNoh = new NohCategoria(codCategoria, categoria);
                lista.adicionarNohCategoria(novoNoh);
                linha = lerArquivo.readLine();
            }
            arquivo.close();
            lista.imprimirNohCategoria();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    @Override
    public void listarInicioFimCategoria() {
        NohCategoria atual = this.primeiro;
        while (atual != null) {
            System.out.println("Categoria: " + atual.categoria + ", Código Categoria: " + atual.codCategoria);
            atual = atual.getProx();
        }
    }

    @Override
    public void listarFimInicioCategoria() {
        NohCategoria atual = this.ultimo;
        while (atual != null) {
            System.out.println("Categoria: " + atual.categoria + ", Código Categoria: " + atual.codCategoria);
            atual = atual.getAnt();
        }

    }

    @Override
    public void editarCategoria(int codCategoria) {
        NohCategoria atual = this.primeiro;
        while (atual != null) {
            if (atual.getCodCategoria() == (codCategoria)) {
                atual.setCategoria(null);
                break;
            }
            atual = atual.getProx();
        }

    }

    // @Override
    /*
     * public void excluirCategoria(int codCategoria) {
     * NohCategoria atual = this.primeiro;
     * while (atual != null) {
     * if (atual.getCodCategoria() == (codCategoria)) {
     * if (atual == primeiro) {
     * primeiro = atual.getProx();
     * if (primeiro != null) {
     * primeiro.setAnt(null);
     * } else {
     * ultimo = null;
     * }
     * } else if (atual == ultimo) {
     * ultimo = atual.getAnt();
     * ultimo.setProx(null);
     * } else {
     * atual.getAnt().setProx(atual.getProx());
     * atual.getProx().setAnt(atual.getAnt());
     * }
     * break;
     * }
     * atual = atual.getProx();
     * }
     * 
     * }
     */
    @Override
    public void excluirCategoria(int codCategoria) throws NullPointerException, IllegalArgumentException {
        NohCategoria atual = this.primeiro;
        while (atual != null) {
            if (atual.getCodCategoria() == codCategoria) {
                if (atual == primeiro) {
                    primeiro = atual.getProx();
                    if (primeiro != null) {
                        primeiro.setAnt(null);
                    } else {
                        ultimo = null;
                    }
                } else if (atual == ultimo) {
                    ultimo = atual.getAnt();
                    ultimo.setProx(null);
                } else {
                    atual.getAnt().setProx(atual.getProx());
                    atual.getProx().setAnt(atual.getAnt());
                }
                break;
            }
            atual = atual.getProx();
        }
        if (atual == null) {
            throw new IllegalArgumentException("Código de categoria não encontrado na lista");
        }
    }

}
