package controle;

import controle.Vendas;
import entidade.*;
import externo.BancoDeDados;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class VendasTest {

    @BeforeAll
    static void antes() {
        Cliente c = new Cliente("12345678901", "Catarina");
        BancoDeDados.addCliente(c);
        Produto p1 = new Produto("Bolsa Gucci", 15000);
        Produto p2 = new Produto("Vestido Prada (falsificado)", 75);
        BancoDeDados.addProduto(p1);
        BancoDeDados.addProduto(p2);
    }

    @Test
    void venda() {
        Cliente cliente = BancoDeDados.getCliente("12345678901");
        Pedido pedido = new Pedido(cliente);
        Produto iphone = BancoDeDados.getProduto("Bolsa Gucci");
        pedido.adicionarProduto(iphone);
        float valorTotal = iphone.getPreco();
        for (int i = 0; i < 7; i++) {
            Produto kinder = BancoDeDados.getProduto("Vestido Prada (falsificado)");
            pedido.adicionarProduto(kinder);
            valorTotal += kinder.getPreco();
        }
        assertEquals(valorTotal, pedido.calcularValorTotal());
    }
}