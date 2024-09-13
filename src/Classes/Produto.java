package Classes;

public class Produto {
    // Declarações de campo de intância
    private String nome;
    private double preco;
    private int qtn_estoque;
    private int numero_item;
    private boolean ativo = true;

    //Inicia novos objetos
    public Produto(String nome, double preco, int qtn_estoque, int numero_item) {
        this.nome = nome;
        this.preco = preco;
        this.qtn_estoque = qtn_estoque;
        this.numero_item = numero_item;
    }
    public Produto() {

    }
    // Getters and Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQtn_estoque() {
        return qtn_estoque;
    }
    public void setQtn_estoque(int qtn_estoque) {
        this.qtn_estoque = qtn_estoque;
    }
    public int getNumero_item() {
        return numero_item;
    }
    public void setNumero_item(int numero_item) {
        this.numero_item = numero_item;
    }
    public boolean isAtivo() {
        return ativo;
    }
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    // Valor do Inventário
    public double getValor_inventario() {
        return preco * qtn_estoque;
    }
    @Override
    public String toString() {
        return  "Informações Produto: "  + '\n' + '|' +
                "Nome do produto: " + nome + '\n' + '|' +
                "Preco do produto: R$ " + preco + '\n' + '|' +
                "Quantidade em estoque: " + qtn_estoque + '\n' + '|' +
                "ID item: " + numero_item + '\n' + '|' +
                "Valor do estoque: " + getValor_inventario() + '\n' + '|' +
                "Status do produto: " + (ativo? "Ativo" : "Inativo") + '\n' + '|' +
                "---------------------------------------------\n" ;
    }
}
