import br.com.alura.screematch.calculadora.CalculadoraDeTempo;
import br.com.alura.screematch.modelos.Filme;
import br.com.alura.screematch.modelos.Serie;

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

    }
}