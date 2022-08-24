package funcionario;

public class Faxineiro implements Funcionario{
    private Double salario = 1500d;

    @Override
    public Double receberSalario(Integer h) {
        return this.salario * 1.1;
    }

    @Override
    public Boolean baterPonto() {
        return null;
    }

    @Override
    public void envelhecer() {

    }
}
