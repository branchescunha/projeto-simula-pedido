package entidade;

// Classe que representa o cliente da loja
public class Cliente {
    private String nome;
    private String cpf;
    private boolean inadimplente;

    public Cliente(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
        this.inadimplente = false;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return cpf;
    }

    public boolean isInadimplente() {
        return inadimplente;
    }

    public void mudarInadimplencia() {
        this.inadimplente = !this.inadimplente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "Nome='" + nome + '\'' +
                ", Cpf='" + cpf + '\'' +
                ", Inadimplente=" + inadimplente +
                '}';
    }
}