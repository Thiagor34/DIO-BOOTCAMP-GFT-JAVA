package dio.gft.bootcamp;

import java.util.*;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<String> respostas = new ArrayList<>();

        System.out.print("Telefonou para a Vítima? ");
        respostas.add(input.next().toLowerCase());
        System.out.print("Esteve no local do crime? ");
        respostas.add(input.next().toLowerCase());
        System.out.print("Mora perto da Vítima? ");
        respostas.add(input.next().toLowerCase());
        System.out.print("Devia para a Vítima? ");
        respostas.add(input.next().toLowerCase());
        System.out.print("Já trabalhou para a Vítima? ");
        respostas.add(input.next().toLowerCase());

        System.out.println(respostas);

        int contador = 0;
        Iterator<String> iterator = respostas.iterator();
        while (iterator.hasNext()) {
            String resp = iterator.next();
            if (resp.contains("s")){
                contador++;
            }
        }
        switch (contador) {
            case 2:
                System.out.println("Suspeita");
                break;
            case 3, 4:
                System.out.println("Cúmplice");
                break;
            case 5:
                System.out.println("Assasina");
                break;
            default:
                System.out.println("Inocente");
                break;
        }
    }
}

class Respostas {
    String resposta;
}