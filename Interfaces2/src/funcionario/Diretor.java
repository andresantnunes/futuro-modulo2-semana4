package funcionario;

public class Diretor implements Funcionario{
    private Double valorHora = 20.0;

    private final Double VALORBASE = 4000.0; // constante em maiúsculo

    @Override
    public Double receberSalario(Integer horasTrabalhadas) {

        return (VALORBASE+(valorHora*horasTrabalhadas))*1.1 ;
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

    public Double getVALORBASE() {
        return VALORBASE;
    }
}
