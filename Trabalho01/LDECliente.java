package Trabalho01;

public class LDECliente implements ILDECliente {
    private NohCliente primeiro;
    private NohCliente ultimo;
    private int tamanho;

    public LDECliente(NohCliente primeiro, NohCliente ultimo) {
        this.primeiro = null;
        this.ultimo = null;
    }

    @Override
    public void adicionarNoCliente(NohCliente novoNoh) {
        if (this.primeiro == null) {
            this.primeiro = novoNoh;
            this.ultimo = novoNoh;
        } else {
            this.ultimo.setProx(novoNoh);
            this.ultimo = novoNoh;
        }
    }

    @Override
    public void adicionarClienteInicio(NohCliente novoNoh) {
        /* NohCliente novoCliente = new NohCliente(null, 0, 0, 0); */

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
    public void adicionarClienteFim(NohCliente novoNoh) {
        /* NohCliente novoCliente = new NohCliente(null, 0, 0, 0); */

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
    public void exibirClientes() {
        NohCliente atual = this.primeiro;
        while (atual != null) {
            System.out.println("Nome: " + atual.nome + ", CNH: " + atual.cnh + ", Telefone: " + atual.telefone
                    + ", CPF: " + atual.cpf);
            atual = atual.getProx();
        }
    }

    @Override
    public void listarClientif() {
        NohCliente atual = this.primeiro;
        while (atual != null) {
            System.out.println("Nome: " + atual.nome + ", CNH: " + atual.cnh + ", Telefone: " + atual.telefone
                    + ", CPF: " + atual.cpf);
            atual = atual.getProx();
        }

    }

    @Override
    public void listarClientfi() {
        NohCliente atual = this.ultimo;
        while (atual != null) {
            System.out.println("Nome: " + atual.nome + ", CNH: " + atual.cnh + ", Telefone: " + atual.telefone
                    + ", CPF: " + atual.cpf);
            atual = atual.getProx();
        }

    }

    @Override
    public void editarCliente(Long cpf) {
        NohCliente atual = this.primeiro;
        while (atual != null) {
            if (atual.getCpf() == (cpf)) {
                atual.setNome(null);
                atual.setCnh(0);
                atual.setTelefone(0);
                break;
            }
            atual = atual.getProx();
        }

    }

    // @Override
    /*
     * public void excluirCliente(Long cpf) {
     * NohCliente atual = this.primeiro;
     * while (atual != null) {
     * if (atual.getCpf()==(cpf)) {
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
     * }
     * /*public void excluirCliente(Cliente cliente) {
     * // Verifica se o cliente está atrelado a uma locação
     * for (Locacao locacao : listaLocacoes) {
     * if (locacao.getCliente() == cliente) {
     * System.out.println("Não é possível excluir o cliente " + cliente.getNome() +
     * " pois está atrelado a uma locação.");
     * return;
     * }
     * }
     * 
     * // Remove o cliente da lista
     * NoListaDupla atual = primeiro;
     * while (atual != null) {
     * if (atual.getCliente() == cliente) {
     * if (atual == primeiro) {
     * primeiro = atual.getProximo();
     * } else {
     * atual.getAnterior().setProximo(atual.getProximo());
     * }
     * if (atual == ultimo) {
     * ultimo = atual.getAnterior();
     * } else {
     * atual.getProximo().setAnterior(atual.getAnterior());
     * }
     * System.out.println("O cliente " + cliente.getNome() +
     * " foi excluído com sucesso.");
     * return;
     * }
     * atual = atual.getProximo();
     * }
     * System.out.println("O cliente " + cliente.getNome() +
     * " não foi encontrado na lista.");
     * }
     */
    @Override
    public void excluirCliente(Long cpf) {
        if (tamanho == 0) {
            System.out.println("A lista está vazia!");
        } else {
            NohCliente atual = primeiro;
            while (atual != null && atual.getCpf() != cpf) {
                atual = atual.getProx();
            }
            if (atual == null) {
                System.out.println("O cliente não foi encontrado!");
            } else {
                if (atual.getAnt() != null) {
                    atual.getAnt().setProx(atual.getProx());
                } else {
                    primeiro = atual.getProx();
                }
                if (atual.getProx() != null) {
                    atual.getProx().setAnt(atual.getAnt());
                } else {
                    ultimo = atual.getAnt();
                }
                tamanho--;
                System.out.println("O cliente " + atual.getNome() + " foi removido com sucesso!");
            }
        }
    }

}

// outros métodos da lista (ex: remover, buscar, etc.)