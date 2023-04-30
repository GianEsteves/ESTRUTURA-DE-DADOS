package Trabalho01;

public interface ILDELocacao {
    void adicionarNoLocacao(NohLocacao novoNoh);
    void adicionarLocacaoInicio(NohLocacao novoNoh);
    void adicionarLocacaoFim(NohLocacao novoNoh);
    void excluirLocacao();
    void listarInicioFimLocacao();
    void listarFimInicioLocacao();

}
