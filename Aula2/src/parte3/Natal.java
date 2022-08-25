package parte3;

public class Natal implements Festa{

    private Double quilos = 60d;

    @Override
    public void comemoracao() {
        quilos+=10;
        System.out.println("Feliz Natal!!");
    }

    public void comemoracao2() {
        System.out.println("Feliz Natal!!");
    }

    @Override
    public Double getQuantidade() {
        return quilos;
    }

    public Double getQuilos() {
        return quilos;
    }

    public void setQuilos(Double quilos) {
        this.quilos = quilos;
    }
}
