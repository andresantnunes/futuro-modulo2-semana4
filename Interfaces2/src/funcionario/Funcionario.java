package funcionario;

import pessoa.Pessoa;

public interface Funcionario extends Pessoa {
    //quando extendemos uma interface trazemos todos
    //os métodos dessa interface para a interface atual
    Double receberSalario(Integer horasTrabalhadas);
    Boolean baterPonto();
    // void envelhecer() -> vem da Interface Pessoa
}
