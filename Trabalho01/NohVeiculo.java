package Trabalho01;

public class NohVeiculo {
    protected String placa;
    protected String modelo;
    protected String marca;
    protected int ano;
    protected double potencia;
    protected int nLugares;
    protected int categoria;
    private NohVeiculo proximo;
    protected NohVeiculo ant;
    private NohVeiculo info;

    public NohVeiculo(String placa, String modelo, String marca, int ano, double potencia, int nLugares, int categoria) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.potencia = potencia;
        this.nLugares = nLugares;
        this.categoria = categoria;
    }

    public NohVeiculo(String placa, String modelo, String marca, int ano, double potencia, int nLugares, int categoria, NohVeiculo info, NohVeiculo ant) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.potencia = potencia;
        this.nLugares = nLugares;
        this.proximo = null;
        this.categoria = categoria;
        this.info = info;
        this.ant = null;
    }

    public void setProx(NohVeiculo n) { this.proximo = n; }

    public void setAnt(NohVeiculo n) { this.ant = n; }
    
    public NohVeiculo getInfo() {
        return this.info;
    }
    public NohVeiculo getProx() {
        return this.proximo;
    }
    public NohVeiculo getAnt() {
        return this.ant;
    }
}