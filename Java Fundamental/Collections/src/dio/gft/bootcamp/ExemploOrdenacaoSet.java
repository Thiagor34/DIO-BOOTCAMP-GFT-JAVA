package dio.gft.bootcamp;

import java.util.*;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {

        System.out.println("Ordem aleatória: ");
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
        }};
        for (Serie serie : minhasSeries) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }
        System.out.println();

        System.out.println("Ordem de inserção: ");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
        }};
        for (Serie serie : minhasSeries1) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }
        System.out.println();

        System.out.println("Ordem de natural (tempo episódio): ");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Serie serie : minhasSeries2) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println();

        System.out.println("Ordem de Nome/Genero/Tempo: ");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGenetoTempo());
        minhasSeries3.addAll(minhasSeries);
        for (Serie serie : minhasSeries3) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }



    }
}

class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        if (tempoEpisodio != 0) {
            return tempoEpisodio;
        }
        return Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
    }
}

class ComparatorNomeGenetoTempo implements Comparator<Serie> {

    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0) {
            return nome;
        }
        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero != 0) {
            return genero;
        }
        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }
}