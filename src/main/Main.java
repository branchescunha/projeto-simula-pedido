import controle.*;
import entidade.*;
import externo.*;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("12345678901", "Maria");
        Produto notebook = new Produto("Notebook", 3500);
        Produto mouse = new Produto("Mouse", 150);

        BancoDeDados.addCliente(cliente);
        BancoDeDados.addProduto(notebook);
        BancoDeDados.addProduto(mouse);

        Pedido pedido = new Pedido(cliente);
        pedido.adicionarProduto(notebook);
        pedido.adicionarProduto(mouse);

        Vendas.venda(pedido);

        if (!Financeiro.verificarPagamento(pedido)) {
            System.out.println("Cliente inadimplente. Pedido cancelado.");
            return;
        }

        boolean enviado = Expedicao.enviarPedido(pedido);
        if (enviado) {
            System.out.println("Pedido finalizado com sucesso.");
        } else {
            System.out.println("Falha na expedição. Pedido não finalizado.");
        }
    }
}