package parte2.cliente;

import parte2.produto.ProdutoHigienico;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    // Associação (zero)one-to-many ou (zero)um-para-muitos
    // cliente.Cliente HAS-A Lista de ProdutoHigienico
    private List<ProdutoHigienico> carrinhoProdutoHigienicos = new ArrayList<>();
    private Double saldo = 2000d; //não é uma classe que criamos, não entra na Associação

    public void adicionarCarrinho(ProdutoHigienico produto){
        carrinhoProdutoHigienicos.add(produto);
    }

    public void adicionarCarrinho(ProdutoHigienico produto, Integer numeroProdutoHigienicos){
        int i = 0;
        while(i < numeroProdutoHigienicos){
            carrinhoProdutoHigienicos.add(produto);
            i++;
        }
    }

    public Double finalizarCompra(){
        for(ProdutoHigienico produto: carrinhoProdutoHigienicos ){
            saldo = saldo - produto.getValor();
        }
        return saldo;
    }

    public Double comprarProdutoHigienico(ProdutoHigienico produto){
        return produto.getValor();
    }
}
