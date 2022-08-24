package parte2;

import parte2.cliente.Cliente;
import parte2.produto.ProdutoHigienico;

public class Main {
    public static void main(String[] args) {
        Cliente cliente= new Cliente();
        ProdutoHigienico produto= new ProdutoHigienico(5d, "sabão");
        ProdutoHigienico produto2= new ProdutoHigienico(10d, "desodorante");

        cliente.adicionarCarrinho(produto);
        cliente.adicionarCarrinho(produto2,3);


        System.out.println("Produto: \""
                +produto.getNomeProduto()
                +"\"; \nSaldo após a compra: "
                +cliente.finalizarCompra());

        ProdutoHigienico produto3 = new ProdutoHigienico(5d, "Escova de Dente");

        Cliente cliente2 = new Cliente();

    }
}
