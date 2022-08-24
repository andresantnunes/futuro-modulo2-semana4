package empresa;

import funcionario.DiretorRegional;
import funcionario.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Funcionario> funcionarios = new ArrayList<>();
    private DiretorRegional diretorRegional;

    public List<Funcionario> contrataFuncionario(Funcionario funcionario){
        this.funcionarios.add(funcionario);
        return this.funcionarios;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public DiretorRegional getDiretorRegional() {
        return diretorRegional;
    }

    public void setDiretorRegional(DiretorRegional diretorRegional) {
        this.diretorRegional = diretorRegional;
    }
}
