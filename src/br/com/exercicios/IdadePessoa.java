package br.com.exercicios;

public class IdadePessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificarIdade(){
        if(idade >=18){
            System.out.println("br.com.exercicios.Pessoa maior de idade");
        } else{
            System.out.println("br.com.exercicios.Pessoa menor de idade");
        }
    }
}
