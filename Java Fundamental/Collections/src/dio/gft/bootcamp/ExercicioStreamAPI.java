package dio.gft.bootcamp;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.*;
import java.util.stream.Collectors;

public class ExercicioStreamAPI {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprima todos os elementos dessa lista de String: ");
        numerosAleatorios.forEach(System.out::print);

        System.out.println("Pegue os 5 primeiros e coloque dentro de um Set: ");
        numerosAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::print);

        System.out.println("Transforme a lista de String em uma lista de Inteiros: ");
        List<Integer> collectList = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println("Pegue os números pares maiores que 2 e coloque em uma lista: ");
        List<Integer> listaPares = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> (i % 2 == 0 && i > 2))
                .collect(Collectors.toList());
        System.out.println(listaPares);

        System.out.println("Mostre a média dos números: ");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("Remova os númers impares: ");
        List<Integer> numerosImpares = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        numerosImpares.removeIf(integer -> integer % 2 != 0);
        System.out.println(numerosImpares);
    }
}
