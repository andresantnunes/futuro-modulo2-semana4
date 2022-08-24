package parte2;

public class Pessoa {
    private String nome;
    private Integer idade;
    // Pessoa HAS-A Endereco
    // Endereco IS-PART-OF Pessoa, Endereço é parte de Pessoa
    private Endereco enderecoPessoal;
    private Endereco enderecoTrabalho;

    public Pessoa(String nome, Integer idade, Endereco enderecoPessoal, Endereco enderecoTrabalho) {
        this.nome = nome;
        this.idade = idade;
        this.enderecoPessoal = enderecoPessoal;
        this.enderecoTrabalho = enderecoTrabalho;
    }
}
