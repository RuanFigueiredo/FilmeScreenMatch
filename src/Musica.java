public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    int avaliacoes;
    int numAvaliacoes;


    void exibeFichaTecnica(){
        System.out.println(titulo);
        System.out.println(avaliacoes);
    }

    void avaliarmusica (int avaliacoes){
        numAvaliacoes++;
    }

    double media (){
        return avaliacoes / numAvaliacoes;
    }
}
