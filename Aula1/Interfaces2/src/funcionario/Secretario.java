package funcionario;

public class Secretario implements Funcionario{
    private Double salario= 2000d;

    @Override
    public Double receberSalario(Integer horasTrabalhadas) {
        return salario * 1.2;
    }

    @Override
    public Boolean baterPonto() {
        return null;
    }

    @Override
    public void envelhecer() {

    }
}
