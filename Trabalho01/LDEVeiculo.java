package Trabalho01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LDEVeiculo implements ILDEVeiculo {
    private NohVeiculo primeiro;
    private NohVeiculo ultimo;

    public LDEVeiculo() {
        this.primeiro = null;
        this.ultimo = null;
    }

    @Override
    public void adicionarNohVeiculo(NohVeiculo novoNoh) {
        if (this.primeiro == null) {
            this.primeiro = novoNoh;
            this.ultimo = novoNoh;
        } else {
            this.ultimo.setProx(novoNoh);
            this.ultimo = novoNoh;
        }
    }

    @Override
    public void imprimirNohVeiculo() {
        NohVeiculo atual = this.primeiro;
        while (atual != null) {
            System.out.println("placa: " + atual.placa);
            System.out.println("Modelo: " + atual.modelo);
            System.out.println("marca: " + atual.marca);
            System.out.println("ano: " + atual.ano);
            System.out.println("potencia: " + atual.potencia);
            System.out.println("Categoria" + atual.categoria + "\n");
            atual = atual.getProx();
            
        }
    }

    @Override
    public void lerCsv(){
        
        String caminho = "C:\\Users\\giann\\OneDrive\\Área de Trabalho\\unipampa\\_Codigos\\Vscode\\ESTRUTURA-DE-DADOS\\Trabalho01\\Veiculos.csv";
        try {
            FileReader arquivo = new FileReader(caminho);
            BufferedReader lerArquivo = new BufferedReader(arquivo);
            String linha = lerArquivo.readLine(); 
            linha = lerArquivo.readLine(); 
            ILDEVeiculo lista = new LDEVeiculo();
            while (linha != null) {
                String[] atributos = linha.split(";");
                String placa = atributos[0];
                String modelo = atributos[1];
                String marca = atributos[2];
                int ano = Integer.parseInt(atributos[3]);
                double potencia = Double.parseDouble(atributos[4]);
                int nLugares = Integer.parseInt(atributos[5]);
                int categoria = Integer.parseInt(atributos[6]);
                NohVeiculo novoNoh = new NohVeiculo(placa, modelo, marca, ano, potencia, nLugares, categoria);
                lista.adicionarNohVeiculo(novoNoh);
                linha = lerArquivo.readLine();
            }
            arquivo.close();
            lista.imprimirNohVeiculo();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    @Override
    public void addVeiculo(){

    }

    @Override
    public void editarVeiculo(){

    }

    @Override
    public void excluirVeiculo(){

    }

    
}