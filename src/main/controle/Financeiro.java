package controle;

import entidade.Pedido;
import entidade.Cliente;

// Classe que representa o departamento financeiro
public class Financeiro {

    // Verifica se o cliente pode realizar o pagamento
    public static boolean verificarPagamento(Pedido pedido) {
        Cliente cliente = pedido.getCliente();

        // Se estiver inadimplente, bloqueia
        if (cliente.isInadimplente()) {
            System.out.println("O cliente está inadimplente: " + cliente.getNome());
            return false;
        }

        return true;
    }
}