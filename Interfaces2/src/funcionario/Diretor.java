package funcionario;

public class Diretor implements Funcionario{
    private Double valorHora = 20.0;

    @Override
    public Double receberSalario(Integer horasTrabalhadas) {

        return (valorHora*horasTrabalhadas)*1.1 ;
    }

    @Override
    public Boolean baterPonto() {
        return null;
    }

    @Override
    public void envelhecer() {

    }

    public Double getValorHora() {
        return valorHora;
    }
}
