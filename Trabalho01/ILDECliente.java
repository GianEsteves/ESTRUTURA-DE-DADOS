package Trabalho01;

public interface ILDECliente {

    void adicionarNoCliente(NohCliente novoNoh);

    void adicionarClienteInicio(NohCliente novoNoh);

    void adicionarClienteFim(NohCliente novNoh);

    void exibirClientes();

    void listarClientif();

    void listarClientfi();

    void editarCliente(Long cpf);

    void excluirCliente(Long cpf);

}