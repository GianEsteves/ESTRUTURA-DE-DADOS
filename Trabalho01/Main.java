package Trabalho01;

public class Main {
    public static void main(String args[]) {

        /*NohVeiculo nohVeiculo = new NohVeiculo("abc1234", "nao sei", "sei la", 2004, 250, 5, 1010);
        LDEVeiculo lVeiculo = new LDEVeiculo();
        lVeiculo.adicionarNohVeiculo(nohVeiculo);
        lVeiculo.listarInicioFimVeiculo();*/

        NohCliente nohCliente = new NohCliente("Tamires Antunes Nunes", 123456, 997964423, 23548896);
        LDECliente novoCliente = new LDECliente(nohCliente, nohCliente);
        novoCliente.adicionarClienteInicio(nohCliente);
        novoCliente.listarClientfi();

        NohCliente nohCliente2 = new NohCliente("Camila Fernandes", 987654, 995451979, 32456987);
        LDECliente novoCliente2 = new LDECliente(nohCliente, nohCliente2);
        novoCliente2.adicionarClienteFim(nohCliente2);
        novoCliente2.listarClientif();

        NohCategoria nohCategoria = new NohCategoria(1234, "Sedan");
        LDECategoria novaCategoria = new LDECategoria();
        novaCategoria.adicionarCategoriaInicio(nohCategoria);
        novaCategoria.listarInicioFimCategoria();

        NohCategoria nohCategoria2 = new NohCategoria(65489, "S.U.V");
        LDECategoria novaCategoria2 = new LDECategoria();
        novaCategoria2.adicionarCategoriaFim(nohCategoria2);
        novaCategoria2.listarFimInicioCategoria();

        NohVeiculo nohVeiculo = new NohVeiculo("IVI-5T72","Camaro", "Chevrolet", 2012,450, 4, 0);
        LDEVeiculo novoVeiculo = new LDEVeiculo();
        novoVeiculo.adicionarVeiculoInicio(nohVeiculo);
        novoVeiculo.listarInicioFimVeiculo();

        NohVeiculo nohVeiculo2 = new NohVeiculo("TAM-2I96","Sedan", "Chevrolet", 2019,500, 4, 0);
        LDEVeiculo novoVeiculo2 = new LDEVeiculo();
        novoVeiculo2.adicionarVeiculoFim(nohVeiculo2);
        novoVeiculo2.listarFimInicioVeiculo();

        NohLocacao nohLocacao = new NohLocacao();
        LDELocacao novaLocacao = new LDELocacao(nohCliente, nohVeiculo);
        novaLocacao.adicionarLocacaoInicio(nohLocacao);
        novaLocacao.listarInicioFimLocacao(nohLocacao);

        NohLocacao nohLocacao2 = new NohLocacao();
        LDELocacao novaLocacao2 = new LDELocacao(nohCliente2, nohVeiculo2);
        novaLocacao2.adicionarLocacaoFim(nohLocacao2);
        novaLocacao2.listarFimInicioLocacao(nohLocacao2);
        
        NohLocacao testar = new NohLocacao();
        LDELocacao novoteste = new LDELocacao(nohLocacao2, testar);
        novoteste.alocarVeiculoCliente(nohCliente2, nohVeiculo2);
        novoteste.excluirLocacao(nohVeiculo2);
        novoteste.visualizarLocacoes();
        

        //lv.imprimirNohVeiculo();

        //LCategoria lc = new LCategoria();
        //lc.lerCsv();

        //NoCli novoCliente = new NoCli("João", 123456789, 987654321, 1122233344);
        //LDECli listaClientes = new LDECli(null, null);
        //listaClientes.adicionarCliente(novoCliente);

        //LDECli lCli = new LDECli(null, null);
        //lCli.adicionarCliente(null);
        /* 
        LDECat lista = new LDECat();

        Categoria categoria1 = new Categoria("Esportivo", 1010);
        Categoria categoria2 = new Categoria("Sedan Compacto", 1011);
        Categoria categoria3 = new Categoria("Sedan Médio", 1012);

        lista.incluirCategoria(categoria1);
        lista.incluirCategoria(categoria2);
        lista.incluirCategoria(categoria3);

        System.out.println(categoria1);
        System.out.println(categoria2);
        System.out.println(categoria3);

        LDECli listaC = new LDECli();

        Cliente cliente1 = new Cliente("Luiza Dotta", 123456789, 79864, 1245556901);
        Cliente cliente2 = new Cliente("Adriano Ferreira Gonçalves", 98765432, 456987, 812365487);

        listaC.incluirCliente(cliente1);
        listaC.incluirCliente(cliente2);

        System.out.println(cliente1);
        System.out.println(cliente2);

        LDEVei listaV = new LDEVei();

        Veiculo veiculo1 = new Veiculo("IVI-5T72","Camaro", "Chevrolet", 2012,450, 4);
        Veiculo veiculo2 = new Veiculo("IVJ-5B65", "Civic", "Honda", 2020, 155, 5);

        listaV.incluirVeiculo(veiculo1);
        listaV.incluirVeiculo(veiculo2);

        System.out.println(veiculo1);
        System.out.println(veiculo2);
        */
     
    }
}