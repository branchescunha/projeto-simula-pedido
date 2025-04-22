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
            System.out.println("O pagamento não foi identificado. O pedido não foi enviado... :(");
            return false;
        }

        // Se foi pago, simula envio
        System.out.println("O pedido foi enviado com sucesso... ;)");
        return true;
    }
}