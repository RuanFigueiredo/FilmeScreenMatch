import br.com.alura.screematch.calculadora.CalculadoraDeTempo;
import br.com.alura.screematch.calculadora.FiltroRecomendacao;
import br.com.alura.screematch.modelos.Episodio;
import br.com.alura.screematch.modelos.Filme;
import br.com.alura.screematch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.setNome( "Vingadores - Era de Ultron");
        meuFilme.setAnoDeLancamento(2015);
        meuFilme.setDuracaoEmMinutos(120);
        System.out.println("duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(10);
        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie();

        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(12);
        lost.setEpisodioPorTemporada(15);
        lost.setMinutosPorEpisodio(50);

        System.out.println("Duração em minutos para maratonar lost: " +lost.getDuracaoEmMinutos() + " minutos");

        Filme outroFilme = new Filme();
        outroFilme.setNome( "Homem de Aço");
        outroFilme.setAnoDeLancamento(2014);
        outroFilme.setDuracaoEmMinutos(125);
        System.out.println("A duração desse segundo filme é : " + outroFilme.getDuracaoEmMinutos());
        outroFilme.exibeFichaTecnica();

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println("Duração total do filme é..." + calculadora.getTempoTotal() + " minutos! ");


        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualisacoes(350);

        filtro.filtra(episodio);

        Filme filmeDoRuan = new Filme();
        filmeDoRuan.setDuracaoEmMinutos(120);
        filmeDoRuan.setNome("Batman, o cavaleiro das trevas");
        filmeDoRuan.setAnoDeLancamento(2008);
        filmeDoRuan.avalia(9);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoRuan);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("primeiro filme: " + listaDeFilmes.get(0).getNome());

        System.out.println(listaDeFilmes);
    }
}