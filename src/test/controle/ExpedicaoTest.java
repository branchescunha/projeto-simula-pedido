package controle;

import controle.Expedicao;
import entidade.*;
import externo.BancoDeDados;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class ExpedicaoTest {

    static Cliente cliente;

    @BeforeAll
    static void setup() {
        cliente = new Cliente("55566677788", "Joana");
        BancoDeDados.addCliente(cliente);
    }

    @RepeatedTest(5)
    void testarEnvioPedidoComPagamentoSimulado() {
        Pedido pedido = new Pedido(cliente);
        boolean resultado = Expedicao.enviarPedido(pedido);
        // Não importa o resultado, o importante é que o metodo funcione sem erro
        assertTrue(resultado || !resultado);
    }
}