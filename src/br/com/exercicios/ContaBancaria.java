package br.com.exercicios;

public class ContaBancaria {
    private int numConta;
    private double saldo;
    public String titular;

    public int getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
