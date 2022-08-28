package exercicio4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ClienteVip clienteVip = new ClienteVip(12d,.2, 1);
//        ClienteVip clienteVip = new ClienteVip(100d,.2);
        System.out.println(clienteVip.getSaldo());

        VendedorImpl vendedor = new VendedorImpl(
                clienteVip,
                new ArrayList<>(),
                1000d
        );

        vendedor.retornaDescontoClienteVip();

    }
}
