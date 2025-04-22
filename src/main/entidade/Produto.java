package entidade;

// Classe que representa um produto
public class Produto {
    private String nome;
    private float preco;

    public Produto(String nome, float preco) {
        if (nome.isBlank()) {
            throw new IllegalArgumentException("Precisa-se de um nome no produto!");
        }
        if (preco < 0.01f) {
            throw new IllegalArgumentException("O valor do produto deve ser superior a 1 centavo!");
        }
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() { return nome; }
    public float getPreco() { return preco; }

    public void setPreco(float preco) {
        if (preco < 0.01f) {
            throw new IllegalArgumentException("O valor do produto deve ser superior a 1 centavo!");
        }
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + "\nPreco: R$ " + preco;
    }
}