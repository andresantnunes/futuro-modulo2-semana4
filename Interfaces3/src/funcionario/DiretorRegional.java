package funcionario;

public class DiretorRegional extends Diretor {
    // Diretor é um Class normal que contém implementação de código
    // DiretorRegional tem os mesmos métodos que Diretor
    // DiretorRegional vai ter a mesma resposta de Diretor


    @Override
    public Double receberSalario(Integer horasTrabalhadas) {
//        return super.receberSalario(horasTrabalhadas);
        // super é a classe cima, no caso o diretor
        return (super.getVALORBASE()+ (horasTrabalhadas * super.getValorHora())) * 1.2;
    }

    public void contratarFuncionario(){

    }
}
