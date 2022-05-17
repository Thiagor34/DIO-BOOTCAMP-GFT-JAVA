package dio.gft.bootcamp;

import java.sql.SQLOutput;
import java.util.*;

public class ExercicioSeis {
    public static void main(String[] args) {
        int qtdLancamentos = 100;

        List<Integer> valores = new ArrayList<>();
        Random lancamento = new Random();
        for (int vezes = 0; vezes < qtdLancamentos; vezes++){
            int numero = lancamento.nextInt(6) + 1;
            valores.add(numero);
        }

        Map<Integer, Integer> lancamentos = new HashMap<>();
        for (Integer resultado : valores) {
            if (lancamentos.containsKey(resultado)){
                lancamentos.put(resultado, (lancamentos.get(resultado) + 1));
            } else {
                lancamentos.put(resultado, 1);
            }

            System.out.println("Jogando o dado: ");
            for (int i = 0; i < 3; i++) {
                try {
                    Thread.sleep(3000);
                    System.out.print(".");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("\nValor " + "Quantidade de vezes");
            for (Map.Entry<Integer, Integer> entry : lancamentos.entrySet()) {
                System.out.printf("%3d %10d\n", entry.getKey(), entry.getValue());
            }
        }


    }
}
