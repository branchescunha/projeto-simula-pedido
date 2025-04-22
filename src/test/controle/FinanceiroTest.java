package controle;

import controle.Financeiro;
import entidade.*;
import externo.BancoDeDados;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class FinanceiroTest {

    static Cliente cliente;

    @BeforeAll
    static void setup() {
        cliente = new Cliente("13579024680", "Felipe");
        BancoDeDados.addCliente(cliente);
    }

    @Test
    void clienteAdimplente() {
        Pedido pedido = new Pedido(cliente);
        assertTrue(Financeiro.verificarPagamento(pedido));
    }

    @Test
    void clienteInadimplente() {
        cliente.mudarInadimplencia();
        Pedido pedido = new Pedido(cliente);
        assertFalse(Financeiro.verificarPagamento(pedido));
    }
}