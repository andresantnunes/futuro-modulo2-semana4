public class WhileCatch {
    public static void main(String[] args) throws Exception{
        int i = 0;
        while (i<10){
            try {
                i++;

                String numeroString = "12a";
                int numero = Integer.parseInt(numeroString);
            }
            catch (Exception e){
                System.out.println("Falhou");
                throw e;
            }
        }
    }
}
