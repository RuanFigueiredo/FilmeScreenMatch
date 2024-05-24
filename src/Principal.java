import br.com.alura.screematch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.setNome( "Vingadores - Era de Ultron");
        meuFilme.setAnoDeLancamento(2015);
        meuFilme.setDuracaoEmMinutos(120);

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(10);
        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());




    }
}