public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Adulto("adulto",41);
        pessoa.envelhecer();
        pessoa.retornaCidade();
        pessoa.retornaCidade("são paulo");

        // pessoa não tem acesso aos getters e setter de Adulto
        // apenas utilizo os métodos como @Override

        Adulto adulto = new Adulto("adulto2", 32);

        adulto.getCidade();
        adulto.envelhecer();
        adulto.retornaCidade();

        pessoa = new Empregado("empregado", 21, "são paulo", "Garoto de progrador(programador)");

        pessoa.envelhecer();
        pessoa.retornaCidade();
        pessoa.retornaCidade("sp");

    }
}
