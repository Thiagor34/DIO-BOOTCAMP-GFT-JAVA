package dio.gft.bootcamp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<Double>();
        int contador = 0;
        while (true) {
            if (contador == 6) {
                break;
            }
            System.out.print("Digite a temperatura: ");
            double temperatura = input.nextDouble();
            temperaturas.add(temperatura);
            contador++;
        }
        System.out.println();
        System.out.println("Temperaturas: " + temperaturas);

        Iterator<Double> iterator = temperaturas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma das temperaturas: " + soma);

        Double media = soma / temperaturas.size();
        System.out.println("Media das temperaturas: " +media);

        Iterator<Double> iterator2 = temperaturas.iterator();
        contador = 0;

        while (iterator2.hasNext()) {
            Double temp = iterator2.next();
            if (temp > media) {
                switch (contador) {
                    case 0:
                        System.out.println("1 - Janeiro: " + temp);
                        break;
                    case 1:
                        System.out.println("2 - Fevereiro: " + temp);
                        break;
                    case 2:
                        System.out.println("3 - Março: " + temp);
                        break;
                    case 3:
                        System.out.println("4 - Abril: " + temp);
                        break;
                    case 4:
                        System.out.println("5 - Maio: " + temp);
                        break;
                    case 5:
                        System.out.println("6 - Junho: " + temp);
                        break;
                }
            }
            contador++;
        }
    }
}



