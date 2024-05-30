package br.com.exercicios.basicospoo;

public class ModeloCarro  extends Carru{

    public static void main(String[] args) {
        Carru carro1 = new ModeloCarro();

        carro1.setModelo("WV-gol");
        carro1.setAno(1998);
        carro1.setPrecoMenor(10000);
        carro1.setPrecoMaior(15000);

        System.out.println("modelo: " + carro1.getModelo() + " ano do carro: " + carro1.getAno() + " preço: "+ carro1.getPrecoMaior());
    }


}
