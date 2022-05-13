package dio.gft.bootcamp;

import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;
        int maior = 0;
        double soma = 0;
        int contador = 0;

        do{
            System.out.print("Digite o Número: ");
            numero = input.nextInt();
            if (numero > maior) {
                maior = numero;
            }
            soma += numero;
            contador++;
        } while (contador < 5);

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + (soma/contador));
    }
}
