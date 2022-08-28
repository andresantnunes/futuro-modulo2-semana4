package exercicio4;

import exercicio2.Cliente;

import java.util.List;

public class VendedorFilho extends VendedorImpl {
    public VendedorFilho(ClienteVip clienteVip, List<Cliente> catalogoClientes, Double salario) {
        super(clienteVip, catalogoClientes, salario);
    }

    public Double alteraDescontoClienteVip(Double valor){

    }

}
