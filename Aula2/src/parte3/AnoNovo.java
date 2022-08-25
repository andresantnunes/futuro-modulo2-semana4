package parte3;

//AnoNovo IS-A Festa
public class AnoNovo implements Festa{
    // atributo privado do AnoNovo
    //apenas existe para as instâncias de AnoNovo
    private Integer ano=0;

    //Construtores
    public AnoNovo(Integer ano) {
        this.ano = ano;
    }

    public AnoNovo() {
    }

    // implementação dos métodos de Festa
    @Override
    public void comemoracao() {
        ano++;
        System.out.println("Feliz Ano Novo!!");
    }

    @Override
    public Double getQuantidade() {
        return ano.doubleValue();
    }

    // getter e setters
    public Integer getAno() {
        return ano;
    }


}
