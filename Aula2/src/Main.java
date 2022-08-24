public class Main {
    public static void main(String[] args) {
        Cliente cliente= new Cliente();
        Produto produto= new Produto(5d, "sabão");
        Produto produto2= new Produto(10d, "desodorante");

        cliente.adicionarCarrinho(produto);
        cliente.adicionarCarrinho(produto2,3);


        System.out.println("Produto: \""
                +produto.getNomeProduto()
                +"\"; \nSaldo após a compra: "
                +cliente.finalizarCompra());
    }
}
