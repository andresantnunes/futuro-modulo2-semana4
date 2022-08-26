import java.util.InputMismatchException;
import java.util.Scanner;

public class TrataErro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        try{
            int numero = scanner.nextInt();

            System.out.println(numero);

            String numeroString = "12a";
            numero = Integer.parseInt(numeroString);
            System.out.println(numero);

        }
        catch (InputMismatchException e){
            System.out.println("Valor não é um número válido");
            throw e;
        }
        catch (Exception e){
            System.out.println("Erro qualquer");
            throw e;
        }

    }
}
