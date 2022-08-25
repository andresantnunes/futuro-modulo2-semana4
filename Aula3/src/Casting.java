import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Casting {
    public static void main(String[] args) {
//        ArrayList<String> arrayList = new ArrayList<>(); // classe que herda de List
//        List<String> list = arrayList; // ArrayList pode ser usado para criar uma List


        // Widening
        // int, 4 bytes ->  -2.147.483.648 até 2.147.483.647
        int numero = 10;
//        System.out.println(numero);

        // double 8 bytes, 4 antes da virgula e 4 depois da virgula
        // o Java já sabe o que fazer quando fazer um Casting Widening
        double doubleNumero = numero; //Casting implicito
//        System.out.println(doubleNumero);

        long numeroLong = numero;
//        System.out.println(numeroLong);

        float numeroFloat = numero;
//        System.out.println(numeroFloat);

        // -------------------------------------------------

        //Narrowing

        double doubleNumero2 = 10.10;
//        System.out.println(doubleNumero2);

        //trunca(truncate) o dado, remove tudo o que está após a virgula
        int numeroInt = (int) doubleNumero2; // precisa ser explicito
//        System.out.println(numeroInt);

        //--------------------------------------------------------

        //Casting String

        String numeroString = "120";
        System.out.println(numeroString);

        // .parseInt realiza o Casting da String para Integer
        int numeroInt2 = Integer.parseInt(numeroString);
        System.out.println(numeroInt2);

        numeroString = "120.120";
        double numeroDouble = Double.parseDouble(numeroString);
        System.out.println(numeroDouble);


    }
}
