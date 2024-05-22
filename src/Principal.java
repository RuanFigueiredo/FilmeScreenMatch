
public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.nome = "Vingadores - Era de Ultron";
        meuFilme.anoDeLancamento = 2015;
        meuFilme.duracaoEmMinutos = 130;

        System.out.println(meuFilme.nome);
        System.out.println(meuFilme.anoDeLancamento);
        System.out.println(meuFilme.duracaoEmMinutos);

    }
}