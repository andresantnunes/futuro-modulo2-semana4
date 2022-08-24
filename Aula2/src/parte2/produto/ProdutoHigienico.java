package parte2.produto;

// ProdutoHigienico é um tipo de Produto
// ProdutoHigienico IS-A Produto
public class ProdutoHigienico implements Produto {
    private Double valor;
    private String nomeProduto;

    public ProdutoHigienico(Double valor, String nomeProduto) {
        this.valor = valor;
        this.nomeProduto = nomeProduto;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
}
