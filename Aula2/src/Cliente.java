import java.util.ArrayList;
import java.util.List;

public class Cliente {
    // Associação one-to-many ou um-para-muitos
    private List<Produto> carrinhoProdutos = new ArrayList<>();
    private Double saldo = 2000d;

    public void adicionarCarrinho(Produto produto){
        carrinhoProdutos.add(produto);
    }

    public void adicionarCarrinho(Produto produto, Integer numeroProdutos){
        int i = 0;
        while(i < numeroProdutos){
            carrinhoProdutos.add(produto);
            i++;
        }
    }

    public Double finalizarCompra(){
        for(Produto produto: carrinhoProdutos ){
            saldo = saldo - produto.getValor();
        }
        return saldo;
    }

    public Double comprarProduto(Produto produto){
        return produto.getValor();
    }
}
