package typecasting;

import java.util.ArrayList;
import java.util.List;

public class Typecasting {
    public static void main(String[] args) {
        // Upcasting
        // podemos colocar qualquer DiretorRegional dentro de Diretor
        // Diretor é pai e define os métodos de diretor,
        // DiretorRegional é o filho e define o espaço na memória
        Diretor diretor = new DiretorRegional(); //Implicito

        // diretor1 é do tipo Diretor,
        // porém como ele foi criado com Upcasting podemos realizar o Downcasting
        Diretor diretor1 = new DiretorRegional();

        diretor1.setNome("Gelson");
        diretor1.setSalario(10000.12d);
        System.out.println(diretor1);

        //diretor1 e diretor tem a mesma referencia
        //diretor1 não consegue acessar regiao sem o Casting para diretorRegional
        DiretorRegional diretorRegional = (DiretorRegional) diretor1; //Explicito

        diretorRegional.setRegiao("São Paulo");
        System.out.println("DiretorRegional Nome:"+diretorRegional.getNome()
                + "; Salario:" + diretorRegional.getSalario()
                + "; Regional:" + diretorRegional.getRegiao()
        );

        System.out.println("DiretorRegional Nome:"+diretor1.getNome()
                + "; Salario:" + diretor1.getSalario()
                + "; Regional:" + ((DiretorRegional) diretor1).getRegiao()
        );

        System.out.println(diretor1);
        System.out.println(diretorRegional);

        List<String> lista = new ArrayList<>();
        ArrayList<String> arrayList = (ArrayList<String>) lista;
    }
}
