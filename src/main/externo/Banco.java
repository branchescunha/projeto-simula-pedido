package externo;

import entidade.Pedido;

// Classe que simula o pagamento de um pedido
public class Banco {

    // Retorna true se o pedido for pago (simulação aleatória)
    public static boolean foiPago(Pedido pedido) {
        return Math.random() > 0.2;
    }
}