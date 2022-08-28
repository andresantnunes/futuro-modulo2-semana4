package exercicio5;

import exercicio4.Filial;

import java.util.List;

public class Rede {
    private List<Filial> filiais;
    private String nome;
    private String cnpj;
    private String endereco;

    public Rede(List<Filial> filiais, String nome, String cnpj, String endereco) {
        this.filiais = filiais;
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
    }
}
