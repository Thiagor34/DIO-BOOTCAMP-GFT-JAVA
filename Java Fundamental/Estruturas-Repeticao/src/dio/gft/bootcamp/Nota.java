package dio.gft.bootcamp;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println("Insira nota (entre 0 e 10): ");
            int nota = input.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("Valor inválido");
            } else {
                break;
            }
        }
        System.out.println("Encerrando");

    }
}
