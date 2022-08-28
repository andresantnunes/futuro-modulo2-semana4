package exercicio4;

import exercicio1.Funcionario;
import exercicio2.Gerente;

import java.util.List;

public class FilialImpl implements Filial{
    private Gerente gerenteGeral; // associação de composição
    private List<Funcionario> funcionarios; // associação de Funcionário

    public FilialImpl(Gerente gerenteGeral, List<Funcionario> funcionarios) {
        this.gerenteGeral = gerenteGeral;
        this.funcionarios = funcionarios;
    }

    @Override
    public void contratarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }
}
