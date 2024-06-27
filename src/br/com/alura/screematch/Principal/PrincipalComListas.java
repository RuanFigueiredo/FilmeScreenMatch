package br.com.alura.screematch.Principal;

import br.com.alura.screematch.modelos.Filme;
import br.com.alura.screematch.modelos.Serie;
import br.com.alura.screematch.modelos.Titulo;

import java.sql.SQLOutput;
import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Vingadores, era de Ultron",2015);
        meuFilme.avalia(8);
        Filme outroFilme = new Filme("Homem de Aço",2014);
        outroFilme.avalia(10);
        Filme filmeDoRuan = new Filme("Batman, O cavaleiro das trevas", 2008);
        filmeDoRuan.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoRuan);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for(Titulo item: lista){
            System.out.println(item.getNome());
           if (item instanceof Filme filme){
               System.out.println("Classificação" + filme.getClassificacao());
           }

        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Jonh Travolta");
        buscaPorArtista.add("Scarlett Johansson");
        buscaPorArtista.add("Zac Efrom");
        buscaPorArtista.add("Grazi Massafera");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação: " + buscaPorArtista);

        System.out.println("lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);





    }
}
