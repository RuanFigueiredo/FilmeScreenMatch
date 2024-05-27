package br.com.exercicios;

public class Produto {
    private String nome;
    private double preco;

    private double precoNovo;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void aplicarDesconto(double percentual){
        double desconto = preco *(percentual/100);
        preco-=desconto;
    }
}
