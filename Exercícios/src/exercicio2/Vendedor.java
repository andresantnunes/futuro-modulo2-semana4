package exercicio2;

import exercicio1.Funcionario;

public class Vendedor implements Funcionario {
    private Double salario;
    private Double valorBase = 10d;
    @Override
    public void baterPonto() {
        System.out.println("Ponto Batido Vendedor");
    }

    @Override
    public Double receberSalario(Integer horas) {
        return salario += valorBase * horas;
    }

    public Double venda(Double valorVenda){
        return salario += valorVenda * 0.1; // salario + 10% da venda
    }
}
