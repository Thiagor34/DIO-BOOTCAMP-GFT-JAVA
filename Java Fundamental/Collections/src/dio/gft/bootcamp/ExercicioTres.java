package dio.gft.bootcamp;

import java.util.*;

public class ExercicioTres {
    public static void main(String[] args) {
        Set<String> arcoIris = new HashSet<>();
        arcoIris.add("verde");
        arcoIris.add("azul");
        arcoIris.add("amarelo");
        arcoIris.add("vermelho");
        arcoIris.add("laranja");
        arcoIris.add("anil");
        arcoIris.add("violeta");
        System.out.println(arcoIris);

        System.out.println("-- Exiba todas as cores uma abaixo da outra: --");
        for (String cores: arcoIris ) {
            System.out.println(cores);

        }

        System.out.println("-- A quantidade de cores que o arco-íris tem: --" + arcoIris.size() + " cores");

        System.out.println("-- Exiba as cores em ordem alfabética: --");
        Set<String> arcoIris1 = new TreeSet<>(arcoIris);
        System.out.println(arcoIris1);

        System.out.println("-- Exiba as cores em ordem inversa: --");
        Set<String> arcoIris2 = new LinkedHashSet<>(arcoIris);
        System.out.println(arcoIris2);
        List<String> arcoIrisLista = new ArrayList<>(arcoIris2);
        Collections.reverse(arcoIrisLista);
        System.out.println(arcoIrisLista);

        System.out.println("-- Exiba todas as cores que começam com a letra V: --");
        for (String cores: arcoIris ) {
            if (cores.startsWith("v")) {
                System.out.println(cores);
            }
        }
        System.out.println("-- Remova todas as cores que começam com a letra V: --");
        Iterator<String> iterator = arcoIris.iterator();
        while (iterator.hasNext()){
            if (iterator.next().startsWith("v")) {
                iterator.remove();
            }
        }
        System.out.println(arcoIris);

        System.out.println("-- Limpa o Conjunto: --");
        arcoIris.clear();
        System.out.println(arcoIris);

    }
}
