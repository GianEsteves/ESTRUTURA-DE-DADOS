package Trabalho01;

public interface ILDECategoria {

    void adicionarNohCategoria(NohCategoria novoNoh);

    void adicionarCategoriaInicio(NohCategoria novoNoh);

    void adicionarCategoriaFim(NohCategoria novoNoh);

    void imprimirNohCategoria();


    void lerCsv();

    void listarInicioFimCategoria();

    void listarFimInicioCategoria();

    void editarCategoria(int codCategoria);

    void excluirCategoria(int codCategoria);

}