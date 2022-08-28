package exercicio4;

import exercicio2.Cliente;

import java.util.List;

public interface Vendendor {
    // métodos não são obrigatórios para o exercicio 4
    List<Cliente> retornaClientes();
    Cliente retornaCliente(Integer index);
}
