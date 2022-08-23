public class Empregado implements Pessoa{
    private String nome;
    private Integer idade;
    private String cidade;
    private String emprego;

    public Empregado(String nome, Integer idade, String cidade, String emprego) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
        this.emprego = emprego;
    }

    @Override
    public void envelhecer() {
        this.idade++;
    }

    @Override
    public String retornaCidade() {
        return cidade;
    }

    @Override
    public String retornaCidade(String estado) {
        return cidade +";"+estado;
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

    public String getEmprego() {
        return emprego;
    }

    public void setEmprego(String emprego) {
        this.emprego = emprego;
    }
}
