package Trabalho01;

public class LDECli {
    private NoCli primeiro;
    private NoCli ultimo;
    private int tamanho;

    public void incluirCliente(Cliente cliente) {
        NoCli novoNo = new NoCli(cliente);

        if (primeiro == null) {
            primeiro = novoNo;
            ultimo = novoNo;
        } else {
            novoNo.setAnterior(ultimo);
            ultimo.setProximo(novoNo);
            ultimo = novoNo;
        }
    }

    public void editar(long cpf, Cliente novoCliente) {
        if(tamanho == 0) {
            System.out.println("A lista está vazia!");
        } else {
            NoCli atual = primeiro;

            while (atual != null && atual.getCliente().getCpf() != cpf) {
                atual = atual.getProximo();
            }

            if (atual == null) {
                System.out.println("O cliente não foi encontrado!");
            } else {
                atual.setCliente(novoCliente);
                System.out.println("O cliente " + novoCliente.getNome() + " foi editado com sucesso!");
            }
        }
    }

    public void excluir(long cpf) {
        if (tamanho == 0) {
            System.out.println("A lista está vazia!");
        } else {
            NoCli atual = primeiro;

            while (atual != null && atual.getCliente().getCpf() != cpf) {
                atual = atual.getProximo();
            }

            if (atual == null) {
                System.out.println("O cliente não foi encontrado!");
            } else {
                if(atual.getAnterior() != null) {
                    atual.getAnterior().setProximo(atual.getProximo());
                } else {
                    primeiro = atual.getProximo();
                }
                if(atual.getProximo() != null) {
                    atual.getProximo().setAnterior(atual.getAnterior());
                } else {
                    ultimo = atual.getAnterior();
                }
                tamanho--;
                System.out.println("O cliente " + atual.getCliente().getNome() + " foi removido com sucesso!");
            }
        }

     public void listarClientes() {
        if(tamanho == 0) {
            System.out.println("A lista está vazia!");
        } else {
            NoCli atual = primeiro;
            int contador = 1;
            while (atual != null) {
                System.out.println(contador + " - " + atual.getCliente().toString());
                atual = atual.getProximo();
                contador++;
            }
        }
    }
    // outros métodos da lista (ex: remover, buscar, etc.)
}
