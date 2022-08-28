package exercicio2;

public class ClienteNormal implements Cliente {
    private Double saldo;
    @Override
    public Double comprar(Double valorProduto) {
        saldo -= valorProduto;
        return saldo;
    }

    @Override
    public Double adicionarSaldo(Double deposito) {
        saldo += deposito;
        return saldo;
    }


}
