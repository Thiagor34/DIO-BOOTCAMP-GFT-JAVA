package dio.gft.bootcamp;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;

        System.out.print("Gerar Tabuada Nº: ");
        numero = input.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

    }
}
