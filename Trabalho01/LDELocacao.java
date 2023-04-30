package Trabalho01;

public class LDELocacao implements ILDELocacao{
    private NohLocacao primeiro;
    private NohLocacao ultimo;

    public LDELocacao(NohLocacao primeiro, NohLocacao ultimo){
        this.primeiro = primeiro;
        this.ultimo = ultimo;
    }

    public LDELocacao(NohCliente cliente, NohVeiculo veiculo) {
    }

    @Override
    public void adicionarNoLocacao(NohLocacao novoNoh) {
        if (this.primeiro == null) {
            this.primeiro = novoNoh;
            this.ultimo = novoNoh;
        } else {
            this.ultimo.setProx(novoNoh);
            this.ultimo = novoNoh;
        }
        
    }

    @Override
    public void adicionarLocacaoInicio(NohLocacao novoNoh) {

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
    public void adicionarLocacaoFim(NohLocacao novoNoh) {

        if (this.primeiro == null) {
            this.primeiro = novoNoh;
            this.ultimo = novoNoh;
        } else {
            novoNoh = this.ultimo;
            this.ultimo = novoNoh;
            this.ultimo = novoNoh;
        }
    }

    public void alocarVeiculoCliente(NohCliente cliente, NohVeiculo veiculo) {
        LDELocacao locacao = new LDELocacao(cliente, veiculo);
        NohLocacao novoNoh = new NohLocacao(locacao);
        adicionarNoLocacao(novoNoh);
        System.out.println("Veículo alocado com sucesso para o cliente " + cliente.getNome() + "!");
    }
    

    @Override
    public void excluirLocacao() {/*
            NohLocaçao noAtual = lista.getInicio(); // começa a percorrer a lista pelo início

            while (noAtual != null) {
                Locacao locacao = noAtual.getLocacao();
                
                if (locacao.getVeiculo().getPlaca().equals(placa)) { // encontra o nó que contém a locação com a placa do veículo desejado
                    if (noAtual == lista.getInicio()) { // se o nó a ser excluído é o primeiro
                        lista.setInicio(noAtual.getProximo()); // define o próximo nó como o início da lista
                    } else if (noAtual == lista.getFim()) { // se o nó a ser excluído é o último
                        lista.setFim(noAtual.getAnterior()); // define o nó anterior como o fim da lista
                    } else { // se o nó a ser excluído está no meio da lista
                        noAtual.getAnterior().setProximo(noAtual.getProximo()); // define o próximo nó do nó anterior como o próximo nó do nó atual
                        noAtual.getProximo().setAnterior(noAtual.getAnterior()); // define o nó anterior do próximo nó como o nó anterior do nó atual
                    }
                    break; // sai do loop após a exclusão ser realizada
                }
                
                noAtual = noAtual.getProximo(); // avança para o próximo nó
            }*/
        }
        
        

    @Override
    public void listarInicioFimLocacao() {
        
    }

    @Override
    public void listarFimInicioLocacao(){

    }
}


    