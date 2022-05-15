package dio.gft.bootcamp;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExercicioQuatro {
    public static void main(String[] args) {

        Set<LinguagemFav> linguagem = new HashSet<>();
        linguagem.add(new LinguagemFav("Java", 1991, "VisualCode"));
        linguagem.add(new LinguagemFav("JavaScript", 1995, "NetBeans"));
        linguagem.add(new LinguagemFav("Python", 1991, "Pycharm"));

        System.out.println("-- Ordem de Inserção --");
        System.out.println(linguagem);
        System.out.println();

        System.out.println("-- Ordem natural (nome) --");
        Set<LinguagemFav> linguagem1 = new TreeSet<>(linguagem);
        for (LinguagemFav ling : linguagem1) {
            System.out.println(ling);;

        }
        System.out.println();

        System.out.println("-- Ordem de IDE --");
        Set<LinguagemFav> linguagem2 = new TreeSet<LinguagemFav>(new ComparatorIde());
        linguagem2.addAll(linguagem);
        for (LinguagemFav ling : linguagem2) {
            System.out.println(ling);
        }
        System.out.println();

        System.out.println("-- Ordem de Ano de Criação e Nome --");
        Set<LinguagemFav> linguagem3 = new TreeSet<LinguagemFav>(new ComparatorAnoNome());
        linguagem3.addAll(linguagem);
        for (LinguagemFav ling : linguagem3) {
            System.out.println(ling);
        }
        System.out.println();

        System.out.println("-- Ordem de Nome / Ano / IDE --");
        Set<LinguagemFav> linguagem4 = new TreeSet<LinguagemFav>(new ComparatorNomeAnoIde());
        linguagem4.addAll(linguagem);
        for (LinguagemFav ling: linguagem4) {
            System.out.println(ling);
        }
    }
}

class LinguagemFav implements Comparable<LinguagemFav> {
    public String nome;
    public int ano;
    public String ide;

    public LinguagemFav(String nome, int ano, String ide) {
        this.nome = nome;
        this.ano = ano;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public int getAno() {
        return ano;
    }

    public String getIde() {
        return ide;
    }

    @Override
    public String toString() {
        return "LinguagemFav{" +
                "nome='" + nome + '\'' +
                ", ano=" + ano +
                ", ide='" + ide + '\'' +
                '}';
    }

    @Override
    public int compareTo(LinguagemFav linguagemFav) {
        return this.nome.compareTo(linguagemFav.nome);
    }
}

class ComparatorIde implements Comparator<LinguagemFav>{

    @Override
    public int compare(LinguagemFav l1, LinguagemFav l2) {
        return l1.ide.compareToIgnoreCase(l2.ide);
    }
}

class ComparatorAnoNome implements Comparator<LinguagemFav>{

    @Override
    public int compare(LinguagemFav l1, LinguagemFav l2) {
        int ano = Integer.compare(l1.ano, l2.ano);
        if (ano != 0) return ano;
        return l1.nome.compareToIgnoreCase(l2.nome);
    }
}

class ComparatorNomeAnoIde implements Comparator<LinguagemFav>{

    @Override
    public int compare(LinguagemFav l1, LinguagemFav l2) {
        int nome = l1.nome.compareToIgnoreCase(l2.nome);
        int ano = Integer.compare(l1.ano, l2.ano);
        if (nome != 0) return nome;
        if (ano != 0) return ano;
        return l1.ide.compareToIgnoreCase(l2.ide);
    }
}

