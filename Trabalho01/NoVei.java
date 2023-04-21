package Trabalho01;

public class NoVei {
    private Veiculo veiculo;
    private NoVei proximo;
    private NoVei anterior;

    public NoVei(Veiculo veiculo) {
            this.veiculo = veiculo;
        }

    // getters e setters
    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public NoVei getProximo() {
        return proximo;
    }

    public void setProximo(NoVei proximo) {
        this.proximo = proximo;
    }

    public NoVei getAnterior() {
        return anterior;
    }

    public void setAnterior(NoVei anterior) {
        this.anterior = anterior;
    }
}
