package funcionario;

public class Faxineiro implements Funcionario{
    private Double salario = 1500d;

    @Override
    public Double receberSalario(Integer horasTrabalhadas) {
        horasTrabalhadas -= 8;
        return this.salario + (horasTrabalhadas*salario*.1);
    }

    @Override
    public Boolean baterPonto() {
        return null;
    }

    @Override
    public void envelhecer() {

    }
}
