package parte3;

public class Main {
    public static void main(String[] args) {
        Festa festa = new AnoNovo();
        festa.comemoracao();
//        festa.getAno();
        System.out.println(festa.getQuantidade());


        festa = new Natal();
        festa.comemoracao();
        System.out.println(festa.getQuantidade());

    }
}
