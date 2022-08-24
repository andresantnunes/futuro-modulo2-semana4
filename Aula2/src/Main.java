public class Main {
    public static void main(String[] args) {
        Cliente cliente= new Cliente();
        Produto produto= new Produto(5d, "sabão");

        cliente.adicionarCarrinho(produto);
        System.out.println("Produto: "
                +produto.getNomeProduto()
                +"; Saldo após a compra: "
                +cliente.finalizarCompra());
    }
}
