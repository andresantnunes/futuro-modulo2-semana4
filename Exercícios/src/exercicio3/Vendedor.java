package exercicio3;

import exercicio1.Funcionario;

import java.util.List;

public class Vendedor implements Funcionario {
    private Double salario;
    private Double valorBase = 10d;
    private List<Produto> produtosVendidos; // 1..N Produtos

    //não é obrigatório
    public Vendedor(Double salario, Double valorBase, List<Produto> produtosVendidos) {
        this.salario = salario;
        this.valorBase = valorBase;
        this.produtosVendidos = produtosVendidos;
    }

    @Override
    public void baterPonto() {
        System.out.println("Ponto Batido Vendedor");
    }

    @Override
    public Double receberSalario(Integer horas) {
        return salario += valorBase * horas;
    }

    public Double venda(Produto produto){
        if(produtosVendidos.contains(produto)){
            return salario += produto.getValor() * 0.1; // salario + 10% da venda
        }
        else {
            System.out.println("Produto não é vendido por esse vendedor");
            return -1d;
        }
    }

    //não é obrigatório
    public void adicionaProduto(Produto produto){
        produtosVendidos.add(produto);
    }

}
