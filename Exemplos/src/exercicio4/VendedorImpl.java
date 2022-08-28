package exercicio4;

import exercicio2.Cliente;

import java.util.List;

public class VendedorImpl implements Vendendor {
//    private ClienteVip clienteVip = new ClienteVip(); //dependencia
//dependencia
    private ClienteVip clienteVip ; // eu preciso ter 1 ClienteVip
    private List<Cliente> catalogoClientes;
    private Double salario;

    public VendedorImpl(ClienteVip clienteVip, // terceirizando a criação de cliente vip -> inversão de controle
                        List<Cliente> catalogoClientes,
                        Double salario) {
        this.clienteVip = clienteVip;
        this.catalogoClientes = catalogoClientes;
        this.salario = salario;
    }

    public ClienteVip getClienteVip() {
        return clienteVip;
    }

    public void setClienteVip(ClienteVip clienteVip) {
        this.clienteVip = clienteVip;
    }

    public List<Cliente> getCatalogoClientes() {
        return catalogoClientes;
    }

    public void setCatalogoClientes(List<Cliente> catalogoClientes) {
        this.catalogoClientes = catalogoClientes;
    }

    @Override
    public List<Cliente> retornaClientes() {
        return this.catalogoClientes;
    }

    @Override
    public Cliente retornaCliente(Integer index) {
        return this.catalogoClientes.get(index);
    }

    public Double retornaDescontoClienteVip(){
        return clienteVip.getDesconto();
    }
    public Double retornaDescontoClienteVip(Double valor){
        System.out.println("desconto alterado e retornado");
        clienteVip.setDesconto(valor);
        return clienteVip.getDesconto();
    }

    public void vendasPorVendedor(){

    }
    public Double calculaSalario(Integer horas){
        Double valorHoras = valorHoras(horas)
        return salario += valorHoras;
    }

    public Double valorHoras(Double horas){
        return 10 * horas;
    }
}
