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
        cliente = new Cliente("11122233344", "Carlos");
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