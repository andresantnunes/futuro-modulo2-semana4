
//A classe que implementa uma interface
//deve ter todos os métodos dessa interface
public class Adulto implements Pessoa{
    private String nome;
    private Integer idade;
    private String cidade;

    public Adulto(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override // indica que é um método que vem da interface
    public void envelhecer() {
        this.idade++;
    }

    @Override
    public String retornaCidade() {
        return this.cidade;
    }

    @Override
    public String retornaCidade(String estado) {
        return this.cidade +";" + estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
