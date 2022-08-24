import empresa.Empresa;
import funcionario.*;
import pessoa.Adulto;
import pessoa.Empregado;
import pessoa.Pessoa;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        Funcionario funcionario = new Diretor();
        System.out.println("Diretor");
        System.out.println(funcionario.receberSalario(12));
        System.out.println(empresa.contrataFuncionario(funcionario));

        funcionario = new Programador();
        System.out.println("Programador");
        System.out.println(funcionario.receberSalario(12));
        System.out.println(empresa.contrataFuncionario(funcionario));

        funcionario = new Faxineiro();
        System.out.println("Faxineiro");
        System.out.println(funcionario.receberSalario(12));
        System.out.println(empresa.contrataFuncionario(funcionario));

        funcionario = new Secretario();
        System.out.println("Secretario");
        System.out.println(funcionario.receberSalario(12));
        System.out.println(empresa.contrataFuncionario(funcionario));

        funcionario = new DiretorRegional();
        System.out.println("DiretorRegional");
        System.out.println(funcionario.receberSalario(12));
        System.out.println(empresa.contrataFuncionario(funcionario));

    }
}
