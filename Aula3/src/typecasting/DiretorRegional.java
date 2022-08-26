package typecasting;

public class DiretorRegional extends Diretor{
    // nome, salario
    private String regiao;

    public void printDiretorRegional(){
        System.out.println("DiretorRegional Nome:"+ super.getNome()
                + "; Salario:" + super.getSalario()
                + "; Regional:" + this.getRegiao()
        );
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }
}
