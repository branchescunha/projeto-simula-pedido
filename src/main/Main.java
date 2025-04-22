import controle.*;
import entidade.*;
import externo.*;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("07007840124", "André");
        Produto notebook = new Produto("Iphone", 4500);
        Produto mouse = new Produto("Air Pods", 750);

        BancoDeDados.addCliente(cliente);
        BancoDeDados.addProduto(notebook);
        BancoDeDados.addProduto(mouse);

        Pedido pedido = new Pedido(cliente);
        pedido.adicionarProduto(notebook);
        pedido.adicionarProduto(mouse);

        Vendas.venda(pedido);

        if (!Financeiro.verificarPagamento(pedido)) {
            System.out.println("O cliente está inadimplente. O pedido foi cancelado... :(");
            return;
        }

        boolean enviado = Expedicao.enviarPedido(pedido);
        if (enviado) {
            System.out.println("O pedido foi finalizado com sucesso... ;)");
        } else {
            System.out.println("Houve uma falha na expedição. O pedido não foi finalizado... :(");
        }
    }
}