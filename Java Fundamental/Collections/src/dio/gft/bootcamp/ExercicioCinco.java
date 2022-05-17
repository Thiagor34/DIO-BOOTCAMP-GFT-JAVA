package dio.gft.bootcamp;

import java.util.*;

public class ExercicioCinco {
    public static void main(String[] args) {
        Map<String, Integer> estados = new HashMap<>(){{
           put("PE", 9616621);
           put("AL", 3351543);
           put("CE", 9187103);
           put("RN", 3534265);
        }};
        System.out.println(estados.toString());
        System.out.println();

        System.out.println("Substitua população do RN: ");
        estados.put("RN", 3534165);
        System.out.println(estados.toString());
        System.out.println();

        System.out.println("O Estado do PB está no dicionário? " + estados.containsKey("PB"));
        System.out.println();

        System.out.println("Adicionando PB: ");
        Map<String, Integer> estados1 = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
            put("PB", 4039277);
        }};
        System.out.println(estados1.toString());

        System.out.println("Exiba a população de PE: " + estados1.get("PE"));
        System.out.println();

        System.out.println("Exiba todos os Estados na Ordem informada: ");
        Map<String, Integer> estados2 = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
            put("PB", 4039277);
        }};
        for (Map.Entry<String, Integer> estado : estados2.entrySet()) {
            System.out.println(estado.getKey() + " - " + estado.getValue());
        }
        System.out.println();

        System.out.println("Estados em ordem alfabética:");
        Map<String, Integer> estado3 = new TreeMap<>(estados2);
        System.out.println(estado3);

        System.out.println();

        Collection<Integer> populacao = estados1.values();
        String estadoMaiorPopulacao = "";
        String estadoMenorPopulacao = "";
        for (Map.Entry<String, Integer> entry : estados1.entrySet()) {
            if (entry.getValue().equals(Collections.max(populacao))){
                estadoMaiorPopulacao = entry.getKey();
            }
            if (entry.getValue().equals(Collections.min(populacao))) {
                estadoMenorPopulacao = entry.getKey();
            }
        }
        System.out.printf("Exiba o estado com o menor população (%s) e seu respectivo valor (%d)\n",
                estadoMenorPopulacao, Collections.min(populacao));
        System.out.printf("Exiba o estado com a maior população (%s) e seu respectivo valor (%d)\n",
                estadoMaiorPopulacao, Collections.max(populacao));

        System.out.println("Exiba a soma da população dos estados: ");
        int soma = 0;
        Iterator<Integer> iterator = estados2.values().iterator();
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("Soma das Populações: " + soma);
        System.out.println();

        System.out.println("Exiba a média da população : " + (soma / estados2.size() ));
        System.out.println();

        System.out.println("Remova os Estados com população menor que 4.000.000: ");
        Iterator <Integer> iterator1 = estados2.values().iterator();
        while (iterator1.hasNext()){
        if (iterator1.next() <= 4000000) {
            iterator1.remove();
        }
        }
        System.out.println(estados2);

        System.out.println("Apague o dicionário:" );
        estados2.clear();

        System.out.println("Verificar lista: ");
        estados.isEmpty();
        System.out.println(estados2);
    }
}

