public class Main {
    public static void main(String[] args) throws Exception {

        // erros em tempo de execução
        try { // tentar, tenta executar um código
            // é executado até ter um erro ou acabar o try
            System.out.println("Sucesso");
            String numeroString = "12a";

            // se o erro é encontrado o catch é acionado
            // o erro tem um Tipo e esse tipo é enviado ao Catch com o tipo correspondente
            int numero = Integer.parseInt(numeroString);
            System.out.println("Sucesso2");

        }
        catch (NumberFormatException e){
            System.out.println("Fracasso Numero Formatado Errado"); // sóé executado se houver erro
            System.out.println(e.getMessage());

            throw e;
        }
        //pegar, pega os erros que acontecerem
        // Exception e -> tipo do erro
        // Exception recebe de qualquer erro
        catch (Exception e){
            System.out.println("Fracasso"); // sóé executado se houver erro
            System.out.println(e.getMessage());

            throw e;
        }
    }
}
