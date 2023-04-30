package Trabalho01;

public class Main {
    public static void main(String args[]) {
        

        NohVeiculo nohVeiculo = new NohVeiculo("abc1234", "nao sei", "sei la", 2004, 250, 5, 1010);
        LDEVeiculo lVeiculo = new LDEVeiculo();
        lVeiculo.adicionarNohVeiculo(nohVeiculo);
        lVeiculo.listarInicioFimVeiculo();

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