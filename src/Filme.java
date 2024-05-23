public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double avaliacao;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void exibeFichaTecnica(){
        System.out.println("O nome do filme é: " + nome);
        System.out.println("e  o ano de lançamento é: " + anoDeLancamento);
        System.out.println("tem duração de : " + duracaoEmMinutos + "minutos");
    }
}
