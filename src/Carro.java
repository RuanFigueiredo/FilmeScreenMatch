public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibirFichaTecnica(){
        System.out.println(ano);
        System.out.println(cor);
        System.out.println(modelo);
    }

    int CalcularIdadeCarro(int ano){
        return 2024 - ano;
    }
}
