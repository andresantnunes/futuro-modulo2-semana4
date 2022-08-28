package exercicio4;

import exercicio2.Cliente;

public class ClienteVip implements Cliente {
    private Double saldo;
    private Double desconto = .1; //10%
    private Integer id;

    public ClienteVip(Double saldo, Double desconto, Integer id) {
        this.saldo = saldo;
        this.desconto = desconto;
        this.id = id;
    }

    @Override
    public Double comprar(Double valorProduto) {
        saldo -= (valorProduto * (1-desconto));
        return saldo;
    }

    @Override
    public Double adicionarSaldo(Double deposito) {
        saldo += deposito;
        return saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }
}
