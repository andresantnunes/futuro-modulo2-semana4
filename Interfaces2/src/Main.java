import funcionario.*;
import pessoa.Adulto;
import pessoa.Empregado;
import pessoa.Pessoa;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Diretor();
        System.out.println(funcionario.receberSalario(12));
        funcionario = new Programador();
        System.out.println(funcionario.receberSalario(12));
        funcionario = new Faxineiro();
        System.out.println(funcionario.receberSalario(12));
        funcionario = new Secretario();
        System.out.println(funcionario.receberSalario(12));

        funcionario = new DiretorRegional();
        System.out.println(funcionario.receberSalario(12));
    }
}
