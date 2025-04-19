package controle;

import entidade.Pedido;
import externo.Banco;

// Classe que representa o departamento de expedição
public class Expedicao {

    // Metodo que tenta enviar o pedido
    public static boolean enviarPedido(Pedido pedido) {
        // Verifica se o pedido foi pago
        boolean pago = Banco.foiPago(pedido);

        // Se não foi pago, não envia
        if (!pago) {
            System.out.println("Pagamento não identificado. Pedido não enviado.");
            return false;
        }

        // Se foi pago, simula envio
        System.out.println("Pedido enviado com sucesso!");
        return true;
    }
}