package dio.gft.bootcamp;

import com.sun.source.tree.WhileLoopTree;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
        System.out.println("Crie um conjunto e adicione notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());

        //System.out.println("Exiba a posição da nota 5.0: ");
        //System.out.println("Adicione a nota 8.0 na posição 4: ");
        //System.out.println("Substitua a nota 5.0 por 6.0: ");
        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5.0));
        //System.out.println("Exiba a terceira nota adicionada: ");
        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));
        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma.toString());
        System.out.println("Exiba a media das notas: " + (soma / notas.size()));
        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas.toString());
        //System.out.println("Remova a nota na posição 0: ");
        System.out.println("Remova as notas menores de 7 e exiba a lista: ");
        Iterator<Double> iterator2 = notas.iterator();
        while (iterator2.hasNext()) {
            Double next = iterator2.next();
            if (next < 7 ) {
                iterator2.remove();
            }
        }
        System.out.println(notas.toString());
        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2.toString());
        System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);
        System.out.println("Apague todo o conjunto: ");
        notas.clear();
        System.out.println("Confira se o conjunto esta vazio: " +  notas.isEmpty());

    }
}
