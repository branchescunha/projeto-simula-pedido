package controle;

import entidade.Pedido;

// Classe de vendas responsável por processar o pedido
public class Vendas {

    // Retorna o valor total do pedido
    public static float venda(Pedido pedido) {
        System.out.println(pedido); // Imprime o pedido
        return pedido.calcularValorTotal(); // Retorna valor total
    }
}