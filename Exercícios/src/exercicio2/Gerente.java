package exercicio2;

import exercicio1.Funcionario;

public class Gerente implements Funcionario {
    private Double salario;
    private Double valorBase = 12d;
    @Override
    public void baterPonto() {
        System.out.println("Ponto Batido");
    }

    @Override
    public Double receberSalario(Integer horas) {
        return salario += horas * valorBase * 1.1;
    }
}
