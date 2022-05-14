package dio.gft.bootcamp;

import java.util.ArrayList;
import java.util.List;

public class PraticaListUm {
    public static void main(String[] args) {
        System.out.println("Crie uma lista chamada notas2");

        List<Double> notas2 = new ArrayList<Double>();
        notas2.add(7d);
        notas2.add(3.9);
        notas2.add(15d);
        notas2.add(1d);
        notas2.add(25.2);
        notas2.add(13.1);
        notas2.add(0d);
        notas2.add(-1.7);

        System.out.println(notas2);
        System.out.println("Mostre a primeira nota da lista sem removê-la: " + notas2.get(0));
        System.out.println("Mostre a primeira nota da lista removendo-a: " + notas2.remove(0));
        System.out.println(notas2);
    }
}
