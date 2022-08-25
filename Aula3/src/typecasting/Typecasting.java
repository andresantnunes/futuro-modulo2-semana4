package typecasting;

public class Typecasting {
    public static void main(String[] args) {
        // Upcasting
        // podemos colocar qualquer DiretorRegional dentro de Diretor
        // Diretor é pai de DiretorRegional
        Diretor diretor = new DiretorRegional(); //Implicito

        // diretor1 é do tipo Diretor,
        // porém como ele foi criado com Upcasting podemos realizar o Downcasting
        Diretor diretor1 = new DiretorRegional();
        DiretorRegional diretorRegional = (DiretorRegional) diretor1; //Explicito

    }
}
