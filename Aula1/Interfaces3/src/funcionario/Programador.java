package funcionario;

public class Programador implements Funcionario{
    private Double bonus = 34.5;
    private Double valorBase = 3000d;

    @Override
    public Double receberSalario(Integer horasExtra) {
        return valorBase + (bonus * horasExtra);
    }

    @Override
    public Boolean baterPonto() {
        return null;
    }

    @Override
    public void envelhecer() {

    }
}
